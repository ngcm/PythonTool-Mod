package pycraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

/**
 * ----------- PyCraft Mod -----------
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
	    pycraft.configuration.StartupClientOnly.preInitClientOnly();
		pycraft.computerblock.StartupClientOnly.preInitClientOnly();
		pycraft.scriptitem.StartupClientOnly.preInitClientOnly();
		pycraft.recipes.StartupClientOnly.preInitClientOnly();
	}

	/**
	 * Do your mod setup. Build whatever data structures you care about. Register recipes,
	 * send FMLInterModComms messages to other mods.
	 */
	public void init()
	{
		super.init();
	    pycraft.configuration.StartupClientOnly.initClientOnly();
		pycraft.computerblock.StartupClientOnly.initClientOnly();
		pycraft.scriptitem.StartupClientOnly.initClientOnly();
		pycraft.recipes.StartupClientOnly.initClientOnly();
	}

	/**
	 * Handle interaction with other mods, complete your setup based on this.
	 */
	public void postInit()
	{
		super.postInit();
	    pycraft.configuration.StartupClientOnly.postInitClientOnly();
		pycraft.computerblock.StartupClientOnly.postInitClientOnly();
		pycraft.scriptitem.StartupClientOnly.postInitClientOnly();
		pycraft.recipes.StartupClientOnly.postInitClientOnly();
	}

	@Override
	public boolean playerIsInCreativeMode(EntityPlayer player) {
		if (player instanceof EntityPlayerMP) {
			EntityPlayerMP entityPlayerMP = (EntityPlayerMP)player;
			return entityPlayerMP.interactionManager.isCreative();
		} else if (player instanceof EntityPlayerSP) {
			return Minecraft.getMinecraft().playerController.isInCreativeMode();
		}
		return false;
	}
}
