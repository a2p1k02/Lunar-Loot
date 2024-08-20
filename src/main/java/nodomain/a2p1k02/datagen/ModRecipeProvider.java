package nodomain.a2p1k02.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapelessRecipe;
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_LUNAR, 9)
                .pattern("R")
                .input('R', ModBlocks.LUNAR_RAW_BLOCK)
                .criterion(hasItem(ModBlocks.LUNAR_RAW_BLOCK), conditionsFromItem(ModBlocks.LUNAR_RAW_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.RAW_LUNAR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LUNAR_DUST, 4)
                .pattern(" P ")
                .pattern("PSP")
                .pattern(" P ")
                .input('P', Items.BLAZE_POWDER)
                .input('S', Items.NETHER_STAR)
                .criterion(hasItem(Items.BLAZE_POWDER), conditionsFromItem(Items.BLAZE_POWDER))
                .criterion(hasItem(Items.NETHER_STAR), conditionsFromItem(Items.NETHER_STAR))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_DUST)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LUNAR_INGOT, 1)
                .pattern(" D ")
                .pattern("DID")
                .pattern(" D ")
                .input('D', ModItems.LUNAR_DUST)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.LUNAR_DUST), conditionsFromItem(ModItems.LUNAR_DUST))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_INGOT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_PICKAXE, 1)
                .pattern("LLL")
                .pattern(" S ")
                .pattern(" S ")
                .input('L', ModItems.LUNAR_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_PICKAXE)));
    }
}
