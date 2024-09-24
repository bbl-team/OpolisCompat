package com.benbenlaw.opoliscompat.kubejs.utilities;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ComponentRole;
import dev.latvian.mods.kubejs.recipe.component.ItemStackComponent;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.component.SizedIngredientComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.common.crafting.SizedIngredient;

public interface SoakingRecipeJS {
    RecipeKey<SizedIngredient> INPUT = SizedIngredientComponent.FLAT.inputKey("input");
    RecipeKey<ItemStack> OUTPUT = ItemStackComponent.ITEM_STACK.outputKey("output");
    RecipeKey<Integer> DURATION = NumberComponent.INT.key("duration", ComponentRole.OTHER);

    RecipeSchema SCHEMA = new RecipeSchema(OUTPUT, INPUT, DURATION);
}