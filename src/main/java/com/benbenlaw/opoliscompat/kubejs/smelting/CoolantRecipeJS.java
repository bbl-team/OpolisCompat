package com.benbenlaw.opoliscompat.kubejs.smelting;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ComponentRole;
import dev.latvian.mods.kubejs.recipe.component.FluidStackComponent;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.neoforged.neoforge.fluids.FluidStack;

public interface CoolantRecipeJS {
    RecipeKey<FluidStack> FLUID = FluidStackComponent.FLUID_STACK.inputKey("fluid");
    RecipeKey<Integer> DURATION = NumberComponent.INT.key("duration", ComponentRole.OTHER);

    RecipeSchema SCHEMA = new RecipeSchema(FLUID, DURATION);
}