package mcadventurecity.advancebase.blocks;

import mcadventurecity.advancebase.misc.AdvanceBaseTabs;
import mcadventurecity.advancebase.misc.IOreDict;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SilverOre extends Block implements IOreDict {
	public SilverOre() {
        super(Material.ROCK);
        this.setCreativeTab(AdvanceBaseTabs.tabAdvanceBase);
        setUnlocalizedName("silverOre");     // Used for localization (en_US.lang)
        setRegistryName("silverOre");        // The unique name (within your mod) that identifies this block
        setHarvestLevel("pickaxe", 2);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }

	@Override
	public void initOreDict() {
		// TODO Auto-generated method stub
		
	}
}
