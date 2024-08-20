package nodomain.a2p1k02.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import nodomain.a2p1k02.block.ModBlocks;
import nodomain.a2p1k02.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_LUNAR), RecipeCategory.MISC, ModItems.LUNAR_INGOT, 0.7f, 200, "");
        offerSmelting(exporter, List.of(ModBlocks.LUNAR_ORE), RecipeCategory.MISC, ModItems.RAW_LUNAR, 0.7f, 200, "");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_LUNAR, 9)
                .pattern("R")
                .input('R', ModBlocks.LUNAR_RAW_BLOCK)
                .criterion(hasItem(ModBlocks.LUNAR_RAW_BLOCK), conditionsFromItem(ModBlocks.LUNAR_RAW_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.RAW_LUNAR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_PICKAXE, 1)
                .pattern("LLL")
                .pattern(" S ")
                .pattern(" S ")
                .input('L', ModItems.LUNAR_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_AXE, 1)
                .pattern("LL")
                .pattern("SL")
                .pattern("S ")
                .input('L', ModItems.LUNAR_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_SHOVEL, 1)
                .pattern("L")
                .pattern("S")
                .pattern("S")
                .input('L', ModItems.LUNAR_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_SWORD, 1)
                .pattern("L")
                .pattern("L")
                .pattern("S")
                .input('L', ModItems.LUNAR_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_HELMET, 1)
                .pattern("LLL")
                .pattern("L L")
                .input('L', ModItems.LUNAR_INGOT)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_CHESTPLATE, 1)
                .pattern("L L")
                .pattern("LLL")
                .pattern("LLL")
                .input('L', ModItems.LUNAR_INGOT)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_LEGGINGS, 1)
                .pattern("LLL")
                .pattern("L L")
                .pattern("L L")
                .input('L', ModItems.LUNAR_INGOT)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_BOOTS, 1)
                .pattern("L L")
                .pattern("L L")
                .input('L', ModItems.LUNAR_INGOT)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_BOOTS)));
    }
}
