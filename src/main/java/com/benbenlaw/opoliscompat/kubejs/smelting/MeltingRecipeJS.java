package com.benbenlaw.opoliscompat.kubejs.smelting;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ComponentRole;
import dev.latvian.mods.kubejs.recipe.component.FluidStackComponent;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.component.SizedIngredientComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.neoforged.neoforge.common.crafting.SizedIngredient;
import net.neoforged.neoforge.fluids.FluidStack;

public interface MeltingRecipeJS {

    RecipeKey<SizedIngredient> INPUT = SizedIngredientComponent.FLAT.inputKey("input");
    RecipeKey<FluidStack> OUTPUT = FluidStackComponent.FLUID_STACK.outputKey("output");
    RecipeKey<Integer> MELTING_TEMP = NumberComponent.INT.key("meltingTemp", ComponentRole.OTHER);

    RecipeSchema SCHEMA = new RecipeSchema(INPUT, OUTPUT, MELTING_TEMP);
}