package mcadventurecity.advancebase.blocks;

import mcadventurecity.advancebase.misc.AdvanceBaseTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AluminumBlock extends Block {
	public AluminumBlock() {
        super(Material.ROCK);
        this.setCreativeTab(AdvanceBaseTabs.tabAdvanceBase);
        setUnlocalizedName("aluminumBlock");     // Used for localization (en_US.lang)
        setRegistryName("aluminumBlock");        // The unique name (within your mod) that identifies this block
        setHarvestLevel("pickaxe", 1);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
	}
}