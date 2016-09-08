package pythontool.computerblock;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

/**
 * ----------- PythonTool Mod -----------
 * Alvaro Perez & Hans Fangohr
 * University of Southampton, UK (2016)
 *
 * Custom slot which doesn't accept any items. We use it for the ComputerBlock,
 * as we don't want anything to be placed in its inventory (it would be lost as
 * every time it's open it deletes everything and loads the scripts)  
 */

public class CustomSlot extends Slot{

	public CustomSlot(IInventory inventoryIn, int index, int xPosition, int yPosition) {
		super(inventoryIn, index, xPosition, yPosition);
	}

	@Override
	public boolean isItemValid(ItemStack itemstack)
	{
		// No item is valid!
		return false;
	}
}
