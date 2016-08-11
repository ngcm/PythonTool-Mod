package pycraft.scriptitem;

import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * ----------- PyCraft Mod -----------
 * Alvaro Perez & Hans Fangohr
 * University of Southampton, UK (2016)
 *
 * Code based on MinecraftByExample by TheGreyGhost: MBE11_ITEM_VARIANTS
 * https://github.com/TheGreyGhost/MinecraftByExample/tree/1-8final
 * (mbe11_item_variants/StartupCommon.java)
 * 
 * User: The Grey Ghost
 * Date: 24/12/2014
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
  public static ScriptItem scriptItem;  // this holds the unique instance of your block

  public static void preInitCommon()
  {
    // each instance of your item should have a name that is unique within your mod.  use lower case.
    scriptItem = (ScriptItem)(new ScriptItem().setUnlocalizedName("scriptItem"));
    GameRegistry.registerItem(scriptItem , "scriptItem");
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }
}
