package nodomain.a2p1k02.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import nodomain.a2p1k02.LunarLoot;
import nodomain.a2p1k02.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> LUNAR_ORE_KEY = registerKey("lunar_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LUNAR_RAW_BLOCK_KEY = registerKey("lunar_raw_block_key");
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldLunarOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.LUNAR_ORE.getDefaultState()));

        register(context, LUNAR_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldLunarOres, 12));

        register(context, LUNAR_RAW_BLOCK_KEY, Feature.ORE, new OreFeatureConfig(overworldLunarOres, 1));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(LunarLoot.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
