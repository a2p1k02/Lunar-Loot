package nodomain.a2p1k02.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nodomain.a2p1k02.LunarLoot;
import nodomain.a2p1k02.item.custom.LunarToolMaterial;

public class ModItems {
    public static final Item RAW_LUNAR = registerItem("raw_lunar", new Item(new Item.Settings()));
    public static final Item LUNAR_INGOT = registerItem("lunar_ingot", new Item(new Item.Settings()));

    public static final Item LUNAR_SWORD = registerItem("lunar_sword",
            new SwordItem(LunarToolMaterial.INSTANCE, new Item.Settings().fireproof().attributeModifiers(SwordItem
                    .createAttributeModifiers(LunarToolMaterial.INSTANCE, 38, -1.f))));

    public static final Item LUNAR_PICKAXE = registerItem("lunar_pickaxe",
            new PickaxeItem(LunarToolMaterial.INSTANCE, new Item.Settings().fireproof().attributeModifiers(PickaxeItem
                    .createAttributeModifiers(LunarToolMaterial.INSTANCE, 5, -2.8f))));

    public static final Item LUNAR_AXE = registerItem("lunar_axe",
            new AxeItem(LunarToolMaterial.INSTANCE, new Item.Settings().fireproof().attributeModifiers(AxeItem
                    .createAttributeModifiers(LunarToolMaterial.INSTANCE, 40, -3.f))));

    public static final Item LUNAR_SHOVEL = registerItem("lunar_shovel",
            new ShovelItem(LunarToolMaterial.INSTANCE, new Item.Settings().fireproof().attributeModifiers(ShovelItem
                    .createAttributeModifiers(LunarToolMaterial.INSTANCE, 5, -2.8f))));

    public static void registerModItems() {
        LunarLoot.LOGGER.info("Mod is available: " + LunarLoot.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(RAW_LUNAR);
            entries.add(LUNAR_INGOT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(LUNAR_SWORD);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(LUNAR_PICKAXE);
            entries.add(LUNAR_AXE);
            entries.add(LUNAR_SHOVEL);
        });
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LunarLoot.MOD_ID, name), item);
    }
}
