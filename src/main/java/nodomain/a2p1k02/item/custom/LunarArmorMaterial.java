package nodomain.a2p1k02.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import nodomain.a2p1k02.LunarLoot;
import nodomain.a2p1k02.item.ModItems;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class LunarArmorMaterial {
    public static final int LUNAR_DURABILITY_MULTIPLIER = 30;
    public static final RegistryEntry<ArmorMaterial> LUNAR = registerMaterial("lunar",
            Map.of(
                    ArmorItem.Type.HELMET, 12,
                    ArmorItem.Type.CHESTPLATE, 32,
                    ArmorItem.Type.LEGGINGS, 24,
                    ArmorItem.Type.BOOTS, 12
            ),
            20,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ModItems.LUNAR_INGOT),
            12.0F,
            24.0F,
            false);

    public static RegistryEntry<ArmorMaterial> registerMaterial(String id, Map<ArmorItem.Type, Integer> defensePoints, int enchantability, RegistryEntry<SoundEvent> equipSound, Supplier<Ingredient> repairIngredientSupplier, float toughness, float knockbackResistance, boolean dyeable) {
        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(Identifier.of(LunarLoot.MOD_ID, id), "", dyeable)
        );

        ArmorMaterial material = new ArmorMaterial(defensePoints, enchantability, equipSound, repairIngredientSupplier, layers, toughness, knockbackResistance);
        material = Registry.register(Registries.ARMOR_MATERIAL, Identifier.of(LunarLoot.MOD_ID, id), material);

        return RegistryEntry.of(material);
    }
}
