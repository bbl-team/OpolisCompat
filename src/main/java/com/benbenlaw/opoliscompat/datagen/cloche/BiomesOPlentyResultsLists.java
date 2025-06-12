package com.benbenlaw.opoliscompat.datagen.cloche;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.core.BiomesOPlenty;
import com.benbenlaw.core.recipe.ChanceResult;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import twilightforest.init.TFBlocks;
import twilightforest.init.TFItems;

public class BiomesOPlentyResultsLists {

    public static final NonNullList<ChanceResult> ORIGIN_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> FLOWERING_OAK_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> CYPRESS_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> SNOWBLOSSOM_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> RAINBOW_BIRCH_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> FIR_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> PINE_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> RED_MAPLE_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> ORANGE_MAPLE_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> YELLOW_MAPLE_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> REDWOOD_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> MAHOGANY_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> JACARANDA_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> PALM_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> WILLOW_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> DEAD_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> MAGIC_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> UMBRAN_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> HELLBARK_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> EMPYREAL_SAPLING_RESULTS;





    static {
        ORIGIN_SAPLING_RESULTS = NonNullList.create();
        ORIGIN_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.OAK_LOG, 2), 1.0f));
        ORIGIN_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.ORIGIN_SAPLING, 1), 0.2f));
        ORIGIN_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.APPLE, 1), 0.2f));
        ORIGIN_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        FLOWERING_OAK_SAPLING_RESULTS = NonNullList.create();
        FLOWERING_OAK_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.OAK_LOG, 2), 1.0f));
        FLOWERING_OAK_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.FLOWERING_OAK_SAPLING, 1), 0.2f));
        FLOWERING_OAK_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.APPLE, 1), 0.2f));
        FLOWERING_OAK_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        CYPRESS_SAPLING_RESULTS = NonNullList.create();
        CYPRESS_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.SPRUCE_LOG, 2), 1.0f));
        CYPRESS_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.CYPRESS_SAPLING, 1), 0.2f));
        CYPRESS_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        SNOWBLOSSOM_SAPLING_RESULTS = NonNullList.create();
        SNOWBLOSSOM_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.CHERRY_LOG, 2), 1.0f));
        SNOWBLOSSOM_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.SNOWBLOSSOM_SAPLING, 1), 0.2f));
        SNOWBLOSSOM_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        RAINBOW_BIRCH_SAPLING_RESULTS = NonNullList.create();
        RAINBOW_BIRCH_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.BIRCH_LOG, 2), 1.0f));
        RAINBOW_BIRCH_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.RAINBOW_BIRCH_SAPLING, 1), 0.2f));
        RAINBOW_BIRCH_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        FIR_SAPLING_RESULTS = NonNullList.create();
        FIR_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.FIR_LOG, 2), 1.0f));
        FIR_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.FIR_SAPLING, 1), 0.2f));
        FIR_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        PINE_SAPLING_RESULTS = NonNullList.create();
        PINE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.PINE_LOG, 2), 1.0f));
        PINE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.PINE_SAPLING, 1), 0.2f));
        PINE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        RED_MAPLE_SAPLING_RESULTS = NonNullList.create();
        RED_MAPLE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.MAPLE_LOG, 2), 1.0f));
        RED_MAPLE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.RED_MAPLE_SAPLING, 1), 0.2f));
        RED_MAPLE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        ORANGE_MAPLE_SAPLING_RESULTS = NonNullList.create();
        ORANGE_MAPLE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.MAPLE_LOG, 2), 1.0f));
        ORANGE_MAPLE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.ORANGE_MAPLE_SAPLING, 1), 0.2f));
        ORANGE_MAPLE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        YELLOW_MAPLE_SAPLING_RESULTS = NonNullList.create();
        YELLOW_MAPLE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.MAPLE_LOG, 2), 1.0f));
        YELLOW_MAPLE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.YELLOW_MAPLE_SAPLING, 1), 0.2f));
        YELLOW_MAPLE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        REDWOOD_SAPLING_RESULTS = NonNullList.create();
        REDWOOD_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.REDWOOD_LOG, 2), 1.0f));
        REDWOOD_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.REDWOOD_SAPLING, 1), 0.2f));
        REDWOOD_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        MAHOGANY_SAPLING_RESULTS = NonNullList.create();
        MAHOGANY_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.MAHOGANY_LOG, 2), 1.0f));
        MAHOGANY_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.MAHOGANY_SAPLING, 1), 0.2f));
        MAHOGANY_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        JACARANDA_SAPLING_RESULTS = NonNullList.create();
        JACARANDA_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.JACARANDA_LOG, 2), 1.0f));
        JACARANDA_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.JACARANDA_SAPLING, 1), 0.2f));
        JACARANDA_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        PALM_SAPLING_RESULTS = NonNullList.create();
        PALM_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.PALM_LOG, 2), 1.0f));
        PALM_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.PALM_SAPLING, 1), 0.2f));
        PALM_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        WILLOW_SAPLING_RESULTS = NonNullList.create();
        WILLOW_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.WILLOW_LOG, 2), 1.0f));
        WILLOW_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.WILLOW_SAPLING, 1), 0.2f));
        WILLOW_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.WILLOW_VINE, 2), 0.4f));
        WILLOW_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        DEAD_SAPLING_RESULTS = NonNullList.create();
        DEAD_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.DEAD_LOG, 2), 1.0f));
        DEAD_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.DEAD_SAPLING, 1), 0.2f));
        DEAD_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        MAGIC_SAPLING_RESULTS = NonNullList.create();
        MAGIC_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.MAGIC_LOG, 2), 1.0f));
        MAGIC_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.MAGIC_SAPLING, 1), 0.2f));
        MAGIC_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        UMBRAN_SAPLING_RESULTS = NonNullList.create();
        UMBRAN_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.UMBRAN_LOG, 2), 1.0f));
        UMBRAN_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.UMBRAN_SAPLING, 1), 0.2f));
        UMBRAN_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        HELLBARK_SAPLING_RESULTS = NonNullList.create();
        HELLBARK_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.HELLBARK_LOG, 2), 1.0f));
        HELLBARK_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.HELLBARK_SAPLING, 1), 0.2f));
        HELLBARK_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        EMPYREAL_SAPLING_RESULTS = NonNullList.create();
        EMPYREAL_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.EMPYREAL_LOG, 2), 1.0f));
        EMPYREAL_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(BOPBlocks.EMPYREAL_SAPLING, 1), 0.2f));
        EMPYREAL_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));
        EMPYREAL_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.SHROOMLIGHT), 0.05f));

    }
}
