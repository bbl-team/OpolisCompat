package com.benbenlaw.opoliscompat.kubejs.cloche;

import com.benbenlaw.core.recipe.ChanceResult;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.*;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;

public interface ClocheRecipeJS {

    //This needs a lot of work to create a chance result component i have no idea how to do that

    /*
    RecipeKey<Ingredient> SEED = IngredientComponent.INGREDIENT.inputKey("seed");
    RecipeKey<Ingredient> SOIL = IngredientComponent.INGREDIENT.inputKey("soil");
    RecipeKey<Ingredient> CATALYST = IngredientComponent.INGREDIENT.inputKey("catalyst");
    RecipeKey<String> DIMENSION =  StringComponent.NON_EMPTY.inputKey("dimension");
    RecipeKey<Integer> DURATION =  NumberComponent.INT.inputKey("duration");
    RecipeKey<List<ChanceResult>> OUTPUTS = ChanceResultComponent.CHANCE_RESULT.asList().inputKey("results");
    RecipeKey<ItemStack> SHEARS_RESULT = ItemStackComponent.ITEM_STACK.inputKey("shears_result");

    RecipeSchema SCHEMA = new RecipeSchema(SEED, SOIL, CATALYST, DIMENSION, DURATION, OUTPUTS, SHEARS_RESULT);

    */

}
