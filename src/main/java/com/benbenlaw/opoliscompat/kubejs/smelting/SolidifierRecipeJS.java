package com.benbenlaw.opoliscompat.kubejs.smelting;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.FluidStackComponent;
import dev.latvian.mods.kubejs.recipe.component.SizedIngredientComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.neoforged.neoforge.common.crafting.SizedIngredient;
import net.neoforged.neoforge.fluids.FluidStack;

public interface SolidifierRecipeJS {

    RecipeKey<SizedIngredient> MOLD = SizedIngredientComponent.FLAT.inputKey("mold");
    RecipeKey<FluidStack> FLUID = FluidStackComponent.FLUID_STACK.inputKey("fluid");
    RecipeKey<SizedIngredient> OUTPUT = SizedIngredientComponent.FLAT.outputKey("output");



    RecipeSchema SCHEMA = new RecipeSchema(MOLD, FLUID, OUTPUT);
}