package com.benbenlaw.opoliscompat.kubejs.utilities;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.FluidStackComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.neoforged.neoforge.fluids.FluidStack;

public interface FluidGenRecipeJS {
    RecipeKey<FluidStack> FLUID = FluidStackComponent.FLUID_STACK.outputKey("fluid");

    RecipeSchema SCHEMA = new RecipeSchema(FLUID);
}