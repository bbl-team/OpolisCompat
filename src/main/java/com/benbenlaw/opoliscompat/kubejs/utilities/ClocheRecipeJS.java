package com.benbenlaw.opoliscompat.kubejs.utilities;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.IngredientComponent;
import dev.latvian.mods.kubejs.recipe.component.ItemStackComponent;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public interface ClocheRecipeJS {

    RecipeKey<Ingredient> SEED = IngredientComponent.INGREDIENT.inputKey("seed");
    RecipeKey<Ingredient> CATALYST = IngredientComponent.INGREDIENT.otherKey("catalyst").allowEmpty().defaultOptional();
    RecipeKey<Ingredient> SOIL = IngredientComponent.INGREDIENT.inputKey("soil");
    RecipeKey<ItemStack> MAIN_OUTPUT = ItemStackComponent.ITEM_STACK.outputKey("mainOutput");
    RecipeKey<ItemStack> CHANCE_OUTPUT_1 = ItemStackComponent.ITEM_STACK.outputKey("chanceOutput1").defaultOptional();
    RecipeKey<Double> CHANCE_OUTPUT_CHANCE_1 = NumberComponent.DOUBLE.outputKey("chanceOutputChance1").defaultOptional();
    RecipeKey<ItemStack> CHANCE_OUTPUT_2 = ItemStackComponent.ITEM_STACK.outputKey("chanceOutput2").defaultOptional();
    RecipeKey<Double> CHANCE_OUTPUT_CHANCE_2 = NumberComponent.DOUBLE.outputKey("chanceOutputChance2").defaultOptional();
    RecipeKey<ItemStack> CHANCE_OUTPUT_3 = ItemStackComponent.ITEM_STACK.outputKey("chanceOutput3").defaultOptional();
    RecipeKey<Double> CHANCE_OUTPUT_CHANCE_3 = NumberComponent.DOUBLE.outputKey("chanceOutputChance3").defaultOptional();
    RecipeKey<Double> DURATION_MODIFIER = NumberComponent.DOUBLE.outputKey("durationModifier");


    RecipeSchema SCHEMA = new RecipeSchema(SEED, SOIL, MAIN_OUTPUT, DURATION_MODIFIER, CATALYST, CHANCE_OUTPUT_1, CHANCE_OUTPUT_CHANCE_1, CHANCE_OUTPUT_2, CHANCE_OUTPUT_CHANCE_2, CHANCE_OUTPUT_3, CHANCE_OUTPUT_CHANCE_3);
}