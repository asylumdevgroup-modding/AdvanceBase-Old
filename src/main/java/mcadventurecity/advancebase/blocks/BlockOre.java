package mcadventurecity.advancebase.blocks;

import mcadventurecity.advancebase.misc.IOreDict;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockBase implements IOreDict {
	private String oreName;
	public BlockOre(String name, String oreName, int miningLevel) {
		super(Material.ROCK, name);

		setHardness(3f);
		setResistance(5f);
		setHarvestLevel("pickaxe", miningLevel);
	}
	@Override
	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);
		
	}
	@Override
	public BlockOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
