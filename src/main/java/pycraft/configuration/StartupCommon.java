package pycraft.configuration;

/**
 * ----------- PyCraft Mod -----------
 * Alvaro Perez & Hans Fangohr
 * University of Southampton, UK (2016)
 *
 * Code based on MinecraftByExample by TheGreyGhost: MBE30_INVENTORY_BASIC
 * https://github.com/TheGreyGhost/MinecraftByExample/tree/1-8final
 * (mbe30_inventory_basic/StartupCommon.java)
 * 
 * Original code by:
 * User: TW
 * Date: 2/4/2015
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
	public static void preInitCommon()
	{
		PyCraftConfiguration.preInit();
	}

	public static void initCommon() 
	{
	}

	public static void postInitCommon() 
	{
	}

}
