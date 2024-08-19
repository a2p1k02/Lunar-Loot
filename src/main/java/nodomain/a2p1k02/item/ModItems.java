package nodomain.a2p1k02.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nodomain.a2p1k02.LunarLoot;

public class ModItems {
    public static final Item LUNAR_DUST = registerItem("lunar_dust", new Item(new Item.Settings()));
    public static final Item LUNAR_INGOT = registerItem("lunar_ingot", new Item(new Item.Settings()));

    public static void registerModItems() {
        LunarLoot.LOGGER.info("Mod is available: " + LunarLoot.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(LUNAR_DUST);
            entries.add(LUNAR_INGOT);
        });
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LunarLoot.MOD_ID, name), item);
    }
}
