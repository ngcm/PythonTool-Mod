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
					"pycraft:scriptItem_2"
					);
		}
	}

	public static void initClientOnly()
	{
		// Default script type
		ModelResourceLocation itemModelResourceLocation0 = new ModelResourceLocation("pycraft:scriptItem_0", "inventory");
		final int metadata0 = 0;
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(StartupCommon.scriptItem, metadata0, itemModelResourceLocation0);
		// First script type
		ModelResourceLocation itemModelResourceLocation1 = new ModelResourceLocation("pycraft:scriptItem_1", "inventory");
		final int metadata1 = 1;
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(StartupCommon.scriptItem, metadata1, itemModelResourceLocation1);
		// Second script type
		ModelResourceLocation itemModelResourceLocation2 = new ModelResourceLocation("pycraft:scriptItem_2", "inventory");
		final int metadata2 = 2;
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(StartupCommon.scriptItem, metadata2, itemModelResourceLocation2);
	}

	public static void postInitClientOnly()
	{
	}
}
