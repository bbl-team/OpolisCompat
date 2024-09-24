package com.benbenlaw.opoliscompat.kubejs.market;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.*;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.crafting.SizedIngredient;

public interface AdvancedMarketRecipeJS {
    RecipeKey<SizedIngredient> INPUT = SizedIngredientComponent.FLAT.inputKey("input");
    RecipeKey<Ingredient> LICENSE = IngredientComponent.INGREDIENT.inputKey("license");
    RecipeKey<ItemStack> OUTPUT = ItemStackComponent.ITEM_STACK.outputKey("output");
    RecipeKey<Integer> VARIATION = NumberComponent.INT.key("variation", ComponentRole.OTHER);


    RecipeSchema SCHEMA = new RecipeSchema(VARIATION, OUTPUT, LICENSE, INPUT);
}