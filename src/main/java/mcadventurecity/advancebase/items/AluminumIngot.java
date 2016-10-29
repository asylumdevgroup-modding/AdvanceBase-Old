package mcadventurecity.advancebase.items;

import mcadventurecity.advancebase.misc.AdvanceBaseTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AluminumIngot extends Item {
	public static String name = "aluminumIngot";
	public AluminumIngot(){
		this.setCreativeTab(AdvanceBaseTabs.tabAdvanceBase);
		setRegistryName(name);
		setUnlocalizedName(name);
		GameRegistry.register(this);
	}
}
