package pythontool.computerblock;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pythontool.GuiHandlerRegistry;
import pythontool.PythonTool;

/**
 * ----------- PythonTool Mod -----------
 * Alvaro Perez & Hans Fangohr
 * University of Southampton, UK (2016)
 *
 * Code based on MinecraftByExample by TheGreyGhost: MBE30_INVENTORY_BASIC
 * https://github.com/TheGreyGhost/MinecraftByExample/tree/1-8final
 * (mbe30_inventory_basic/StartupCommon.java)
 * 
 * Original code by:
 * User: brandon3055
 * Date: 06/01/2015
 *
 * The Startup classes for this example are called during startup, in the following order:
 *  preInitCommon
 *  preInitClientOnly
 *  initCommon
 *  initClientOnly
 *  postInitCommon
 *  postInitClientOnly
 *  See MinecraftByExample class for more information
 */

public class StartupCommon
{
	public static ComputerBlock computerBlock;  // this holds the unique instance of your block
	public static ItemBlock itemComputerBlock; // and the corresponding item form that block
	
	public static void preInitCommon()
	{
		// Create and register an instance of the Computer Block
		computerBlock = (ComputerBlock)(new ComputerBlock().setRegistryName("computerBlock"));
		computerBlock.setUnlocalizedName(computerBlock.getRegistryName().toString());
		GameRegistry.register(computerBlock);
		
		// Same but for the associated item
		itemComputerBlock = new ItemBlock(computerBlock);
		itemComputerBlock.setRegistryName(computerBlock.getRegistryName());
		GameRegistry.register(itemComputerBlock);
		
		// Each of your tile entities needs to be registered with a name that is unique to your mod.
		GameRegistry.registerTileEntity(TileEntityComputerBlock.class, "computerBlock_tile");

		// You need to register a GUIHandler for the container.  However there can be only one handler per mod, so for the purposes
		//   of this project, we create a single GuiHandlerRegistry for all examples.
		// We register this GuiHandlerRegistry with the NetworkRegistry, and then tell the GuiHandlerRegistry about
		//   each example's GuiHandler, in this case GuiHandlerComputerBlock, so that when it gets a request from NetworkRegistry,
		//   it passes the request on to the correct example's GuiHandler.
		NetworkRegistry.INSTANCE.registerGuiHandler(PythonTool.instance, GuiHandlerRegistry.getInstance());
		GuiHandlerRegistry.getInstance().registerGuiHandler(new GuiHandlerComputerBlock(), GuiHandlerComputerBlock.getGuiID());
	}

	public static void initCommon()
	{
	}

	public static void postInitCommon()
	{
	}
}
