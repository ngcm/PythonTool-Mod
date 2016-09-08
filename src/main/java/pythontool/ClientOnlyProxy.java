package pythontool;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

/**
 * ----------- PythonTool Mod -----------
 * Alvaro Perez & Hans Fangohr
 * University of Southampton, UK (2016)
 *
 * Code based on MinecraftByExample by TheGreyGhost
 * https://github.com/TheGreyGhost/MinecraftByExample/tree/1-8final
 * (ClientOnlyProxy.java)
 * 
 * ClientProxy is used to set up the mod and start it running on normal Minecraft.  It contains all the code that should run on the
 *   client side only.
 *   For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */

public class ClientOnlyProxy extends CommonProxy
{
	/**
	 * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
	 */
	public void preInit()
	{
		super.preInit();    
	    pythontool.configuration.StartupClientOnly.preInitClientOnly();
		pythontool.computerblock.StartupClientOnly.preInitClientOnly();
		pythontool.scriptitem.StartupClientOnly.preInitClientOnly();
		pythontool.recipes.StartupClientOnly.preInitClientOnly();
	}

	/**
	 * Do your mod setup. Build whatever data structures you care about. Register recipes,
	 * send FMLInterModComms messages to other mods.
	 */
	public void init()
	{
		super.init();
	    pythontool.configuration.StartupClientOnly.initClientOnly();
		pythontool.computerblock.StartupClientOnly.initClientOnly();
		pythontool.scriptitem.StartupClientOnly.initClientOnly();
		pythontool.recipes.StartupClientOnly.initClientOnly();
	}

	/**
	 * Handle interaction with other mods, complete your setup based on this.
	 */
	public void postInit()
	{
		super.postInit();
	    pythontool.configuration.StartupClientOnly.postInitClientOnly();
		pythontool.computerblock.StartupClientOnly.postInitClientOnly();
		pythontool.scriptitem.StartupClientOnly.postInitClientOnly();
		pythontool.recipes.StartupClientOnly.postInitClientOnly();
	}

	@Override
	public boolean playerIsInCreativeMode(EntityPlayer player) {
		if (player instanceof EntityPlayerMP) {
			EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
			return entityPlayerMP.theItemInWorldManager.isCreative();
		} else if (player instanceof EntityPlayerSP) {
			return Minecraft.getMinecraft().playerController.isInCreativeMode();
		}
		return false;
	}
}
