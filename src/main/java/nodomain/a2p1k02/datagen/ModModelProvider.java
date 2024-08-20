package nodomain.a2p1k02.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import nodomain.a2p1k02.block.ModBlocks;
import nodomain.a2p1k02.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LUNAR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_LUNAR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LUNAR_RAW_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_LUNAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUNAR_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.LUNAR_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LUNAR_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LUNAR_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LUNAR_SHOVEL, Models.HANDHELD);
    }
}
