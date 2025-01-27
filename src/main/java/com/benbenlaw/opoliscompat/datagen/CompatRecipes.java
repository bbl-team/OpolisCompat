package com.benbenlaw.opoliscompat.datagen;

import blusunrize.immersiveengineering.api.IETags;
import blusunrize.immersiveengineering.api.crafting.MultiblockRecipe;
import blusunrize.immersiveengineering.common.register.IEItems;
import com.benbenlaw.caveopolis.item.CaveopolisItems;
import com.benbenlaw.cloche.data.recipe.ClocheRecipeProvider;
import com.benbenlaw.core.item.CoreDataComponents;
import com.benbenlaw.core.recipe.ChanceResult;
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

    public CompatRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {

        String[] colors = {
                "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray",
                "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
        };

        //Caveopolis Trees in Cloche
        for (String color : colors) {
            NonNullList<ChanceResult> resultsWithColor = createColoredSaplingResults(color);

            createClocheRecipe(consumer, color, Ingredient.of(CaveopolisItems.COLORED_SAPLING.get()),
                    Ingredient.of(ItemTags.DIRT), null, null, 1200, resultsWithColor,
                    itemWithColor(CaveopolisItems.COLORED_LEAVES.get().getDefaultInstance(), color));

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

    private static ItemStack itemWithColor(ItemStack item, String color) {
        item.set(CoreDataComponents.COLOR, color);
        item.set(CoreDataComponents.LIT, false);
        return item;
    }


}
