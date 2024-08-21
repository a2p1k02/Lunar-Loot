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
                .pattern("LNL")
                .pattern("LLL")
                .input('L', ModItems.LUNAR_INGOT)
                .input('N', Items.NETHERITE_PICKAXE)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .criterion(hasItem(Items.NETHERITE_PICKAXE), conditionsFromItem(Items.NETHERITE_PICKAXE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_AXE, 1)
                .pattern("LLL")
                .pattern("LNL")
                .pattern("LLL")
                .input('L', ModItems.LUNAR_INGOT)
                .input('N', Items.NETHERITE_AXE)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .criterion(hasItem(Items.NETHERITE_AXE), conditionsFromItem(Items.NETHERITE_AXE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_SHOVEL, 1)
                .pattern("LLL")
                .pattern("LNL")
                .pattern("LLL")
                .input('L', ModItems.LUNAR_INGOT)
                .input('N', Items.NETHERITE_SHOVEL)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .criterion(hasItem(Items.NETHERITE_SHOVEL), conditionsFromItem(Items.NETHERITE_SHOVEL))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_SWORD, 1)
                .pattern("LLL")
                .pattern("LNL")
                .pattern("LLL")
                .input('L', ModItems.LUNAR_INGOT)
                .input('N', Items.NETHERITE_SWORD)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .criterion(hasItem(Items.NETHERITE_SWORD), conditionsFromItem(Items.NETHERITE_SWORD))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_HELMET, 1)
                .pattern("LLL")
                .pattern("LNL")
                .pattern("LLL")
                .input('L', ModItems.LUNAR_INGOT)
                .input('N', Items.NETHERITE_HELMET)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .criterion(hasItem(Items.NETHERITE_HELMET), conditionsFromItem(Items.NETHERITE_HELMET))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_CHESTPLATE, 1)
                .pattern("LLL")
                .pattern("LNL")
                .pattern("LLL")
                .input('L', ModItems.LUNAR_INGOT)
                .input('N', Items.NETHERITE_CHESTPLATE)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .criterion(hasItem(Items.NETHERITE_CHESTPLATE), conditionsFromItem(Items.NETHERITE_CHESTPLATE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_LEGGINGS, 1)
                .pattern("LLL")
                .pattern("LNL")
                .pattern("LLL")
                .input('L', ModItems.LUNAR_INGOT)
                .input('N', Items.NETHERITE_LEGGINGS)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .criterion(hasItem(Items.NETHERITE_LEGGINGS), conditionsFromItem(Items.NETHERITE_LEGGINGS))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LUNAR_BOOTS, 1)
                .pattern("LLL")
                .pattern("LNL")
                .pattern("LLL")
                .input('L', ModItems.LUNAR_INGOT)
                .input('N', Items.NETHERITE_BOOTS)
                .criterion(hasItem(ModItems.LUNAR_INGOT), conditionsFromItem(ModItems.LUNAR_INGOT))
                .criterion(hasItem(Items.NETHERITE_BOOTS), conditionsFromItem(Items.NETHERITE_BOOTS))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.LUNAR_BOOTS)));
    }
}
