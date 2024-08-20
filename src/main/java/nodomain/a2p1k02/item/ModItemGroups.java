package nodomain.a2p1k02.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nodomain.a2p1k02.LunarLoot;
import nodomain.a2p1k02.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ADDITIONAL_FOODS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LunarLoot.MOD_ID, "lunar_ingot"),
            FabricItemGroup.builder().displayName(
                    Text.translatable(ModItems.LUNAR_INGOT.getTranslationKey())).icon(() ->
                    new ItemStack(ModItems.LUNAR_INGOT)).entries((displayContext, entries) -> {
                entries.add(ModBlocks.LUNAR_ORE);
                entries.add(ModBlocks.DEEPSLATE_LUNAR_ORE);
                entries.add(ModBlocks.LUNAR_RAW_BLOCK);

                entries.add(ModItems.RAW_LUNAR);
                entries.add(ModItems.LUNAR_INGOT);
                entries.add(ModItems.LUNAR_SWORD);
                entries.add(ModItems.LUNAR_PICKAXE);
                entries.add(ModItems.LUNAR_AXE);
                entries.add(ModItems.LUNAR_SHOVEL);
            }).build());


    public static void registerItemGroups() {
        LunarLoot.LOGGER.info("Registering Item Groups for " + LunarLoot.MOD_ID);
    }
}
