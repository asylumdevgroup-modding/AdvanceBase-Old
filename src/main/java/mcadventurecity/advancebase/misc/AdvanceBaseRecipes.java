package mcadventurecity.advancebase.misc;

import mcadventurecity.advancebase.blocks.AdvanceBaseBlocks;
import mcadventurecity.advancebase.items.AdvanceBaseItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class AdvanceBaseRecipes {
	public static void init() {
		GameRegistry.addSmelting(AdvanceBaseBlocks.copperOre, new ItemStack(AdvanceBaseItems.copperIngot), 0.7f);
		GameRegistry.addSmelting(AdvanceBaseBlocks.tinOre, new ItemStack(AdvanceBaseItems.tinIngot), 0.7f);
		GameRegistry.addSmelting(AdvanceBaseBlocks.aluminumOre, new ItemStack(AdvanceBaseItems.aluminumIngot), 0.7f);
		GameRegistry.addSmelting(AdvanceBaseBlocks.leadOre, new ItemStack(AdvanceBaseItems.leadIngot), 1.0f);
		GameRegistry.addSmelting(AdvanceBaseBlocks.silverOre, new ItemStack(AdvanceBaseItems.silverIngot), 1.0f);
		GameRegistry.addRecipe(new ShapedOreRecipe(AdvanceBaseBlocks.copperBlock, "CCC", "CCC", "CCC", 'C', "copperIngot"));
		GameRegistry.addRecipe(new ShapedOreRecipe(AdvanceBaseBlocks.tinBlock, "TTT", "TTT", "TTT", 'T', "tinIngot"));
		GameRegistry.addRecipe(new ShapedOreRecipe(AdvanceBaseBlocks.aluminumBlock, "AAA", "AAA", "AAA", 'A', "aluminumIngot"));
	}
}
