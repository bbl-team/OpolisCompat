package com.benbenlaw.opoliscompat.kubejs.strainers;

import com.benbenlaw.core.recipe.ChanceResult;
import com.benbenlaw.opoliscompat.kubejs.ChanceResultComponent;
import com.benbenlaw.opoliscompat.kubejs.MeshChanceResultComponent;
import com.benbenlaw.strainers.recipe.MeshChanceResult;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.*;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.crafting.SizedIngredient;

import java.util.List;

public interface UpdatedStrainerRecipeJS {
    RecipeKey<BlockState> ABOVE_BLOCK = BlockStateComponent.BLOCK.key("above_block", ComponentRole.INPUT);
    RecipeKey<Ingredient> INPUT = IngredientComponent.INGREDIENT.inputKey("input");
    RecipeKey<List<MeshChanceResult>> OUTPUTS = MeshChanceResultComponent.MESH_CHANCE_RESULT.asList().inputKey("results");

    RecipeSchema SCHEMA = new RecipeSchema(INPUT, ABOVE_BLOCK, OUTPUTS);
}