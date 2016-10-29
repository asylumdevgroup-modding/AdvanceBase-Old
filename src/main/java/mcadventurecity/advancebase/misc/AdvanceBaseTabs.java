package mcadventurecity.advancebase.misc;

import mcadventurecity.advancebase.blocks.AdvanceBaseBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AdvanceBaseTabs {
	public static CreativeTabs tabAdvanceBase = new CreativeTabs("tabAdvanceBase") {
		@Override
		@SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item.getItemFromBlock(AdvanceBaseBlocks.copperOre);
	    }
	};
}
