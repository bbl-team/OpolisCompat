package com.benbenlaw.opoliscompat.datagen.cloche;

import com.benbenlaw.core.recipe.ChanceResult;
import com.blakebr0.mysticalagradditions.MysticalAgradditions;
import com.blakebr0.mysticalagriculture.MysticalAgriculture;
import com.blakebr0.mysticalagriculture.init.ModItems;
import net.minecraft.core.NonNullList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class CompatResultLists {

    public static final Item INFERIUM_FARMLAND = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, "inferium_farmland"));
    public static final Item PRUDENTIUM_FARMLAND = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, "prudentium_farmland"));
    public static final Item TERTIUM_FARMLAND = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, "tertium_farmland"));
    public static final Item IMPERIUM_FARMLAND = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, "imperium_farmland"));
    public static final Item SUPREMIUM_FARMLAND = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, "supremium_farmland"));
    public static final Item INSANIUM_FARMLAND = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgradditions.MOD_ID, "insanium_farmland"));

    public static final Item MYSTICAL_FERTILIZER = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, "mystical_fertilizer"));


    public static final Map<String, NonNullList<ChanceResult>> RESULTS_LIST_BY_TYPE = new HashMap<>();

    static {

        for (String type : MysticalResources.TIER_1_SEEDS) {

            Item essence = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_essence"));
            Item seed = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_seeds"));

            NonNullList<ChanceResult> results = NonNullList.create();

            results.add(new ChanceResult(new ItemStack(essence), 1.0f));
            results.add(new ChanceResult(new ItemStack(seed), 0.15f));
            results.add(new ChanceResult(new ItemStack(MYSTICAL_FERTILIZER), 0.05f));

            RESULTS_LIST_BY_TYPE.put(type, results);
        }

        for (String type : MysticalResources.TIER_2_SEEDS) {

            Item essence = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_essence"));
            Item seed = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_seeds"));

            NonNullList<ChanceResult> results = NonNullList.create();

            results.add(new ChanceResult(new ItemStack(essence), 1.0f));
            results.add(new ChanceResult(new ItemStack(seed), 0.15f));
            results.add(new ChanceResult(new ItemStack(MYSTICAL_FERTILIZER), 0.05f));

            RESULTS_LIST_BY_TYPE.put(type, results);
        }

        for (String type : MysticalResources.TIER_3_SEEDS) {

            Item essence = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_essence"));
            Item seed = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_seeds"));

            NonNullList<ChanceResult> results = NonNullList.create();

            results.add(new ChanceResult(new ItemStack(essence), 1.0f));
            results.add(new ChanceResult(new ItemStack(seed), 0.15f));
            results.add(new ChanceResult(new ItemStack(MYSTICAL_FERTILIZER), 0.05f));

            RESULTS_LIST_BY_TYPE.put(type, results);
        }


        for (String type : MysticalResources.TIER_4_SEEDS) {

            Item essence = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_essence"));
            Item seed = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_seeds"));

            NonNullList<ChanceResult> results = NonNullList.create();

            results.add(new ChanceResult(new ItemStack(essence), 1.0f));
            results.add(new ChanceResult(new ItemStack(seed), 0.15f));
            results.add(new ChanceResult(new ItemStack(MYSTICAL_FERTILIZER), 0.05f));

            RESULTS_LIST_BY_TYPE.put(type, results);
        }

        for (String type : MysticalResources.TIER_5_SEEDS) {

            Item essence = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_essence"));
            Item seed = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_seeds"));

            NonNullList<ChanceResult> results = NonNullList.create();

            results.add(new ChanceResult(new ItemStack(essence), 1.0f));
            results.add(new ChanceResult(new ItemStack(seed), 0.15f));
            results.add(new ChanceResult(new ItemStack(MYSTICAL_FERTILIZER), 0.05f));

            RESULTS_LIST_BY_TYPE.put(type, results);
        }

        for (String type : MysticalResources.TIER_6_SEEDS) {

            Item essence = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_essence"));
            Item seed = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MysticalAgriculture.MOD_ID, type + "_seeds"));

            NonNullList<ChanceResult> results = NonNullList.create();

            results.add(new ChanceResult(new ItemStack(essence), 1.0f));
            results.add(new ChanceResult(new ItemStack(seed), 0.15f));
            results.add(new ChanceResult(new ItemStack(MYSTICAL_FERTILIZER), 0.05f));

            RESULTS_LIST_BY_TYPE.put(type, results);
        }


    }
}
