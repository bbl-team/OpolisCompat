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
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.neoforged.neoforge.common.crafting.DataComponentIngredient;

import java.util.concurrent.CompletableFuture;

import static com.benbenlaw.colors.block.ColorsBlocks.*;
import static com.benbenlaw.colors.item.ColorsItems.APPLES;

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

    private static ItemStack itemWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }


}
