package mcadventurecity.advancebase.items;

import mcadventurecity.advancebase.misc.IOreDict;
import net.minecraftforge.oredict.OreDictionary;

public class ItemOre extends ItemBase implements IOreDict {

	private String oreName;

	public ItemOre(String name, String oreName) {
		super(name);

		this.oreName = oreName;
	}

	@Override
	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);
	}

}
