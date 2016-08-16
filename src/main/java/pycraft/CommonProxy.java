package pycraft;

import net.minecraft.entity.player.EntityPlayer;

/**
 * ----------- PyCraft Mod -----------
 * Alvaro Perez & Hans Fangohr
 * University of Southampton, UK (2016)
 *
 * Code based on MinecraftByExample by TheGreyGhost
 * https://github.com/TheGreyGhost/MinecraftByExample/tree/1-8final
 * (CommonProxy.java)
 * 
 * CommonProxy is used to set up the mod and start it running.  It contains all the code that should run on both the
 * stand-alone client and the dedicated server.
 * For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */

public abstract class CommonProxy {
	/**
	 * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
	 */
	public void preInit()
	{
		pycraft.configuration.StartupCommon.preInitCommon();
		pycraft.computerblock.StartupCommon.preInitCommon();
		pycraft.scriptitem.StartupCommon.preInitCommon();
		pycraft.recipes.StartupCommon.preInitCommon();
	}

	/**
	 * Do your mod setup. Build whatever data structures you care about. Register recipes,
	 * send FMLInterModComms messages to other mods.
	 */
	public void init()
	{
		pycraft.configuration.StartupCommon.initCommon();
		pycraft.computerblock.StartupCommon.initCommon();
		pycraft.scriptitem.StartupCommon.initCommon();
		pycraft.recipes.StartupCommon.initCommon();
	}

	/**
	 * Handle interaction with other mods, complete your setup based on this.
	 */
	public void postInit()
	{
		pycraft.configuration.StartupCommon.postInitCommon();
		pycraft.computerblock.StartupCommon.postInitCommon();
		pycraft.scriptitem.StartupCommon.postInitCommon();
		pycraft.recipes.StartupCommon.postInitCommon();
	}

	// helper to determine whether the given player is in creative mode
	//  not necessary for most examples
	abstract public boolean playerIsInCreativeMode(EntityPlayer player);

}
