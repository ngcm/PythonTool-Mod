package pythontool.computerblock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.WildcardFileFilter;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pythontool.PythonTool;


/**
 * ----------- PythonTool Mod -----------
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

public class ComputerBlock extends Block
{
	public ComputerBlock()
	{
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabMisc);     // the block will appear on the Creative tab.
	}

	// Called when the block is placed or loaded client side to get the tile entity for the block
	// Should return a new instance of the tile entity for the block
	@Override
	public TileEntity createTileEntity(World worldIn, IBlockState state) {
		return new TileEntityComputerBlock();
	}

	@Override
    public boolean hasTileEntity(IBlockState state)
    {
        return true;
    }
	
	public int getMetadataFromScriptItem(File scriptFile) {
		/**
		 * Obtain the metadata (if any) from the script file and return it.
		 * Currently, this is achieved by adding the code
		 * # metadata NUMBER
		 * as the first line in the python script:
		 *      NUMBER = 0 or no metadata at all: normal script
		 *      NUMBER = 1: housing script
		 *      NUMBER = 2: teleport script
		 *      NUMBER = 3: light script
		 */

		int metadata = 0;
		// Try to obtain the metadata, if any
		BufferedReader br;
		myLabel: try
		{
			br = new BufferedReader(new FileReader(scriptFile));
			String sCurrentLine = br.readLine();
			if (sCurrentLine == null) {
			    break myLabel;
			}
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
		if (metadata < 0 || metadata > 4) {
			System.out.println("METADATA NOT A VALID INTEGER: see code comments for details.");
			metadata = 0;
		}
		return metadata;
	}

	public boolean syncScriptFiles(String mcpipyPathString, String scriptPathString, EntityPlayer player, World world) {
		/**
		 * Synchronise the Python scripts from the personal folder to the $minecraft/mcpipy folder in order
		 * to allow RaspberryJam Mod to execute them. It will check existence and create all appropriate
		 * directories as well as copy the scripts. If any step fails, it will print to the (readable) exception
		 * to the player's chat and abort opening the ComputerBlock.
		 */

		// Check existence of $minecraft/mcpipy folder
		File mcpipyFile = new File(mcpipyPathString);
		if (!mcpipyFile.exists()) {
			if (world.isRemote) {
				player.addChatMessage(new TextComponentString(TextFormatting.RED +
						"The mcpipy folder specified in PythonTool-Mod config menu"));
				player.addChatMessage(new TextComponentString(TextFormatting.RED +
						"does not exist. Please specify the correct folder!"));
			}
			return false;
		}
		// Check existence of $minecraft/mcpipy/mcpi folder
		File mcpipyMcpiFile = new File(mcpipyPathString, "mcpi");
		if (!mcpipyMcpiFile.exists()) {
			if (world.isRemote) {
				player.addChatMessage(new TextComponentString(TextFormatting.RED +
						"RaspberryJam Mod's mcpipy/mcpi is missing, replace or"));
				player.addChatMessage(new TextComponentString(TextFormatting.RED +
						"reinstall!"));
			}
			return false;
		}
		// Check existence of personal script folder
		File scriptFile = new File(scriptPathString);
		if (!scriptFile.exists()) {
			if (world.isRemote) {
				player.addChatMessage(new TextComponentString(TextFormatting.RED +
						"The personal folder specified in PythonTool-Mod config menu"));
				player.addChatMessage(new TextComponentString(TextFormatting.RED +
						"does not exist. Please specify the correct folder!"));
			}
			return false;
		}
		// Check existence of $minecraft/mcpipy/pythontool folder
		File mcpipyPythonToolFile = new File(mcpipyFile, "pythontool");
		if (!mcpipyPythonToolFile.exists()) {
			mcpipyPythonToolFile.mkdir();
		}
		// Check existence of $minecraft/mcpipy/pythontool/mcpi folder
		File mcpipyPythonToolMcpiFile = new File(mcpipyPythonToolFile, "mcpi");
		if (!mcpipyPythonToolMcpiFile.exists()) {
			// If it doesn't exist, copy it from mpcipy/mcpi
			try {
				FileUtils.copyDirectory(mcpipyMcpiFile, mcpipyPythonToolMcpiFile);
			} catch (IOException e) {
				if (world.isRemote) {
					player.addChatMessage(new TextComponentString(TextFormatting.RED +
							"Cannot copy mcpipy library files to mcpipy/pythontool/mcpi!"));
				}
				return false;
			}
		}
		// Copy auxiliary scripts fonts.py, text.py, mc.py to mcpipy/pythontool be able
		// to execute RaspberryJam Mod's example scripts
		try {
			File fontsFile = new File(mcpipyFile, "fonts.py");
			File textFile = new File(mcpipyFile, "text.py");
			File mcFile = new File(mcpipyFile, "mc.py");
			File mineFile = new File(mcpipyFile, "mine.py");
			File vehicleFile = new File(mcpipyFile, "vehicle.py");
			File fontsDestFile = new File(mcpipyPythonToolFile, "fonts.py");
			File textDestFile = new File(mcpipyPythonToolFile, "text.py");
			File mcDestFile = new File(mcpipyPythonToolFile, "mc.py");
			File mineDestFile = new File(mcpipyPythonToolFile, "mine.py");
			File vehicleDestFile = new File(mcpipyPythonToolFile, "vehicle.py");
			FileUtils.copyFile(fontsFile, fontsDestFile);
			FileUtils.copyFile(textFile, textDestFile);
			FileUtils.copyFile(mcFile, mcDestFile);
			FileUtils.copyFile(mineFile, mineDestFile);


		} catch (IOException e) {
			if (world.isRemote) {
				player.addChatMessage(new TextComponentString(TextFormatting.RED +
						"Cannot copy fonts, text, mc.py files to mcpipy/pythontool!"));
			}
			return false;
		}
		// Move the scripts from the personal directory to $minecraft/mcpipy/pythontool
		try {
			FileFilter fileFilter = new WildcardFileFilter("*.py");
			FileUtils.copyDirectory(scriptFile, mcpipyPythonToolFile, fileFilter);
		} catch (IOException e) {
			if (world.isRemote) {
				player.addChatMessage(new TextComponentString(TextFormatting.RED +
						"Cannot copy personal scripts to mcpipy/pythontool!"));
			}
			return false;
		}
		// All good!
		return true;
	}

	// Called when the block is right clicked
	// In this block it is used to open the blocks gui when right clicked by a player
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem,  EnumFacing side, float hitX, float hitY, float hitZ) {		
		// Obtain the tile entity associated with the block using its position
		// then cast to our custom TileEntityInventoryBasic
		TileEntity te = worldIn.getTileEntity(pos);
		TileEntityComputerBlock tileEntityComputerBlock = (TileEntityComputerBlock) te;

		// Get the mcpipy folder from the mod's config menu
		String mcpipyPathString = pythontool.configuration.PythonToolConfiguration.mcpipyPath;
		// Get the personal scripts folder from the mod's config menu
		String scriptPathString = pythontool.configuration.PythonToolConfiguration.scriptPath;

		// Synchronise script files from your personal scripts folder to RaspberryJam's
		// mcpipy folder
		boolean syncResult;
		syncResult = syncScriptFiles(mcpipyPathString, scriptPathString, playerIn, worldIn);
		// If any exceptions found while syncing, cancel onRightClick!
		if (!syncResult) return true;

		// Find files in the given folder: scriptPathString
		// Suitable files must be of the form *.py
		File dir = new File(scriptPathString);
		FileFilter fileFilter = new WildcardFileFilter("*.py");
		File[] files = dir.listFiles(fileFilter);

		// Clear all the slots before refilling
		tileEntityComputerBlock.clear();
		// Refill checking the existing python scripts
		int numberSlots = ContainerComputerBlock.TE_INVENTORY_SLOT_COUNT;
		for (int i = 0; i < Math.min(numberSlots, files.length); i++) {
			// Find metadata (script type, if any), see helper function getMetadataFromSriptItem()
			File tempFile = files[i]; 
			int metadata = getMetadataFromScriptItem(tempFile);

			// Create new item stack with the ScriptItem and get the NBT data ready
			ItemStack newItemStack = new ItemStack(pythontool.scriptitem.StartupCommon.scriptItem, 1, metadata);
			NBTTagCompound nbtTagCompound = newItemStack.getTagCompound();
			if (nbtTagCompound == null) {
				nbtTagCompound = new NBTTagCompound();
				newItemStack.setTagCompound(nbtTagCompound);
			}
			// Save the script's name in "scriptName" key in the NBT compound			
			String[] nameList = tempFile.getName().split("\\.(?=[^\\.]+$)");
			String nameString = nameList[0];
			nbtTagCompound.setString("scriptName", nameString);

			// Place it in the computer block's inventory
			tileEntityComputerBlock.setInventorySlotContents(i, newItemStack);
		}

		// Uses the gui handler registered to your mod to open the gui for the given gui id
		// open on the server side only  (not sure why you shouldn't open client side too... vanilla doesn't, so we better not either)
		if (worldIn.isRemote) return true;

		playerIn.openGui(PythonTool.instance, GuiHandlerComputerBlock.getGuiID(), worldIn, pos.getX(), pos.getY(), pos.getZ());
		return true;
	}

	// This is where you can do something when the block is broken. In this case drop the inventory's contents
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		// If not in creative mode: survival, etc. break and drop the block itself
		if (!Minecraft.getMinecraft().thePlayer.capabilities.isCreativeMode) {
			// Make the block drop itself 
			ItemStack itemTemp = new ItemStack(pythontool.computerblock.StartupCommon.computerBlock, 1);
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

//	// the block will render in the SOLID layer.  See http://greyminecraftcoder.blogspot.co.at/2014/12/block-rendering-18.html for more information.
//	@SideOnly(Side.CLIENT)
//	public EnumWorldBlockLayer getBlockLayer()
//	{
//		return EnumWorldBlockLayer.SOLID;
//	}
//
//	// used by the renderer to control lighting and visibility of other blocks.
//	// set to false because this block doesn't fill the entire 1x1x1 space
//	@Override
//	public boolean isFullyOpaque() {
//		return false;
//	}
//
//	// used by the renderer to control lighting and visibility of other blocks, also by
//	// (eg) wall or fence to control whether the fence joins itself to this block
//	// set to true because this block fills the entire 1x1x1 space
//	@Override
//	public boolean isFullCube() {
//		return true;
//	}
//
//	// render using a BakedModel
//	// not strictly required because the default (super method) is 3.
//	@Override
//	public int getRenderType() {
//		return 3;
//	}

	//---------------------------------------------------------
	// Make sure the block is rendered facing the player

	public static final PropertyDirection PROPERTYFACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {PROPERTYFACING});
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
