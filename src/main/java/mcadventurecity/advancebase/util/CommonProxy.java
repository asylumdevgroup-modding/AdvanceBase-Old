package mcadventurecity.advancebase.util;

import java.io.File;

import mcadventurecity.advancebase.blocks.AdvanceBaseBlocks;
import mcadventurecity.advancebase.items.AdvanceBaseItems;
import mcadventurecity.advancebase.misc.AdvanceBaseRecipes;
import mcadventurecity.advancebase.world.AdvanceBaseWorld;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	public static Configuration config;
	
	public void preInit(FMLPreInitializationEvent e) {
		File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "AdvanceBase.cfg"));
        Config.readConfig();
        AdvanceBaseItems.init();
        AdvanceBaseBlocks.init();
    }

    public void init(FMLInitializationEvent e) {
    	AdvanceBaseRecipes.init();
    	GameRegistry.registerWorldGenerator(new AdvanceBaseWorld(), 3);
    }

    public void postInit(FMLPostInitializationEvent e) {
    	if (config.hasChanged()) {
            config.save();
        }
    }
}
