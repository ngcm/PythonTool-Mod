package pycraft.scriptitem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;

/**
 * ----------- PyCraft Mod -----------
 * Alvaro Perez & Hans Fangohr
 * University of Southampton, UK (2016)
 *
 * Code based on MinecraftByExample by TheGreyGhost: MBE11_ITEM_VARIANTS
 * https://github.com/TheGreyGhost/MinecraftByExample/tree/1-8final
 * (mbe11_item_variants/StartupClientOnly.java)
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

public class StartupClientOnly
{
	public static void preInitClientOnly()
	{
		{
			//    need to add the variants to the bakery so it knows what models are available for rendering the different subtypes
			ModelBakery.addVariantName(StartupCommon.scriptItem,
					"pycraft:scriptItem_0",
					"pycraft:scriptItem_1",
					"pycraft:scriptItem_2",
					"pycraft:scriptItem_3"
					);
		}
	}

	public static void initClientOnly()
	{
		// Register all the PythonScript variants
		for (int i = 0; i < 4; i++) {
			ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("pycraft:scriptItem_" + i, "inventory");
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(StartupCommon.scriptItem, i, itemModelResourceLocation);
		}
	}

	public static void postInitClientOnly()
	{
	}
}
