package pythontool.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * ----------- PythonTool Mod -----------
 * Alvaro Perez & Hans Fangohr
 * University of Southampton, UK (2016)
 *
 * Code based on MinecraftByExample by TheGreyGhost: MBE35_RECIPES
 * https://github.com/TheGreyGhost/MinecraftByExample/tree/1-8final
 * (mbe35_recipes/StartupCommon.java)
 * 
 * Original code by:
 * User: The Grey Ghost
 * Date: 24/12/2014
 *
 * The Startup classes for this example are called during startup, in the following order:
 *  preInitCommon
 *  preInitClientOnly
 *  initCommon
 *  initClientOnly
 *  postInitCommon
 *  postInitClientOnly
 */

public class StartupCommon
{
	/**
	 * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
	 */
	public static void preInitCommon() {
	}

	/**
	 * Do your mod setup. Build whatever data structures you care about. Register recipes,
	 * send FMLInterModComms messages to other mods.
	 */
	public static void initCommon()
	{
		// Register the ComputerBlock
		GameRegistry.addRecipe(new ItemStack(pythontool.computerblock.StartupCommon.computerBlock), new Object[]{
				"RRR",
				"RGR",
				"RRR",
				'G', Blocks.GLASS,
				'R', Blocks.COBBLESTONE
		});	
	}

	public static void postInitCommon()
	{
	}

}
