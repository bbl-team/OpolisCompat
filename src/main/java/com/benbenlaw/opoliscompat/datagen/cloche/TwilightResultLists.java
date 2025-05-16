package com.benbenlaw.opoliscompat.datagen.cloche;

import com.benbenlaw.core.recipe.ChanceResult;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import twilightforest.init.TFBlocks;
import twilightforest.init.TFItems;

public class TwilightResultLists {

    public static final NonNullList<ChanceResult> TWILIGHT_OAK_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> CANOPY_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> MANGROVE_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> DARKWOOD_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> TIME_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> TRANSFORMATION_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> MINERS_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> SORTING_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> ROBUST_OAK_SAPLING_RESULTS;
    public static final NonNullList<ChanceResult> RAINBOW_OAK_RESULTS;
    public static final NonNullList<ChanceResult> TORCHBERRY_RESULTS;




    static {
        TWILIGHT_OAK_SAPLING_RESULTS = NonNullList.create();
        TWILIGHT_OAK_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.TWILIGHT_OAK_LOG, 2), 1.0f));
        TWILIGHT_OAK_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.TWILIGHT_OAK_SAPLING, 1), 0.2f));
        TWILIGHT_OAK_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.FIREFLY, 1), 0.1f));
        TWILIGHT_OAK_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        CANOPY_SAPLING_RESULTS = NonNullList.create();
        CANOPY_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.CANOPY_LOG, 2), 1.0f));
        CANOPY_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.CANOPY_SAPLING, 1), 0.2f));
        CANOPY_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.FIREFLY, 1), 0.1f));
        CANOPY_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        MANGROVE_SAPLING_RESULTS = NonNullList.create();
        MANGROVE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.MANGROVE_LOG, 2), 1.0f));
        MANGROVE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.MANGROVE_SAPLING, 1), 0.2f));
        MANGROVE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.FIREFLY, 1), 0.1f));
        MANGROVE_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        DARKWOOD_SAPLING_RESULTS = NonNullList.create();
        DARKWOOD_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.DARK_LOG, 2), 1.0f));
        DARKWOOD_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.DARKWOOD_SAPLING, 1), 0.2f));
        DARKWOOD_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        TIME_SAPLING_RESULTS = NonNullList.create();
        TIME_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.TIME_LOG, 2), 1.0f));
        TIME_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.TIME_SAPLING, 1), 0.2f));
        TIME_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.TIME_LOG_CORE, 1), 0.01f));
        TIME_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        TRANSFORMATION_SAPLING_RESULTS = NonNullList.create();
        TRANSFORMATION_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.TRANSFORMATION_LOG, 2), 1.0f));
        TRANSFORMATION_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.TRANSFORMATION_SAPLING, 1), 0.2f));
        TRANSFORMATION_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.TRANSFORMATION_LOG_CORE, 1), 0.01f));
        TRANSFORMATION_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        MINERS_SAPLING_RESULTS = NonNullList.create();
        MINERS_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.MINING_LOG, 2), 1.0f));
        MINERS_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.MINING_SAPLING, 1), 0.2f));
        TRANSFORMATION_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.MINING_LOG_CORE, 1), 0.01f));
        MINERS_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        SORTING_SAPLING_RESULTS = NonNullList.create();
        SORTING_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.SORTING_LOG, 2), 1.0f));
        SORTING_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.SORTING_SAPLING, 1), 0.2f));
        SORTING_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.SORTING_LOG_CORE, 1), 0.01f));
        SORTING_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        ROBUST_OAK_SAPLING_RESULTS = NonNullList.create();
        ROBUST_OAK_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.TWILIGHT_OAK_LOG, 2), 1.0f));
        ROBUST_OAK_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.HOLLOW_OAK_SAPLING, 1), 0.2f));
        SORTING_SAPLING_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        RAINBOW_OAK_RESULTS = NonNullList.create();
        RAINBOW_OAK_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.TWILIGHT_OAK_LOG, 2), 1.0f));
        RAINBOW_OAK_RESULTS.add(new ChanceResult(new ItemStack(TFBlocks.RAINBOW_OAK_SAPLING, 1), 0.2f));
        RAINBOW_OAK_RESULTS.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        TORCHBERRY_RESULTS = NonNullList.create();
        TORCHBERRY_RESULTS.add(new ChanceResult(new ItemStack(TFItems.TORCHBERRIES.get(), 1), 1f));

    }

}
