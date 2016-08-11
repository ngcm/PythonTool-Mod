package pycraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * ----------- PyCraft Mod -----------
 * Alvaro Perez & Hans Fangohr
 * University of Southampton, UK (2016)
 * 
 * Code based on MinecraftByExample by TheGreyGhost
 * https://github.com/TheGreyGhost/MinecraftByExample/tree/1-8final
 * (MinecraftByExample.java)
 * 
 * Main class for PyCraft Mod, used by Forge to interact with the mod during startup. 
 */

@Mod(modid = PyCraft.MODID, version = PyCraft.VERSION, name = PyCraft.NAME)
public class PyCraft {
	// You also need to update the modid and version in two other places as well:
	// 	 build.gradle file (the version, group, and archivesBaseName parameters)
	// 	 resources/mcmod.info (the name, description, and version parameters)
	public static final String MODID = "pycraft";
	public static final String VERSION = "1.0";
	public static final String NAME = "PyCraft Mod";

	// The instance of your mod that Forge uses. Optional.
	@Mod.Instance(PyCraft.MODID)
	public static PyCraft instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="pycraft.ClientOnlyProxy", serverSide="pycraft.DedicatedServerProxy")
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
