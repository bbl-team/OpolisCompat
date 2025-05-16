package com.benbenlaw.opoliscompat.datagen;

import blusunrize.immersiveengineering.api.IETags;
import blusunrize.immersiveengineering.api.crafting.MultiblockRecipe;
import blusunrize.immersiveengineering.common.register.IEItems;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.cloche.Cloche;
import com.benbenlaw.cloche.data.recipe.ClocheRecipeProvider;
import com.benbenlaw.core.item.CoreDataComponents;
import com.benbenlaw.core.recipe.ChanceResult;
import com.benbenlaw.core.util.ColorList;
import com.benbenlaw.opoliscompat.Compat;
import com.benbenlaw.opoliscompat.datagen.cloche.CompatResultLists;
import com.benbenlaw.opoliscompat.datagen.cloche.MysticalResources;
import com.benbenlaw.opoliscompat.datagen.cloche.TwilightResultLists;
import com.blakebr0.mysticalagradditions.MysticalAgradditions;
import com.blakebr0.mysticalagriculture.MysticalAgriculture;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.core.component.DataComponentPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.neoforged.neoforge.common.crafting.DataComponentIngredient;
import twilightforest.init.TFBlocks;

import java.util.concurrent.CompletableFuture;

import static com.benbenlaw.colors.block.ColorsBlocks.*;
import static com.benbenlaw.colors.item.ColorsItems.APPLES;
import static com.benbenlaw.opoliscompat.datagen.cloche.CompatResultLists.INFERIUM_FARMLAND;

public class CompatRecipes extends RecipeProvider {

    public static NonNullList<ChanceResult> createColoredSaplingResults(String color) {
        NonNullList<ChanceResult> coloredSaplingResults = NonNullList.create();

        coloredSaplingResults.add(new ChanceResult(
                itemWithColor(new ItemStack(CaveopolisItems.COLORED_LOG.get(), 2), color), 1.0f));
        coloredSaplingResults.add(new ChanceResult(
                itemWithColor(new ItemStack(CaveopolisItems.COLORED_SAPLING.get()), color), 0.2f));
        coloredSaplingResults.add(new ChanceResult(
                itemWithColor(new ItemStack(CaveopolisItems.COLORED_APPLE.get()), color), 0.2f));
        coloredSaplingResults.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        return coloredSaplingResults;
    }

    public static NonNullList<ChanceResult> createColoredSaplingResultsColors(String color) {
        NonNullList<ChanceResult> coloredSaplingResultsColors = NonNullList.create();

        coloredSaplingResultsColors.add(new ChanceResult(
                new ItemStack(LOGS.get(color + "_log"), 2), 1.0f));
        coloredSaplingResultsColors.add(new ChanceResult(
                new ItemStack(SAPLINGS.get(color + "_sapling"), 1), 0.2f));
        coloredSaplingResultsColors.add(new ChanceResult(
                new ItemStack(APPLES.get(color + "_apple").get(), 1), 0.2f));
        coloredSaplingResultsColors.add(new ChanceResult(new ItemStack(Items.STICK), 0.1f));

        return coloredSaplingResultsColors;
    }

