package com.benbenlaw.opoliscompat.kubejs.smelting;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.FluidStackComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.neoforged.neoforge.fluids.FluidStack;

public interface MixingRecipeJS {

    RecipeKey<FluidStack> FLUID_1 = FluidStackComponent.FLUID_STACK.inputKey("fluid1");
    RecipeKey<FluidStack> FLUID_2 = FluidStackComponent.FLUID_STACK.inputKey("fluid2");
    RecipeKey<FluidStack> FLUID_3 = FluidStackComponent.FLUID_STACK.inputKey("fluid3").defaultOptional();
    RecipeKey<FluidStack> FLUID_4 = FluidStackComponent.FLUID_STACK.inputKey("fluid4").defaultOptional();
    RecipeKey<FluidStack> FLUID_5 = FluidStackComponent.FLUID_STACK.inputKey("fluid5").defaultOptional();
    RecipeKey<FluidStack> FLUID_6 = FluidStackComponent.FLUID_STACK.inputKey("fluid6").defaultOptional();
    RecipeKey<FluidStack> OUTPUT = FluidStackComponent.FLUID_STACK.outputKey("output");

    RecipeSchema SCHEMA = new RecipeSchema(OUTPUT, FLUID_1, FLUID_2, FLUID_3, FLUID_4, FLUID_5, FLUID_6);
}