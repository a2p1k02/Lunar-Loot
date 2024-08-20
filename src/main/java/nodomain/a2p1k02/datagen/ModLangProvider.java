package nodomain.a2p1k02.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import nodomain.a2p1k02.block.ModBlocks;
import nodomain.a2p1k02.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLangProvider extends FabricLanguageProvider {
    public ModLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.LUNAR_INGOT, "Lunar ingot");
        translationBuilder.add(ModItems.RAW_LUNAR, "Raw lunar");

        translationBuilder.add(ModItems.LUNAR_HELMET, "Lunar helmet");
        translationBuilder.add(ModItems.LUNAR_CHESTPLATE, "Lunar chestplate");
        translationBuilder.add(ModItems.LUNAR_LEGGINGS, "Lunar leggings");
        translationBuilder.add(ModItems.LUNAR_BOOTS, "Lunar boots");

        translationBuilder.add(ModItems.LUNAR_SWORD, "Lunar sword");
        translationBuilder.add(ModItems.LUNAR_PICKAXE, "Lunar pickaxe");
        translationBuilder.add(ModItems.LUNAR_AXE, "Lunar axe");
        translationBuilder.add(ModItems.LUNAR_SHOVEL, "Lunar shovel");

        translationBuilder.add(ModBlocks.LUNAR_RAW_BLOCK, "Lunar raw block");
        translationBuilder.add(ModBlocks.LUNAR_ORE, "Lunar ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_LUNAR_ORE, "Deepslate lunar ore");
    }
}