    public CompatRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {

        //Twilight Forest Cloche Recipes
        ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(TFBlocks.TWILIGHT_OAK_SAPLING), Ingredient.of(ItemTags.DIRT), null,
                        null, 1200, TwilightResultLists.TWILIGHT_OAK_SAPLING_RESULTS, TFBlocks.TWILIGHT_OAK_LEAVES.toStack())
                .save(consumer.withConditions(new ModLoadedCondition("twilightforest")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/twilightforest/twilight_oak_sapling"));

        ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(TFBlocks.CANOPY_SAPLING), Ingredient.of(ItemTags.DIRT), null,
                        null, 1200, TwilightResultLists.CANOPY_SAPLING_RESULTS, TFBlocks.CANOPY_LEAVES.toStack())
                .save(consumer.withConditions(new ModLoadedCondition("twilightforest")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/twilightforest/canopy_sapling"));

        ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(TFBlocks.MANGROVE_SAPLING), Ingredient.of(ItemTags.DIRT), null,
                        null, 1200, TwilightResultLists.MANGROVE_SAPLING_RESULTS, TFBlocks.MANGROVE_LEAVES.toStack())
                .save(consumer.withConditions(new ModLoadedCondition("twilightforest")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/twilightforest/mangrove_sapling"));

        ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(TFBlocks.DARKWOOD_SAPLING), Ingredient.of(ItemTags.DIRT), null,
                        null, 1200, TwilightResultLists.DARKWOOD_SAPLING_RESULTS, TFBlocks.DARK_LEAVES.toStack())
                .save(consumer.withConditions(new ModLoadedCondition("twilightforest")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/twilightforest/darkwood_sapling"));

        ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(TFBlocks.TIME_SAPLING), Ingredient.of(ItemTags.DIRT), null,
                        null, 1200, TwilightResultLists.TIME_SAPLING_RESULTS, TFBlocks.TIME_LEAVES.toStack())
                .save(consumer.withConditions(new ModLoadedCondition("twilightforest")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/twilightforest/time_sapling"));

        ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(TFBlocks.TRANSFORMATION_SAPLING), Ingredient.of(ItemTags.DIRT), null,
                        null, 1200, TwilightResultLists.TRANSFORMATION_SAPLING_RESULTS, TFBlocks.TRANSFORMATION_LEAVES.toStack())
                .save(consumer.withConditions(new ModLoadedCondition("twilightforest")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/twilightforest/transformation_sapling"));

        ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(TFBlocks.MINING_SAPLING), Ingredient.of(ItemTags.DIRT), null,
                        null, 1200, TwilightResultLists.MINERS_SAPLING_RESULTS, TFBlocks.MINING_LEAVES.toStack())
                .save(consumer.withConditions(new ModLoadedCondition("twilightforest")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/twilightforest/mining_sapling"));

        ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(TFBlocks.SORTING_SAPLING), Ingredient.of(ItemTags.DIRT), null,
                        null, 1200, TwilightResultLists.SORTING_SAPLING_RESULTS, TFBlocks.SORTING_LEAVES.toStack())
                .save(consumer.withConditions(new ModLoadedCondition("twilightforest")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/twilightforest/sorting_sapling"));

        ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(TFBlocks.HOLLOW_OAK_SAPLING), Ingredient.of(ItemTags.DIRT), null,
                        null, 1200, TwilightResultLists.ROBUST_OAK_SAPLING_RESULTS, TFBlocks.TWILIGHT_OAK_LEAVES.toStack())
                .save(consumer.withConditions(new ModLoadedCondition("twilightforest")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/twilightforest/robust_oak_sapling"));

        ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(TFBlocks.RAINBOW_OAK_SAPLING), Ingredient.of(ItemTags.DIRT), null,
                        null, 1200, TwilightResultLists.RAINBOW_OAK_RESULTS, TFBlocks.RAINBOW_OAK_LEAVES.toStack())
                .save(consumer.withConditions(new ModLoadedCondition("twilightforest")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/twilightforest/rainbow_oak_sapling"));

        ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(TFBlocks.TORCHBERRY_PLANT), Ingredient.of(ItemTags.DIRT), null,
                        null, 1200, TwilightResultLists.TORCHBERRY_RESULTS, null)
                .save(consumer.withConditions(new ModLoadedCondition("twilightforest")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/twilightforest/torchberry_bush"));

        createSimpleClocheTwilightForestRecipe(Ingredient.of(TFBlocks.MUSHGLOOM.get().asItem()), Ingredient.of(ItemTags.DIRT), 1200, "mushgloom", consumer);
        createSimpleClocheTwilightForestRecipe(Ingredient.of(TFBlocks.MOSS_PATCH.get().asItem()), Ingredient.of(ItemTags.DIRT), 1200, "moss_patch", consumer);
        createSimpleClocheTwilightForestRecipe(Ingredient.of(TFBlocks.MAYAPPLE.get().asItem()), Ingredient.of(ItemTags.DIRT), 1200, "mayapple", consumer);
        createSimpleClocheTwilightForestRecipe(Ingredient.of(TFBlocks.CLOVER_PATCH.get().asItem()), Ingredient.of(ItemTags.DIRT), 1200, "clover_patch", consumer);
        createSimpleClocheTwilightForestRecipe(Ingredient.of(TFBlocks.FIDDLEHEAD.get().asItem()), Ingredient.of(ItemTags.DIRT), 1200, "fiddlehead", consumer);
        createSimpleClocheTwilightForestRecipe(Ingredient.of(TFBlocks.HUGE_LILY_PAD.get().asItem()), Ingredient.of(Items.WATER_BUCKET), 1200, "huge_lily_pad", consumer);
        createSimpleClocheTwilightForestRecipe(Ingredient.of(TFBlocks.HUGE_WATER_LILY.get().asItem()), Ingredient.of(Items.WATER_BUCKET), 1200, "huge_water_lily", consumer);
        createSimpleClocheTwilightForestRecipe(Ingredient.of(TFBlocks.THORN_ROSE.get().asItem()), Ingredient.of(ItemTags.DIRT), 1200, "thorn_rose", consumer);
        createSimpleClocheTwilightForestRecipe(Ingredient.of(TFBlocks.GREEN_THORNS.get().asItem()), Ingredient.of(ItemTags.DIRT), 1200, "green_thorns", consumer);
        createSimpleClocheTwilightForestRecipe(Ingredient.of(TFBlocks.BROWN_THORNS.get().asItem()), Ingredient.of(ItemTags.DIRT), 1200, "brown_thorns", consumer);


        //Mystical Cloche Recipes
        for (String type : MysticalResources.TIER_1_SEEDS) {
            Item seed = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_seeds"));

            ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(seed), Ingredient.of(INFERIUM_FARMLAND), null,
                            null, 2400, CompatResultLists.RESULTS_LIST_BY_TYPE.get(type), null)
                    .save(consumer.withConditions(new ModLoadedCondition("mysticalagriculture")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/mysticalagriculture/" + type + "_seed"));
        }

        for (String type : MysticalResources.TIER_2_SEEDS) {
            Item seed = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_seeds"));

            ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(seed), Ingredient.of(CompatResultLists.PRUDENTIUM_FARMLAND), null,
                            null, 2400, CompatResultLists.RESULTS_LIST_BY_TYPE.get(type), null)
                    .save(consumer.withConditions(new ModLoadedCondition("mysticalagriculture")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/mysticalagriculture/" + type + "_seed"));
        }

        for (String type : MysticalResources.TIER_3_SEEDS) {
            Item seed = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_seeds"));

            ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(seed), Ingredient.of(CompatResultLists.TERTIUM_FARMLAND), null,
                            null, 2400, CompatResultLists.RESULTS_LIST_BY_TYPE.get(type), null)
                    .save(consumer.withConditions(new ModLoadedCondition("mysticalagriculture")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/mysticalagriculture/" + type + "_seed"));
        }

        for (String type : MysticalResources.TIER_4_SEEDS) {
            Item seed = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_seeds"));

            ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(seed), Ingredient.of(CompatResultLists.IMPERIUM_FARMLAND), null,
                            null, 2400, CompatResultLists.RESULTS_LIST_BY_TYPE.get(type), null)
                    .save(consumer.withConditions(new ModLoadedCondition("mysticalagriculture")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/mysticalagriculture/" + type + "_seed"));
        }

        for (String type : MysticalResources.TIER_5_SEEDS) {
            Item seed = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_seeds"));

            ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(seed), Ingredient.of(CompatResultLists.SUPREMIUM_FARMLAND), null,
                            null, 2400, CompatResultLists.RESULTS_LIST_BY_TYPE.get(type), null)
                    .save(consumer.withConditions(new ModLoadedCondition("mysticalagriculture")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/mysticalagriculture/" + type + "_seed"));
        }

       for (String type : MysticalResources.TIER_6_SEEDS) {
           Item seed = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_seeds"));
           Item crux = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgradditions.MOD_ID, type + "_crux"));

           ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(seed), Ingredient.of(CompatResultLists.INSANIUM_FARMLAND), Ingredient.of(crux),
                           null, 3000, CompatResultLists.RESULTS_LIST_BY_TYPE.get(type), null)
                   .save(consumer.withConditions(new ModLoadedCondition("mysticalagradditions")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/mysticalagriculture/" + type + "_seed"));
       }



        for (String color : ColorList.COLORS) {

            NonNullList<ChanceResult> resultsWithColor = createColoredSaplingResults(color);

            //Saplings in Cloche - Caveopolis
            createClocheRecipe(consumer, color, Ingredient.of(CaveopolisItems.COLORED_SAPLING.get()),
                    Ingredient.of(ItemTags.DIRT), null, null, 1200, resultsWithColor,
                    itemWithColor(CaveopolisItems.COLORED_LEAVES.get().getDefaultInstance(), color));

            //Poppy in Cloche - Caveopolis
            createSimpleClocheRecipe(CaveopolisItems.COLORED_POPPY.get().getDefaultInstance(),
                    Ingredient.of(ItemTags.DIRT), 1200, color, "_poppy", consumer);

            //Dandelion in Cloche - Caveopolis
            createSimpleClocheRecipe(CaveopolisItems.COLORED_DANDELION.get().getDefaultInstance(),
                    Ingredient.of(ItemTags.DIRT), 1200, color, "_dandelion", consumer);

            //Saplings in Cloche - Colors

            NonNullList<ChanceResult> resultsColors = createColoredSaplingResultsColors(color);

            ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(SAPLINGS.get(color + "_sapling")), Ingredient.of(ItemTags.DIRT), null,
                            null, 1200, resultsColors, LEAVES.get(color + "_leaves").toStack())
                    .save(consumer.withConditions(new ModLoadedCondition("colors")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/colors/" + color + "_sapling"));

            //Poppy in Cloche - Colors

            NonNullList<ChanceResult> poppy = NonNullList.create();
            poppy.add(new ChanceResult(new ItemStack(POPPY.get(color + "_poppy")), 1.0f));

            ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(POPPY.get(color + "_poppy")), Ingredient.of(ItemTags.DIRT), null,
                            null, 1200, poppy, null)
                    .save(consumer.withConditions(new ModLoadedCondition("colors")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/colors/" + color + "_poppy"));

            //Dandelion in Cloche - Colors

            NonNullList<ChanceResult> dandelion = NonNullList.create();
            dandelion.add(new ChanceResult(new ItemStack(DANDELION.get(color + "_dandelion")), 1.0f));

            ClocheRecipeProvider.ClocheRecipeBuilder(Ingredient.of(DANDELION.get(color + "_dandelion")), Ingredient.of(ItemTags.DIRT), null,
                            null, 1200, dandelion, null)
                    .save(consumer.withConditions(new ModLoadedCondition("colors")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/colors/" + color + "_dandelion"));

        }

        //Immersive Metal Press


    }


    private void createClocheRecipe(RecipeOutput consumer, String color, Ingredient seed, Ingredient soil, Ingredient catalyst, String dimension, int duration, NonNullList<ChanceResult> results, ItemStack shearsResult) {
        final Ingredient saplingColor = DataComponentIngredient.of(false, DataComponentPredicate.builder()
                        .expect(CoreDataComponents.COLOR.get(), color).build(),
                itemWithColor(new ItemStack(seed.getItems()[0].getItem()), color).getItem());
        ItemStack shearsResultColor = itemWithColor(shearsResult, color);
        shearsResultColor.setCount(2);

        ClocheRecipeProvider.ClocheRecipeBuilder(saplingColor, soil, catalyst,
                        dimension, duration, results, shearsResultColor)
                .save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/caveopolis/" + color + "_sapling"));
    }
    private void createSimpleClocheRecipe(ItemStack seed, Ingredient soil, int duration, String color, String name, RecipeOutput consumer) {

        final Ingredient flowerColor = DataComponentIngredient.of(false, DataComponentPredicate.builder()
                        .expect(CoreDataComponents.COLOR.get(), color).build(),
                itemWithColor(new ItemStack(seed.getItem()), color).getItem());

        NonNullList<ChanceResult> SINGLE_ITEM_RESULTS = NonNullList.create();
        SINGLE_ITEM_RESULTS.add(new ChanceResult(itemWithColor(new ItemStack(seed.getItem()), color), 1.0f));


        ClocheRecipeProvider.ClocheRecipeBuilder(flowerColor, soil, null,
                        null, duration, SINGLE_ITEM_RESULTS, null)
                .save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/caveopolis/" + color + name));
    }

    private void createSimpleClocheTwilightForestRecipe(Ingredient seed, Ingredient soil, int duration, String name, RecipeOutput consumer) {

        NonNullList<ChanceResult> SINGLE_ITEM_RESULTS = NonNullList.create();
        SINGLE_ITEM_RESULTS.add(new ChanceResult(new ItemStack(seed.getItems()[0].getItem(), 1), 1.0f));


        ClocheRecipeProvider.ClocheRecipeBuilder(seed, soil, null,
                        null, duration, SINGLE_ITEM_RESULTS, null)
                .save(consumer.withConditions(new ModLoadedCondition("twilightforest")).withConditions(new ModLoadedCondition("cloche")), ResourceLocation.fromNamespaceAndPath(Compat.MOD_ID, "cloche/twilightforest/" + name));
    }

    private static ItemStack itemWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }


}
