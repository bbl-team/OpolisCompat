package com.benbenlaw.opoliscompat.kubejs.utilities;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.IngredientComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.crafting.Ingredient;

public interface ResourceGenRecipeJS {
    RecipeKey<Ingredient> INPUT = IngredientComponent.INGREDIENT.inputKey("input");

    RecipeSchema SCHEMA = new RecipeSchema(INPUT);
}