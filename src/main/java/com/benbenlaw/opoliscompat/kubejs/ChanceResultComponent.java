package com.benbenlaw.opoliscompat.kubejs;

import com.benbenlaw.caveopolis.config.RecipeConfig;
import com.benbenlaw.core.recipe.ChanceResult;
import com.mojang.serialization.Codec;
import dev.latvian.mods.kubejs.recipe.KubeRecipe;
import dev.latvian.mods.kubejs.recipe.component.ListRecipeComponent;
import dev.latvian.mods.kubejs.recipe.component.RecipeComponent;
import dev.latvian.mods.rhino.Context;
import dev.latvian.mods.rhino.type.TypeInfo;
import net.minecraft.core.NonNullList;

import net.minecraft.core.NonNullList;
import dev.latvian.mods.kubejs.recipe.component.RecipeComponent;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.List;


import com.benbenlaw.core.recipe.ChanceResult;
import com.mojang.serialization.Codec;
import dev.latvian.mods.kubejs.recipe.KubeRecipe;
import dev.latvian.mods.kubejs.recipe.component.RecipeComponent;
import dev.latvian.mods.rhino.Context;
import dev.latvian.mods.rhino.type.TypeInfo;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ChanceResultComponent implements RecipeComponent<ChanceResult> {

    public static final ChanceResultComponent CHANCE_RESULT = new ChanceResultComponent();

    @Override
    public Codec<ChanceResult> codec() {
        return ChanceResult.CODEC;
    }

    @Override
    public TypeInfo typeInfo() {
        return TypeInfo.OBJECT;
    }

    public RecipeComponent<NonNullList<ChanceResult>> asNonNullList() {
        return new NonNullListChanceResultComponent(this);
    }

    @Override
    public ChanceResult wrap(Context cx, KubeRecipe recipe, Object from) {
        if (from instanceof ChanceResult cr) {
            return cr;
        }

        if (from instanceof dev.latvian.mods.rhino.NativeObject nativeObj) {
            Object itemObj = nativeObj.get("item");
            Object chanceObj = nativeObj.get("chance");

            if (itemObj == null) {
                throw new IllegalArgumentException("ChanceResult missing 'item' field");
            }

            ItemStack stack;

            if (itemObj instanceof String itemStr) {
                var rl = ResourceLocation.parse(itemStr);
                var item = BuiltInRegistries.ITEM.get(rl);
                if (item == null) {
                    throw new IllegalArgumentException("Invalid item ID: " + itemStr);
                }
                stack = new ItemStack(item);
            } else if (itemObj instanceof dev.latvian.mods.rhino.NativeObject itemNativeObj) {
                Object idObj = itemNativeObj.get("id");
                Object countObj = itemNativeObj.get("count");

                if (idObj == null) {
                    throw new IllegalArgumentException("ChanceResult item missing 'id' field");
                }

                String idStr = String.valueOf(idObj);
                int count = 1;
                if (countObj != null) {
                    try {
                        double d = Double.parseDouble(String.valueOf(countObj));
                        count = (int) d;
                        if (count < 1) count = 1;  // Clamp to at least 1
                    } catch (NumberFormatException ignored) {
                    }
                }

                var rl = ResourceLocation.parse(idStr);
                var item = BuiltInRegistries.ITEM.get(rl);
                if (item == null) {
                    throw new IllegalArgumentException("Invalid item ID: " + idStr);
                }
                stack = new ItemStack(item, count);
            } else {
                throw new IllegalArgumentException("Invalid 'item' field type: " + itemObj.getClass());
            }

            float chance = 1.0f;
            if (chanceObj != null) {
                try {
                    chance = Float.parseFloat(String.valueOf(chanceObj));
                } catch (NumberFormatException ignored) {
                }
            }

            return new ChanceResult(stack, chance);
        }

        if (from instanceof String s) {
            var rl = ResourceLocation.parse(s);
            var item = BuiltInRegistries.ITEM.get(rl);
            if (item == null) {
                throw new IllegalArgumentException("Invalid item ID: " + s);
            }
            return new ChanceResult(new ItemStack(item), 1.0f);
        }

        throw new IllegalArgumentException("Cannot convert object to ChanceResult: " + from);
    }


}

