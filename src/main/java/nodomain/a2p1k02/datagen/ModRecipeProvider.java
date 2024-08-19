package nodomain.a2p1k02.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import nodomain.a2p1k02.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
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
    }
}