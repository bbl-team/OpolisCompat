package com.benbenlaw.opoliscompat.datagen.recipes;

import com.benbenlaw.opoliscompat.OpolisCompat;
import net.mehvahdjukaar.sawmill.WoodcuttingRecipe;
import net.minecraft.advancements.*;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;

public class SawmillRecipeBuilder implements RecipeBuilder {

    protected String group = ""; // Default to empty string to avoid null issues
    protected Ingredient input;
    protected ItemStack output;
    protected int inputCount;
    protected final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();

    public SawmillRecipeBuilder(Ingredient input, ItemStack output, int inputCount) {
        if (input == null || output == null) {
            throw new IllegalArgumentException("Input and output cannot be null");
        }
        this.input = input;
        this.output = output;
        this.inputCount = inputCount;
    }

    public static SawmillRecipeBuilder create(Ingredient input, ItemStack output, int inputCount) {
        return new SawmillRecipeBuilder(input, output, inputCount);
    }

    @Override
    public @NotNull RecipeBuilder unlockedBy(String name, Criterion<?> criterion) {
        this.criteria.put(name, criterion);
        return this;
    }

    @Override
    public @NotNull RecipeBuilder group(@Nullable String groupName) {
        this.group = groupName != null ? groupName : ""; // Ensure groupName is not null
        return this;
    }

    @Override
    public @NotNull Item getResult() {
        return output.getItem();
    }

    public void save(@NotNull RecipeOutput recipeOutput) {
        this.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/" +
                BuiltInRegistries.ITEM.getKey(this.output.getItem()).getPath()));
    }

    @Override
    public void save(@NotNull RecipeOutput recipeOutput, @NotNull ResourceLocation id) {

        Advancement.Builder builder = Advancement.Builder.advancement()
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
                .rewards(AdvancementRewards.Builder.recipe(id))
                .requirements(AdvancementRequirements.Strategy.OR);

        this.criteria.forEach(builder::addCriterion);

        WoodcuttingRecipe woodcuttingRecipe = new WoodcuttingRecipe(group, this.input, this.output, this.inputCount);
        // Check if `id` is valid before calling withPrefix
        ResourceLocation prefixedId = id.withPrefix("sawmill/sawmill");
        recipeOutput.accept(id, woodcuttingRecipe, builder.build(prefixedId));
    }

}