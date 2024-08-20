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
        translationBuilder.add(ModItems.LUNAR_DUST, "Lunar dust");

        translationBuilder.add(ModItems.LUNAR_SWORD, "Lunar sword");
        translationBuilder.add(ModItems.LUNAR_PICKAXE, "Lunar pickaxe");
        translationBuilder.add(ModItems.LUNAR_AXE, "Lunar axe");
        translationBuilder.add(ModItems.LUNAR_SHOVEL, "Lunar shovel");

        translationBuilder.add(ModBlocks.LUNAR_RAW_BLOCK, "Lunar raw block");
        translationBuilder.add(ModBlocks.LUNAR_ORE, "Lunar ore");
    }
}
