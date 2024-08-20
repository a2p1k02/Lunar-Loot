package nodomain.a2p1k02.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nodomain.a2p1k02.LunarLoot;
import nodomain.a2p1k02.item.custom.LunarArmorMaterial;
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

    public static final Item LUNAR_HELMET = registerItem("lunar_helmet", 
            new ArmorItem(LunarArmorMaterial.LUNAR, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(
                    ArmorItem.Type.HELMET.getMaxDamage(LunarArmorMaterial.LUNAR_DURABILITY_MULTIPLIER)).fireproof()));
    public static final Item LUNAR_CHESTPLATE = registerItem("lunar_chestplate", 
            new ArmorItem(LunarArmorMaterial.LUNAR, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(
                    ArmorItem.Type.CHESTPLATE.getMaxDamage(LunarArmorMaterial.LUNAR_DURABILITY_MULTIPLIER)).fireproof()));
    public static final Item LUNAR_LEGGINGS = registerItem("lunar_leggings", 
            new ArmorItem(LunarArmorMaterial.LUNAR, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(
                    ArmorItem.Type.LEGGINGS.getMaxDamage(LunarArmorMaterial.LUNAR_DURABILITY_MULTIPLIER)).fireproof()));
    public static final Item LUNAR_BOOTS = registerItem("lunar_boots", 
            new ArmorItem(LunarArmorMaterial.LUNAR, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(
                    ArmorItem.Type.BOOTS.getMaxDamage(LunarArmorMaterial.LUNAR_DURABILITY_MULTIPLIER)).fireproof()));


    public static void registerModItems() {
        LunarLoot.LOGGER.info("Mod is available: " + LunarLoot.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(RAW_LUNAR);
            entries.add(LUNAR_INGOT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(LUNAR_SWORD);
            entries.add(LUNAR_HELMET);
            entries.add(LUNAR_CHESTPLATE);
            entries.add(LUNAR_LEGGINGS);
            entries.add(LUNAR_BOOTS);
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
