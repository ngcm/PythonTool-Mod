package pycraft.scriptitem;

import java.util.List;

import org.apache.commons.lang3.SystemUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * ----------- PyCraft Mod -----------
 * Alvaro Perez & Hans Fangohr
 * University of Southampton, UK (2016)
 *
 * Code based on MinecraftByExample by TheGreyGhost: MBE11_ITEM_VARIANTS
 * https://github.com/TheGreyGhost/MinecraftByExample/tree/1-8final
 * (mbe11_item_variants/ItemVariants.java)
 * 
 * Original code by:
 * User: The Grey Ghost
 * Date: 24/12/2014
 * 
 * Create an ScriptItem, which represents a python script. It can be carried and used as any
 * other tool. When equipped and used it will run the associated python script, and
 * consume one unit from the item stack. If only right clicked, it will run the python script
 * and stop any previously used scripts running in the background. If sneak+right clicked, it will
 * run the new script and keep any already running ones. ScriptItem uses the custom commands
 * /python and /apython from Forge's RaspberryJam mod to run the python scripts, so RaspberryJam
 * mod is needed.
 * 
 * The associated python script can be arbitrary, although it is intended to use the mcpipy library to
 * interface with the game in real time: http://www.stuffaboutcode.com/p/minecraft.html
 * 
 * There are subvariants to this item, with the same functionality, but changing the item texture:
 * the intention is to roughly categorize the script behaviour and offer different ScriptItem textures
 * to be able to visually remember what the script does in the case that we have a high number of them.
 * For example, if a given script builds a house, it can have a house icon in its texture. If it
 * teleports the player, it can have a teleport icon.
 * 
 * Currently, this is achieved by adding the code # metadata NUMBER as the first line in the python script:
 *      NUMBER = 0 or no metadata at all: normal script
 *      NUMBER = 1: housing script
 *      NUMBER = 2: teleport script
 *      NUMBER = 3: light script
 */

public class ScriptItem extends Item {
	public ScriptItem() {
		super();
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		this.setUnlocalizedName("scriptItem");
		this.setCreativeTab(CreativeTabs.MISC);
	}

	@Override
	public int getMetadata(int damage) {
		return damage;
	}

	// add a subitem for each item we want to appear in the creative tab
	// in this case - one script of each type, although the ones in the
	// creative tab won't have any associated python scripts 
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item itemIn, CreativeTabs tab, List subItems)
	{
		for (int i = 0; i < 4; i++) {
			ItemStack subItemStack = new ItemStack(itemIn, 1, i);
			subItems.add(subItemStack);
		}
	}

	@Override
	// Make a unique name for each script type (standard, housing, teleport, light) so we can name them individually
	public String getUnlocalizedName(ItemStack stack)
	{
		int metadata = stack.getMetadata();
		return super.getUnlocalizedName() + "." + metadata;
	}

	public String getSeparator() {
		/**
		 * Auxiliary function.
		 * Return the separator, \ in windows or / in unix (based) systems
		 */
		final String separator;
		if (SystemUtils.IS_OS_WINDOWS) {
			separator = "\\";
		} else {
			separator = "/";
		}
		return separator;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand)	{
		// Get the script path from the NBT data
		NBTTagCompound nbtTagCompound = stack.getTagCompound();
		if (nbtTagCompound == null) {
			if (world.isRemote) {
				player.addChatMessage(new TextComponentString(TextFormatting.RED +
						"NO ASSOCIATED SCRIPT"));
			}
			// Decrease stack size
			stack.stackSize--;
			return new ActionResult(EnumActionResult.PASS, stack);
		}

		String separator = getSeparator();
		if (!world.isRemote) {
			if (player.isSneaking()) { // shift pressed. Run new parallel script
				String scriptName = nbtTagCompound.getString("scriptName");
				Minecraft.getMinecraft().thePlayer.getServer().getCommandManager().executeCommand(player,
						"/apy " + "pycraft" + separator + scriptName);
			} else { // shift not pressed. Cancel previous scripts and run new script
				String scriptName = nbtTagCompound.getString("scriptName");
				world.getMinecraftServer().getCommandManager().executeCommand(player,
						"/python " + "pycraft" + separator + scriptName);
			}
		}

		// Decrease stack size
		if (!player.capabilities.isCreativeMode) {
			stack.stackSize--;
		}
		return new ActionResult(EnumActionResult.PASS, stack);
	}

	// Add 'tooltip' text
	@SideOnly(Side.CLIENT)
	@SuppressWarnings("unchecked")
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
		NBTTagCompound nbtTagCompound = stack.getTagCompound();
		if (nbtTagCompound != null && nbtTagCompound.hasKey("scriptName")) {
			tooltip.add("Loaded script: " + nbtTagCompound.getString("scriptName"));
		}
		else
		{
			tooltip.add("NO SCRIPT LOADED");
		}
	}
}