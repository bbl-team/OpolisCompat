package com.benbenlaw.opoliscompat.datagen;

import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.util.ModTags;
import com.benbenlaw.opoliscompat.OpolisCompat;
import com.benbenlaw.opoliscompat.datagen.recipes.SawmillRecipeBuilder;
import com.benbenlaw.opolisutilities.OpolisUtilities;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;

import java.util.concurrent.CompletableFuture;

public class OpolisCompatRecipes extends RecipeProvider {

    public OpolisCompatRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {

        // ********** Sawmill Support for Caveopolis Wood ********** //

        //Black Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLACK_COLORED_LOGS), new ItemStack(ModBlocks.BLACK_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLACK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLACK_COLORED_LOGS), new ItemStack(ModBlocks.BLACK_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLACK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLACK_COLORED_LOGS), new ItemStack(ModBlocks.BLACK_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLACK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLACK_COLORED_LOGS), new ItemStack(ModBlocks.BLACK_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLACK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLACK_COLORED_LOGS), new ItemStack(ModBlocks.BLACK_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLACK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLACK_COLORED_LOGS), new ItemStack(ModBlocks.BLACK_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLACK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLACK_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_BLACK_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLACK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLACK_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_BLACK_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLACK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLACK_COLORED_LOGS), new ItemStack(ModBlocks.BLACK_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLACK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLACK_COLORED_LOGS), new ItemStack(ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLACK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLACK_COLORED_LOGS), new ItemStack(ModBlocks.BLACK_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLACK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLACK_COLORED_LOGS), new ItemStack(ModBlocks.BLACK_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLACK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLACK_COLORED_LOGS), new ItemStack(ModBlocks.BLACK_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLACK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.BLACK_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.BLACK_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/black_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.BLACK_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.BLACK_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/black_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.BLACK_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.BLACK_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/black_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.BLACK_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.BLACK_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.BLACK_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/black_colored_wooden_plank_fence_from_planks"));

        //Blue Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLUE_COLORED_LOGS), new ItemStack(ModBlocks.BLUE_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLUE_COLORED_LOGS), new ItemStack(ModBlocks.BLUE_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLUE_COLORED_LOGS), new ItemStack(ModBlocks.BLUE_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLUE_COLORED_LOGS), new ItemStack(ModBlocks.BLUE_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLUE_COLORED_LOGS), new ItemStack(ModBlocks.BLUE_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLUE_COLORED_LOGS), new ItemStack(ModBlocks.BLUE_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLUE_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_BLUE_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLUE_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_BLUE_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLUE_COLORED_LOGS), new ItemStack(ModBlocks.BLUE_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLUE_COLORED_LOGS), new ItemStack(ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLUE_COLORED_LOGS), new ItemStack(ModBlocks.BLUE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLUE_COLORED_LOGS), new ItemStack(ModBlocks.BLUE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BLUE_COLORED_LOGS), new ItemStack(ModBlocks.BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.BLUE_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.BLUE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/blue_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.BLUE_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.BLUE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/blue_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.BLUE_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.BLUE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/blue_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.BLUE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.BLUE_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.BLUE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/blue_colored_wooden_plank_fence_from_planks"));

        
        //Brown Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BROWN_COLORED_LOGS), new ItemStack(ModBlocks.BROWN_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.BROWN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BROWN_COLORED_LOGS), new ItemStack(ModBlocks.BROWN_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.BROWN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BROWN_COLORED_LOGS), new ItemStack(ModBlocks.BROWN_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.BROWN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BROWN_COLORED_LOGS), new ItemStack(ModBlocks.BROWN_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.BROWN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BROWN_COLORED_LOGS), new ItemStack(ModBlocks.BROWN_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.BROWN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BROWN_COLORED_LOGS), new ItemStack(ModBlocks.BROWN_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.BROWN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BROWN_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_BROWN_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.BROWN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BROWN_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_BROWN_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.BROWN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BROWN_COLORED_LOGS), new ItemStack(ModBlocks.BROWN_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.BROWN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BROWN_COLORED_LOGS), new ItemStack(ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.BROWN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BROWN_COLORED_LOGS), new ItemStack(ModBlocks.BROWN_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.BROWN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BROWN_COLORED_LOGS), new ItemStack(ModBlocks.BROWN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.BROWN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.BROWN_COLORED_LOGS), new ItemStack(ModBlocks.BROWN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.BROWN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.BROWN_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.BROWN_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/brown_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.BROWN_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.BROWN_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/brown_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.BROWN_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.BROWN_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/brown_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.BROWN_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.BROWN_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.BROWN_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/brown_colored_wooden_plank_fence_from_planks"));

        
        //White Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.WHITE_COLORED_LOGS), new ItemStack(ModBlocks.WHITE_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.WHITE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.WHITE_COLORED_LOGS), new ItemStack(ModBlocks.WHITE_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.WHITE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.WHITE_COLORED_LOGS), new ItemStack(ModBlocks.WHITE_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.WHITE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.WHITE_COLORED_LOGS), new ItemStack(ModBlocks.WHITE_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.WHITE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.WHITE_COLORED_LOGS), new ItemStack(ModBlocks.WHITE_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.WHITE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.WHITE_COLORED_LOGS), new ItemStack(ModBlocks.WHITE_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.WHITE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.WHITE_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_WHITE_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.WHITE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.WHITE_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_WHITE_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.WHITE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.WHITE_COLORED_LOGS), new ItemStack(ModBlocks.WHITE_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.WHITE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.WHITE_COLORED_LOGS), new ItemStack(ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.WHITE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.WHITE_COLORED_LOGS), new ItemStack(ModBlocks.WHITE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.WHITE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.WHITE_COLORED_LOGS), new ItemStack(ModBlocks.WHITE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.WHITE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.WHITE_COLORED_LOGS), new ItemStack(ModBlocks.WHITE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.WHITE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.WHITE_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.WHITE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/white_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.WHITE_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.WHITE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/white_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.WHITE_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.WHITE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/white_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.WHITE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.WHITE_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.WHITE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/white_colored_wooden_plank_fence_from_planks"));

        
        //Lime Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIME_COLORED_LOGS), new ItemStack(ModBlocks.LIME_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIME_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIME_COLORED_LOGS), new ItemStack(ModBlocks.LIME_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIME_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIME_COLORED_LOGS), new ItemStack(ModBlocks.LIME_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIME_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIME_COLORED_LOGS), new ItemStack(ModBlocks.LIME_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIME_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIME_COLORED_LOGS), new ItemStack(ModBlocks.LIME_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIME_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIME_COLORED_LOGS), new ItemStack(ModBlocks.LIME_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIME_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIME_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_LIME_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIME_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIME_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_LIME_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIME_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIME_COLORED_LOGS), new ItemStack(ModBlocks.LIME_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIME_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIME_COLORED_LOGS), new ItemStack(ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIME_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIME_COLORED_LOGS), new ItemStack(ModBlocks.LIME_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIME_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIME_COLORED_LOGS), new ItemStack(ModBlocks.LIME_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIME_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIME_COLORED_LOGS), new ItemStack(ModBlocks.LIME_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIME_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.LIME_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.LIME_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.LIME_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/lime_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.LIME_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.LIME_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.LIME_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/lime_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.LIME_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.LIME_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.LIME_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/lime_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.LIME_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.LIME_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.LIME_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/lime_colored_wooden_plank_fence_from_planks"));

        
        //Green Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GREEN_COLORED_LOGS), new ItemStack(ModBlocks.GREEN_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.GREEN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GREEN_COLORED_LOGS), new ItemStack(ModBlocks.GREEN_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.GREEN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GREEN_COLORED_LOGS), new ItemStack(ModBlocks.GREEN_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.GREEN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GREEN_COLORED_LOGS), new ItemStack(ModBlocks.GREEN_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.GREEN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GREEN_COLORED_LOGS), new ItemStack(ModBlocks.GREEN_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.GREEN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GREEN_COLORED_LOGS), new ItemStack(ModBlocks.GREEN_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.GREEN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GREEN_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_GREEN_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.GREEN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GREEN_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_GREEN_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.GREEN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GREEN_COLORED_LOGS), new ItemStack(ModBlocks.GREEN_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.GREEN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GREEN_COLORED_LOGS), new ItemStack(ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.GREEN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GREEN_COLORED_LOGS), new ItemStack(ModBlocks.GREEN_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.GREEN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GREEN_COLORED_LOGS), new ItemStack(ModBlocks.GREEN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.GREEN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GREEN_COLORED_LOGS), new ItemStack(ModBlocks.GREEN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.GREEN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.GREEN_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.GREEN_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/green_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.GREEN_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.GREEN_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/green_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.GREEN_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.GREEN_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/green_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.GREEN_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.GREEN_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.GREEN_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/green_colored_wooden_plank_fence_from_planks"));

        
        //Cyan Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.CYAN_COLORED_LOGS), new ItemStack(ModBlocks.CYAN_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.CYAN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.CYAN_COLORED_LOGS), new ItemStack(ModBlocks.CYAN_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.CYAN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.CYAN_COLORED_LOGS), new ItemStack(ModBlocks.CYAN_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.CYAN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.CYAN_COLORED_LOGS), new ItemStack(ModBlocks.CYAN_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.CYAN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.CYAN_COLORED_LOGS), new ItemStack(ModBlocks.CYAN_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.CYAN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.CYAN_COLORED_LOGS), new ItemStack(ModBlocks.CYAN_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.CYAN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.CYAN_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_CYAN_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.CYAN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.CYAN_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_CYAN_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.CYAN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.CYAN_COLORED_LOGS), new ItemStack(ModBlocks.CYAN_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.CYAN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.CYAN_COLORED_LOGS), new ItemStack(ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.CYAN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.CYAN_COLORED_LOGS), new ItemStack(ModBlocks.CYAN_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.CYAN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.CYAN_COLORED_LOGS), new ItemStack(ModBlocks.CYAN_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.CYAN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.CYAN_COLORED_LOGS), new ItemStack(ModBlocks.CYAN_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.CYAN_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.CYAN_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.CYAN_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/cyan_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.CYAN_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.CYAN_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/cyan_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.CYAN_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.CYAN_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/cyan_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.CYAN_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.CYAN_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.CYAN_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/cyan_colored_wooden_plank_fence_from_planks"));

        
        //Purple Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PURPLE_COLORED_LOGS), new ItemStack(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.PURPLE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PURPLE_COLORED_LOGS), new ItemStack(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.PURPLE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PURPLE_COLORED_LOGS), new ItemStack(ModBlocks.PURPLE_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.PURPLE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PURPLE_COLORED_LOGS), new ItemStack(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.PURPLE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PURPLE_COLORED_LOGS), new ItemStack(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.PURPLE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PURPLE_COLORED_LOGS), new ItemStack(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.PURPLE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PURPLE_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_PURPLE_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.PURPLE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PURPLE_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_PURPLE_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.PURPLE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PURPLE_COLORED_LOGS), new ItemStack(ModBlocks.PURPLE_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.PURPLE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PURPLE_COLORED_LOGS), new ItemStack(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.PURPLE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PURPLE_COLORED_LOGS), new ItemStack(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.PURPLE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PURPLE_COLORED_LOGS), new ItemStack(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.PURPLE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PURPLE_COLORED_LOGS), new ItemStack(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.PURPLE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/purple_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/purple_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/purple_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.PURPLE_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.PURPLE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/purple_colored_wooden_plank_fence_from_planks"));

        
        //Pink Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PINK_COLORED_LOGS), new ItemStack(ModBlocks.PINK_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.PINK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PINK_COLORED_LOGS), new ItemStack(ModBlocks.PINK_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.PINK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PINK_COLORED_LOGS), new ItemStack(ModBlocks.PINK_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.PINK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PINK_COLORED_LOGS), new ItemStack(ModBlocks.PINK_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.PINK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PINK_COLORED_LOGS), new ItemStack(ModBlocks.PINK_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.PINK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PINK_COLORED_LOGS), new ItemStack(ModBlocks.PINK_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.PINK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PINK_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_PINK_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.PINK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PINK_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_PINK_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.PINK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PINK_COLORED_LOGS), new ItemStack(ModBlocks.PINK_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.PINK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PINK_COLORED_LOGS), new ItemStack(ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.PINK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PINK_COLORED_LOGS), new ItemStack(ModBlocks.PINK_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.PINK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PINK_COLORED_LOGS), new ItemStack(ModBlocks.PINK_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.PINK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.PINK_COLORED_LOGS), new ItemStack(ModBlocks.PINK_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.PINK_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.PINK_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.PINK_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.PINK_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/pink_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.PINK_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.PINK_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.PINK_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/pink_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.PINK_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.PINK_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.PINK_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/pink_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.PINK_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.PINK_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.PINK_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/pink_colored_wooden_plank_fence_from_planks"));

        
        //Magenta Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.MAGENTA_COLORED_LOGS), new ItemStack(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.MAGENTA_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.MAGENTA_COLORED_LOGS), new ItemStack(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.MAGENTA_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.MAGENTA_COLORED_LOGS), new ItemStack(ModBlocks.MAGENTA_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.MAGENTA_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.MAGENTA_COLORED_LOGS), new ItemStack(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.MAGENTA_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.MAGENTA_COLORED_LOGS), new ItemStack(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.MAGENTA_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.MAGENTA_COLORED_LOGS), new ItemStack(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.MAGENTA_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.MAGENTA_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_MAGENTA_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.MAGENTA_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.MAGENTA_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_MAGENTA_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.MAGENTA_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.MAGENTA_COLORED_LOGS), new ItemStack(ModBlocks.MAGENTA_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.MAGENTA_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.MAGENTA_COLORED_LOGS), new ItemStack(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.MAGENTA_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.MAGENTA_COLORED_LOGS), new ItemStack(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.MAGENTA_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.MAGENTA_COLORED_LOGS), new ItemStack(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.MAGENTA_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.MAGENTA_COLORED_LOGS), new ItemStack(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.MAGENTA_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/magenta_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/magenta_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/magenta_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.MAGENTA_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.MAGENTA_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/magenta_colored_wooden_plank_fence_from_planks"));

        
        //Yellow Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.YELLOW_COLORED_LOGS), new ItemStack(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.YELLOW_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.YELLOW_COLORED_LOGS), new ItemStack(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.YELLOW_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.YELLOW_COLORED_LOGS), new ItemStack(ModBlocks.YELLOW_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.YELLOW_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.YELLOW_COLORED_LOGS), new ItemStack(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.YELLOW_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.YELLOW_COLORED_LOGS), new ItemStack(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.YELLOW_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.YELLOW_COLORED_LOGS), new ItemStack(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.YELLOW_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.YELLOW_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_YELLOW_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.YELLOW_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.YELLOW_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_YELLOW_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.YELLOW_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.YELLOW_COLORED_LOGS), new ItemStack(ModBlocks.YELLOW_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.YELLOW_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.YELLOW_COLORED_LOGS), new ItemStack(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.YELLOW_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.YELLOW_COLORED_LOGS), new ItemStack(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.YELLOW_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.YELLOW_COLORED_LOGS), new ItemStack(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.YELLOW_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.YELLOW_COLORED_LOGS), new ItemStack(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.YELLOW_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/yellow_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/yellow_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/yellow_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.YELLOW_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.YELLOW_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/yellow_colored_wooden_plank_fence_from_planks"));

        
        //Red Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.RED_COLORED_LOGS), new ItemStack(ModBlocks.RED_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.RED_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.RED_COLORED_LOGS), new ItemStack(ModBlocks.RED_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.RED_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.RED_COLORED_LOGS), new ItemStack(ModBlocks.RED_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.RED_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.RED_COLORED_LOGS), new ItemStack(ModBlocks.RED_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.RED_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.RED_COLORED_LOGS), new ItemStack(ModBlocks.RED_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.RED_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.RED_COLORED_LOGS), new ItemStack(ModBlocks.RED_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.RED_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.RED_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_RED_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.RED_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.RED_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_RED_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.RED_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.RED_COLORED_LOGS), new ItemStack(ModBlocks.RED_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.RED_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.RED_COLORED_LOGS), new ItemStack(ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.RED_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.RED_COLORED_LOGS), new ItemStack(ModBlocks.RED_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.RED_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.RED_COLORED_LOGS), new ItemStack(ModBlocks.RED_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.RED_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.RED_COLORED_LOGS), new ItemStack(ModBlocks.RED_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.RED_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.RED_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.RED_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.RED_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/red_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.RED_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.RED_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.RED_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/red_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.RED_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.RED_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.RED_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/red_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.RED_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.RED_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.RED_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/red_colored_wooden_plank_fence_from_planks"));

        
        //Orange Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.ORANGE_COLORED_LOGS), new ItemStack(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.ORANGE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.ORANGE_COLORED_LOGS), new ItemStack(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.ORANGE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.ORANGE_COLORED_LOGS), new ItemStack(ModBlocks.ORANGE_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.ORANGE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.ORANGE_COLORED_LOGS), new ItemStack(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.ORANGE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.ORANGE_COLORED_LOGS), new ItemStack(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.ORANGE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.ORANGE_COLORED_LOGS), new ItemStack(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.ORANGE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.ORANGE_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_ORANGE_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.ORANGE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.ORANGE_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_ORANGE_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.ORANGE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.ORANGE_COLORED_LOGS), new ItemStack(ModBlocks.ORANGE_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.ORANGE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.ORANGE_COLORED_LOGS), new ItemStack(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.ORANGE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.ORANGE_COLORED_LOGS), new ItemStack(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.ORANGE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.ORANGE_COLORED_LOGS), new ItemStack(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.ORANGE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.ORANGE_COLORED_LOGS), new ItemStack(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.ORANGE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/orange_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/orange_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/orange_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.ORANGE_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.ORANGE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/orange_colored_wooden_plank_fence_from_planks"));

        
        //Gray Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GRAY_COLORED_LOGS), new ItemStack(ModBlocks.GRAY_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GRAY_COLORED_LOGS), new ItemStack(ModBlocks.GRAY_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GRAY_COLORED_LOGS), new ItemStack(ModBlocks.GRAY_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GRAY_COLORED_LOGS), new ItemStack(ModBlocks.GRAY_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GRAY_COLORED_LOGS), new ItemStack(ModBlocks.GRAY_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GRAY_COLORED_LOGS), new ItemStack(ModBlocks.GRAY_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GRAY_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_GRAY_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GRAY_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_GRAY_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GRAY_COLORED_LOGS), new ItemStack(ModBlocks.GRAY_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GRAY_COLORED_LOGS), new ItemStack(ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GRAY_COLORED_LOGS), new ItemStack(ModBlocks.GRAY_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GRAY_COLORED_LOGS), new ItemStack(ModBlocks.GRAY_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.GRAY_COLORED_LOGS), new ItemStack(ModBlocks.GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.GRAY_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.GRAY_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/gray_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.GRAY_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.GRAY_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/gray_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.GRAY_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.GRAY_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/gray_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.GRAY_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.GRAY_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.GRAY_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/gray_colored_wooden_plank_fence_from_planks"));

        
        //Light Gray Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_GRAY_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_GRAY_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_GRAY_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_GRAY_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_GRAY_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_GRAY_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_GRAY_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_GRAY_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_LIGHT_GRAY_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_GRAY_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_GRAY_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_GRAY_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_GRAY_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_GRAY_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_GRAY_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/light_gray_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/light_gray_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/light_gray_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.LIGHT_GRAY_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/light_gray_colored_wooden_plank_fence_from_planks"));

        
        //Light Blue Colored Wood
        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_BLUE_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS, 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_BLUE_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_SLAB, 8), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_BLUE_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_SIGN.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_BLUE_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_DOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_BLUE_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_BUTTON.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_BLUE_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_STAIRS.get(), 4), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_BLUE_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_LOG.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_BLUE_COLORED_LOGS), new ItemStack(ModBlocks.STRIPPED_LIGHT_BLUE_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_BLUE_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOOD.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_BLUE_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE.get(), 3), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_BLUE_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_TRAPDOOR.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_BLUE_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_CRAFTING_TABLE.get(), 1), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModTags.Items.LIGHT_BLUE_COLORED_LOGS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_PRESSURE_PLATE.get(), 2), 1)
                .unlockedBy("has_item", has(ModTags.Items.LIGHT_BLUE_COLORED_LOGS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_BUTTON, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/light_blue_colored_wooden_plank_button_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_SLAB, 2), 1)
                .unlockedBy("has_item", has(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/light_blue_colored_wooden_plank_slab_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_STAIRS, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/light_blue_colored_wooden_plank_stair_from_planks"));

        SawmillRecipeBuilder.create(Ingredient.of(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS), new ItemStack(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANK_FENCE, 1), 1)
                .unlockedBy("has_item", has(ModBlocks.LIGHT_BLUE_COLORED_WOODEN_PLANKS)).save(consumer.withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")).withConditions(new ModLoadedCondition("caveopolis")).withConditions(new ModLoadedCondition("sawmill")), ResourceLocation.fromNamespaceAndPath(OpolisCompat.MOD_ID, "sawmill/sawmill/light_blue_colored_wooden_plank_fence_from_planks"));

        














    }
}
