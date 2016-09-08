package pythontool.configuration;

/**
 * ----------- PythonTool Mod -----------
 * Alvaro Perez & Hans Fangohr
 * University of Southampton, UK (2016)
 *
 * Code based on MinecraftByExample by TheGreyGhost: MBE70_CONFIGURATION
 * https://github.com/TheGreyGhost/MinecraftByExample/tree/1-8final
 * (mbe30_configuration/StartupClientOnly.java)
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

public class StartupClientOnly {
	public static void preInitClientOnly() 
	{
		PythonToolConfiguration.clientPreInit();  // used to set up an event handler for the GUI so that the altered values are
		//  saved back to disk.
	}

	public static void initClientOnly() 
	{
	}

	public static void postInitClientOnly() 
	{
	}

}
