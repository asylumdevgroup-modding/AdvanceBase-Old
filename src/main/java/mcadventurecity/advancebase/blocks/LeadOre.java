package mcadventurecity.advancebase.blocks;

import mcadventurecity.advancebase.misc.AdvanceBaseTabs;
import mcadventurecity.advancebase.misc.IOreDict;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LeadOre extends Block implements IOreDict {
	public LeadOre() {
        super(Material.ROCK);
        this.setCreativeTab(AdvanceBaseTabs.tabAdvanceBase);
        setUnlocalizedName("leadOre");     // Used for localization (en_US.lang)
        setRegistryName("leadOre");        // The unique name (within your mod) that identifies this block
        setHarvestLevel("pickaxe", 2);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }

	@Override
	public void initOreDict() {
		// TODO Auto-generated method stub
		
	}
}
