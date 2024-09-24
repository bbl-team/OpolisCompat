package com.benbenlaw.opoliscompat.kubejs.utilities;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ComponentRole;
import dev.latvian.mods.kubejs.recipe.component.IngredientComponent;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.crafting.Ingredient;

public interface SpeedUpgradesRecipeJS {
    RecipeKey<Ingredient> INPUT = IngredientComponent.INGREDIENT.inputKey("input");
    RecipeKey<Integer> TICK_RATE = NumberComponent.INT.key("tickRate", ComponentRole.OTHER);

    RecipeSchema SCHEMA = new RecipeSchema(INPUT, TICK_RATE);
}