package nodomain.a2p1k02;

import net.fabricmc.api.ModInitializer;

import nodomain.a2p1k02.block.ModBlocks;
import nodomain.a2p1k02.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LunarLoot implements ModInitializer {
	public static final String MOD_ID = "lunar-loot";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}