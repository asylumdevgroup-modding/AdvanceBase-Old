package mcadventurecity.advancebase.blocks;

import mcadventurecity.advancebase.misc.AdvanceBaseTabs;
import mcadventurecity.advancebase.misc.IOreDict;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdvanceBaseBlocks {
	
	public static Block copperOre;
	public static Block tinOre;
	public static Block aluminumOre;
	public static Block leadOre;
	public static Block silverOre;
	public static Block copperBlock;
	public static Block tinBlock;
	public static Block aluminumBlock;
	
	public static void init() {
		copperOre = register(new BlockOre("copperOre", "oreCopper").setCreativeTab(AdvanceBaseTabs.tabAdvanceBase));
		tinOre = register(new BlockOre("tinOre", "oreTin").setCreativeTab(AdvanceBaseTabs.tabAdvanceBase));
		aluminumOre = register(new BlockOre("aluminumOre", "oreAluminum").setCreativeTab(AdvanceBaseTabs.tabAdvanceBase));
		leadOre = register(new BlockOre("leadOre", "oreLead").setCreativeTab(AdvanceBaseTabs.tabAdvanceBase));
		silverOre = register(new BlockOre("silverOre", "oreSilver").setCreativeTab(AdvanceBaseTabs.tabAdvanceBase));
		copperBlock = register(new BlockBase(Material.IRON, "copperBlock").setCreativeTab(AdvanceBaseTabs.tabAdvanceBase));
		tinBlock = register(new BlockBase(Material.IRON, "tinBlock").setCreativeTab(AdvanceBaseTabs.tabAdvanceBase));
		aluminumBlock = register(new BlockBase(Material.IRON, "aluminumBlock").setCreativeTab(AdvanceBaseTabs.tabAdvanceBase));
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		if (itemBlock != null) {
			GameRegistry.register(itemBlock);

			if (block instanceof BlockBase) {
				((BlockBase)block).registerItemModel(itemBlock);
			}
			if (block instanceof IOreDict) {
				((IOreDict)block).initOreDict();
			}
			if (itemBlock instanceof IOreDict) {
				((IOreDict)itemBlock).initOreDict();
			}
		}
		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}
