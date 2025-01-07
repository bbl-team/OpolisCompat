package com.benbenlaw.opoliscompat.kubejs.strainers;

import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ComponentRole;
import dev.latvian.mods.kubejs.recipe.component.IngredientComponent;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.crafting.Ingredient;

public interface MeshUpgradeRecipeJS {
    RecipeKey<Ingredient> INPUT = IngredientComponent.INGREDIENT.inputKey("input");
    RecipeKey<Double> MESH_DAMAGE_CHANCE = NumberComponent.DOUBLE.key("meshDamageChance", ComponentRole.OTHER);

    RecipeSchema SCHEMA = new RecipeSchema(INPUT, MESH_DAMAGE_CHANCE);
}