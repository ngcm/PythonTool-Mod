package pycraft.computerblock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.filefilter.WildcardFileFilter;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pycraft.PyCraft;


/**
 * ----------- PyCraft Mod -----------
 * Alvaro Perez & Hans Fangohr
 * University of Southampton, UK (2016)
 *
 * Code based on MinecraftByExample by TheGreyGhost: MBE30_INVENTORY_BASIC
 * https://github.com/TheGreyGhost/MinecraftByExample/tree/1-8final
 * (mbe30_inventory_basic/BlockInventoryBasic.java)
 *
 * Original code by:
 * User: brandon3055
 * Date: 06/01/2015
 * 
 * ComputerBlock is a simple inventory capable of storing 36 item stacks. It will create a tile entity when placed
 * and open a gui when right clicked. It will then look for suitable python scripts in the given folder, and fill the
 * inventory with an ItemScript for each .py script file. This ItemScripts can be placed in the player's inventory for
 * later use. The actual storage is handled by the tile entity.
 */

public class ComputerBlock extends BlockContainer
{
	public ComputerBlock()
	{
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);     // the block will appear on the Blocks tab.
		//		this.setBlockBounds(1/16.0F, 0, 1/16.0F, 15/16.0F, 8/16.0F, 15/16.0F);
	}

	// Called when the block is placed or loaded client side to get the tile entity for the block
	// Should return a new instance of the tile entity for the block
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityComputerBlock();
	}

	// Called when the block is right clicked
	// In this block it is used to open the blocks gui when right clicked by a player
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
		// Obtain the tile entity associated with the block using its position
		// http://www.minecraftforge.net/forum/index.php?topic=29934.0
		// then cast to our custom TileEntityInventoryBasic
		TileEntity te = worldIn.getTileEntity(pos);
		TileEntityComputerBlock tileEntityComputerBlock = (TileEntityComputerBlock) te;
		// Find files in the given folder (mcpipy library folder by now)
		File dir = new File(System.getProperty("user.home") + "/Library/Application Support/minecraft/mcpipy");
		// Suitable files must be of the form test_*.py
		FileFilter fileFilter = new WildcardFileFilter("test_*.py");
		File[] files = dir.listFiles(fileFilter);
		// Clear all the slots before refilling
		tileEntityComputerBlock.clear();
		// Refill checking the existing python scripts 
		for (int i = 0; i < files.length; i++) {
			// Find metadata (script type, if any)
			// The first line in the .py file must be '# metadata'
			int metadata = 0;
			File tempFile = files[i]; 
			// Try to obtain the metadata, if any
			BufferedReader br;
			try
			{
				br = new BufferedReader(new FileReader(tempFile));
				String sCurrentLine;
				sCurrentLine = br.readLine();
				if ((sCurrentLine.length() > 11) && (sCurrentLine.substring(0, 10).equals("# metadata"))) {
					try {
						String metadataTemp = "" + sCurrentLine.substring(11, sCurrentLine.length());
						metadata = Integer.parseInt(metadataTemp);
					}
					catch (NumberFormatException e) {
						System.out.println("NOT VALID METADATA: not an integer, see code comments for details.");
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			// If any metadata is present, use it, otherwise, set it to 0 (default scriptItem)
			if (metadata < 0 || metadata > 2) {
				System.out.println("METADATA NOT A VALID INTEGER: see code comments for details.");
				metadata = 0;
			}

			ItemStack newItemStack = new ItemStack(pycraft.scriptitem.StartupCommon.scriptItem, 1, metadata);
			// Get NBT data from the created item
			NBTTagCompound nbtTagCompound = newItemStack.getTagCompound();
			if (nbtTagCompound == null) {
				nbtTagCompound = new NBTTagCompound();
				newItemStack.setTagCompound(nbtTagCompound);
			}
			// Save the script's path in "scriptName" key in the NBT compound
			String pathString = tempFile.toString();
			String[] nameList = pathString.split("\\/");
			String nameString = nameList[nameList.length - 1].substring(0, nameList[nameList.length - 1].length() - 3);
			nbtTagCompound.setString("scriptName", nameString);
			// Place it in the computer block's inventory
			tileEntityComputerBlock.setInventorySlotContents(i, newItemStack);
		}

		// Uses the gui handler registered to your mod to open the gui for the given gui id
		// open on the server side only  (not sure why you shouldn't open client side too... vanilla doesn't, so we better not either)
		if (worldIn.isRemote) return true;

		playerIn.openGui(PyCraft.instance, GuiHandlerComputerBlock.getGuiID(), worldIn, pos.getX(), pos.getY(), pos.getZ());
		return true;
	}

	// This is where you can do something when the block is broken. In this case drop the inventory's contents
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		// If not in creative mode: survival, etc. break and drop the block itself
		if (!Minecraft.getMinecraft().thePlayer.capabilities.isCreativeMode) {
			// Make the block drop itself 
			ItemStack itemTemp = new ItemStack(pycraft.computerblock.StartupCommon.computerBlock, 1);
			EntityItem item = new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
					itemTemp);
			// Give it a random drop speed
			float multiplier = 0.1f;
			float motionX = worldIn.rand.nextFloat() - 0.5f;
			float motionY = worldIn.rand.nextFloat() - 0.5f;
			float motionZ = worldIn.rand.nextFloat() - 0.5f;
			item.motionX = motionX * multiplier;
			item.motionY = motionY * multiplier;
			item.motionZ = motionZ * multiplier;
			// Spawn the item in the world
			worldIn.spawnEntityInWorld(item);
			// Super MUST be called last because it removes the tile entity
			super.breakBlock(worldIn, pos, state);
		} else {
			// If in creative mode, don't drop the block
			super.breakBlock(worldIn, pos, state);
		}
	}

	//---------------------------------------------------------

	// the block will render in the SOLID layer.  See http://greyminecraftcoder.blogspot.co.at/2014/12/block-rendering-18.html for more information.
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.SOLID;
	}

	// used by the renderer to control lighting and visibility of other blocks.
	// set to false because this block doesn't fill the entire 1x1x1 space
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	// used by the renderer to control lighting and visibility of other blocks, also by
	// (eg) wall or fence to control whether the fence joins itself to this block
	// set to true because this block fills the entire 1x1x1 space
	@Override
	public boolean isFullCube() {
		return true;
	}

	// render using a BakedModel
	// not strictly required because the default (super method) is 3.
	@Override
	public int getRenderType() {
		return 3;
	}

	//---------------------------------------------------------
	// Make sure the block is rendered facing the player
	
	public static final PropertyDirection PROPERTYFACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	@Override
	protected BlockState createBlockState()
	{
		return new BlockState(this, new IProperty[] {PROPERTYFACING});
	}

	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing blockFaceClickedOn, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
		// find the quadrant the player is facing
		EnumFacing enumfacing = (placer == null) ? EnumFacing.NORTH : EnumFacing.fromAngle(placer.rotationYaw);
		return this.getDefaultState().withProperty(PROPERTYFACING, enumfacing);
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		EnumFacing facing = EnumFacing.getHorizontal(meta);
		return this.getDefaultState().withProperty(PROPERTYFACING, facing);
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		EnumFacing facing = (EnumFacing)state.getValue(PROPERTYFACING);
		int facingbits = facing.getHorizontalIndex();
		return facingbits;
	}

}
