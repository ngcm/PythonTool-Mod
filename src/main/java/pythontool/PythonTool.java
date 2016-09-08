package pythontool;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * ----------- PythonTool Mod -----------
 * Alvaro Perez & Hans Fangohr
 * University of Southampton, UK (2016)
 * 
 * Code based on MinecraftByExample by TheGreyGhost
 * https://github.com/TheGreyGhost/MinecraftByExample/tree/1-8final
 * (MinecraftByExample.java)
 * 
 * Main class for PythonTool Mod, used by Forge to interact with the mod during startup. 
 */

@Mod(modid = PythonTool.MODID, version = PythonTool.VERSION, name = PythonTool.NAME,
	 guiFactory= PythonTool.GUIFACTORY)
public class PythonTool {
	// You also need to update the modid and version in two other places as well:
	// 	 build.gradle file (the version, group, and archivesBaseName parameters)
	// 	 resources/mcmod.info (the name, description, and version parameters)
	public static final String MODID = "pythontool";
	public static final String VERSION = "1.0";
	public static final String NAME = "PythonTool Mod";
    public static final String GUIFACTORY = "pythontool.configuration.PythonToolGuiFactory";

	// The instance of your mod that Forge uses. Optional.
	@Mod.Instance(PythonTool.MODID)
	public static PythonTool instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="pythontool.ClientOnlyProxy", serverSide="pythontool.DedicatedServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit();
	}
}
