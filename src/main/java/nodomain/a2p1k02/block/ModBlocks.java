package nodomain.a2p1k02.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nodomain.a2p1k02.LunarLoot;

//TODO: Add ore generation
public class ModBlocks {
    public static final Block LUNAR_ORE = registerBlock("lunar_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block LUNAR_RAW_BLOCK = registerBlock("lunar_raw_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(LunarLoot.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(LunarLoot.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        LunarLoot.LOGGER.info("Registering Mod Blocks for " + LunarLoot.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(LUNAR_ORE);
            entries.add(LUNAR_RAW_BLOCK);
        });
    }
}
