package com.benbenlaw.opoliscompat.kubejs;

import com.benbenlaw.core.recipe.ChanceResult;
import com.benbenlaw.strainers.recipe.MeshChanceResult;
import com.mojang.serialization.Codec;
import dev.latvian.mods.kubejs.recipe.KubeRecipe;
import dev.latvian.mods.kubejs.recipe.component.RecipeComponent;
import dev.latvian.mods.rhino.Context;
import dev.latvian.mods.rhino.type.TypeInfo;
import net.minecraft.core.NonNullList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public class MeshChanceResultComponent implements RecipeComponent<MeshChanceResult> {

    public static final MeshChanceResultComponent MESH_CHANCE_RESULT = new MeshChanceResultComponent();

    @Override
    public Codec<MeshChanceResult> codec() {
        return MeshChanceResult.CODEC;
    }

    @Override
    public TypeInfo typeInfo() {
        return TypeInfo.OBJECT;
    }

    public RecipeComponent<NonNullList<MeshChanceResult>> asNonNullList() {
        return new NonNullListMeshChanceResultComponent(this);
    }

    @Override
    public MeshChanceResult wrap(Context cx, KubeRecipe recipe, Object from) {
        if (from instanceof MeshChanceResult mcr) {
            return mcr;
        }

        // === Handle array input ===
        if (from instanceof dev.latvian.mods.rhino.NativeArray nativeArray) {
            int length = Math.toIntExact(nativeArray.getLength());
            if (length < 1) {
                throw new IllegalArgumentException("MeshChanceResult array must have at least 1 element (item)");
            }

            // item
            Object itemObj = nativeArray.get(0);
            ItemStack stack;
            if (itemObj instanceof String itemStr) {
                stack = parseCountedItemString(itemStr);
            } else {
                throw new IllegalArgumentException("First element must be a string like 'item' or '3x item'");
            }

            // chance
            float chance = 1.0f;
            if (length > 1) {
                try {
                    chance = Float.parseFloat(String.valueOf(nativeArray.get(1)));
                } catch (NumberFormatException ignored) {}
            }

            // mesh
            Ingredient mesh = Ingredient.EMPTY;
            if (length > 2) {
                Object meshObj = nativeArray.get(2);
                if (meshObj instanceof String meshStr) {
                    mesh = Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.parse(meshStr)));
                }
            }

            return new MeshChanceResult(new ChanceResult(stack, chance), mesh);
        }

        // === Handle object input ===
        if (from instanceof dev.latvian.mods.rhino.NativeObject nativeObj) {
            Object itemObj = nativeObj.get("item");
            Object chanceObj = nativeObj.get("chance");
            Object countAtTopLevel = nativeObj.get("count");
            Object meshObj = nativeObj.get("mesh");

            if (itemObj == null) {
                throw new IllegalArgumentException("MeshChanceResult missing 'item' field");
            }

            ItemStack stack;

            if (itemObj instanceof String itemStr) {
                stack = parseCountedItemString(itemStr);
                if (countAtTopLevel != null) {
                    try {
                        double d = Double.parseDouble(String.valueOf(countAtTopLevel));
                        stack.setCount((int) d);
                    } catch (NumberFormatException ignored) {}
                }
            } else if (itemObj instanceof dev.latvian.mods.rhino.NativeObject itemNativeObj) {
                Object idObj = itemNativeObj.get("id");
                Object countObj = itemNativeObj.get("count");

                if (idObj == null) {
                    throw new IllegalArgumentException("MeshChanceResult item missing 'id' field");
                }

                String idStr = String.valueOf(idObj);
                int count = 1;
                if (countObj != null) {
                    try {
                        double d = Double.parseDouble(String.valueOf(countObj));
                        count = (int) d;
                    } catch (NumberFormatException ignored) {}
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
                } catch (NumberFormatException ignored) {}
            }

            Ingredient mesh = Ingredient.EMPTY;
            if (meshObj != null) {
                if (meshObj instanceof String meshStr) {
                    var meshItem = BuiltInRegistries.ITEM.get(ResourceLocation.parse(meshStr));
                    if (meshItem != null) {
                        mesh = Ingredient.of(meshItem);
                    }
                }
                // You could extend this to allow arrays/objects for more complex mesh definitions
            }

            return new MeshChanceResult(new ChanceResult(stack, chance), mesh);
        }

        // === Handle simple string ===
        if (from instanceof String s) {
            ItemStack stack = parseCountedItemString(s);
            return new MeshChanceResult(new ChanceResult(stack, 1.0f), Ingredient.EMPTY);
        }

        throw new IllegalArgumentException("Cannot convert object to MeshChanceResult: " + from);
    }

    private ItemStack parseCountedItemString(String input) {
        input = input.trim();

        if (input.matches("^\\d+x\\s+.+$")) {
            String[] parts = input.split("\\s+", 2);
            int count = Integer.parseInt(parts[0].replace("x", ""));
            String itemId = parts[1];

            var rl = ResourceLocation.parse(itemId);
            var item = BuiltInRegistries.ITEM.get(rl);
            if (item == null) {
                throw new IllegalArgumentException("Invalid item ID: " + itemId);
            }

            return new ItemStack(item, count);
        } else {
            var rl = ResourceLocation.parse(input);
            var item = BuiltInRegistries.ITEM.get(rl);
            if (item == null) {
                throw new IllegalArgumentException("Invalid item ID: " + input);
            }
            return new ItemStack(item);
        }
    }

}
