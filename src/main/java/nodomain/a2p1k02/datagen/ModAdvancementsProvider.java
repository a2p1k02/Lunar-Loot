package nodomain.a2p1k02.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.*;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nodomain.a2p1k02.LunarLoot;
import nodomain.a2p1k02.item.ModItems;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementsProvider extends FabricAdvancementProvider {
    public ModAdvancementsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.WrapperLookup registryLookup, Consumer<AdvancementEntry> consumer) {
        AdvancementEntry rootAdvancement  = Advancement.Builder.create()
                .display(
                        ModItems.LUNAR_INGOT, // The display icon
                        Text.literal("Moonwalk"), // The title
                        Text.literal("Get the Lunar ingot"), // The description
                        Identifier.of("textures/gui/advancements/backgrounds/adventure.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        true // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_lunar_ingot", InventoryChangedCriterion.Conditions.items(ModItems.LUNAR_INGOT))
                .build(consumer, LunarLoot.MOD_ID + "/got_lunar_ingot");

        AdvancementEntry getLunarTools = Advancement.Builder.create()
                .parent(rootAdvancement)
                .display(
                        ModItems.LUNAR_PICKAXE, // The display icon
                        Text.literal("Touch the Moon"), // The title
                        Text.literal("Create a full lunar tool set"), // The description
                        Identifier.of("textures/gui/advancements/backgrounds/adventure.png"), // Background image used
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        true // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_lunar_tools", InventoryChangedCriterion.Conditions.items(ModItems.LUNAR_PICKAXE,
                                ModItems.LUNAR_AXE, ModItems.LUNAR_SHOVEL, ModItems.LUNAR_SWORD))
                .build(consumer, LunarLoot.MOD_ID + "/root");

//        AdvancementEntry getLunarArmor = Advancement.Builder.create()
//                .parent(rootAdvancement)
//                .display(
//                        ModItems.LUNAR_PICKAXE, // The display icon
//                        Text.literal("Moon Prism Power, Make Up!"), // The title
//                        Text.literal("Create a full lunar armor set"), // The description
//                        Identifier.of("textures/gui/advancements/backgrounds/adventure.png"), // Background image used
//                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
//                        true, // Show toast top right
//                        true, // Announce to chat
//                        true // Hidden in the advancement tab
//                )
//                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
//                .criterion("got_lunar_tools", InventoryChangedCriterion.Conditions.items(ModItems.LUNAR_HELMET,
//                        ModItems.LUNAR_CHESTPLATE, ModItems.LUNAR_LEGGINGS, ModItems.LUNAR_BOOTS))
//                .build(consumer, LunarLoot.MOD_ID + "/root");
    }
}
