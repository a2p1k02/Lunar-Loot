package nodomain.a2p1k02.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import nodomain.a2p1k02.block.ModBlocks;
import nodomain.a2p1k02.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.LUNAR_ORE, oreDrops(ModBlocks.LUNAR_ORE, ModItems.RAW_LUNAR));
        addDrop(ModBlocks.DEEPSLATE_LUNAR_ORE, oreDrops(ModBlocks.DEEPSLATE_LUNAR_ORE, ModItems.RAW_LUNAR));
        addDrop(ModBlocks.LUNAR_RAW_BLOCK, drops(ModBlocks.LUNAR_RAW_BLOCK));
    }
}
