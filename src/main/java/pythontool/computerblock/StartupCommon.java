package pythontool.computerblock;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pythontool.GuiHandlerRegistry;
import pythontool.PythonTool;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

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

@ObjectHolder(PythonTool.MODID)
public class StartupCommon
{
	public static final ComputerBlock computerBlock = null;  // this holds the unique instance of your block
	
	@ObjectHolder("computerBlock")
	public static final ItemBlock item_block_computerBlock = null;
	
	public static void preInitCommon()
	{	
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
	
	@EventBusSubscriber(modid = PythonTool.MODID)
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			event.getRegistry()
					.register(new ComputerBlock().setRegistryName(PythonTool.MODID+":"+"computerBlock").setUnlocalizedName(PythonTool.MODID+":"+"computerBlock"));
		}

		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			event.getRegistry()
					.register(new ItemBlock(computerBlock)
							.setRegistryName(computerBlock.getRegistryName())
							.setUnlocalizedName(computerBlock.getRegistryName().toString()));
		}
		
		 @SubscribeEvent
	     @SideOnly(Side.CLIENT)
	     public static void onModelEvent(final ModelRegistryEvent event) {
			 ModelLoader.setCustomModelResourceLocation(item_block_computerBlock, 0,
		                new ModelResourceLocation(computerBlock.getRegistryName(), "inventory"));
	     }

	}
}
