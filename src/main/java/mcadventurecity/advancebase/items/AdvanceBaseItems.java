package mcadventurecity.advancebase.items;

import mcadventurecity.advancebase.misc.AdvanceBaseTabs;
import mcadventurecity.advancebase.misc.IOreDict;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdvanceBaseItems {
	public static ItemBase copperIngot;
	public static ItemBase tinIngot;
	public static ItemBase aluminumIngot;
	public static ItemBase leadIngot;
	public static ItemBase silverIngot;
	public static void init() {
		copperIngot = register(new ItemOre("copperIngot", "ingotCopper").setCreativeTab(AdvanceBaseTabs.tabAdvanceBase));
		tinIngot = register(new ItemOre("tinIngot", "ingotTin").setCreativeTab(AdvanceBaseTabs.tabAdvanceBase));
		aluminumIngot = register(new ItemOre("aluminumIngot", "ingotAluminum").setCreativeTab(AdvanceBaseTabs.tabAdvanceBase));
		leadIngot = register(new ItemOre("leadIngot", "ingotLead").setCreativeTab(AdvanceBaseTabs.tabAdvanceBase));
		silverIngot = register(new ItemOre("silverIngot", "ingotSilver").setCreativeTab(AdvanceBaseTabs.tabAdvanceBase));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}
		if (item instanceof IOreDict) {
			((IOreDict)item).initOreDict();
		}
		return item;
	}
}
