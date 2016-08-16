package pycraft.configuration;

/*
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
 *  See MinecraftByExample class for more information
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
