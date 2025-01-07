package com.benbenlaw.opoliscompat.kubejs;

import com.benbenlaw.opoliscompat.kubejs.market.MarketRecipeJS;
import com.benbenlaw.opoliscompat.kubejs.smelting.FuelRecipeJS;
import com.benbenlaw.opoliscompat.kubejs.smelting.MeltingRecipeJS;
import com.benbenlaw.opoliscompat.kubejs.smelting.MixingRecipeJS;
import com.benbenlaw.opoliscompat.kubejs.smelting.SolidifierRecipeJS;
import com.benbenlaw.opoliscompat.kubejs.strainers.MeshUpgradeRecipeJS;
import com.benbenlaw.opoliscompat.kubejs.strainers.OutputUpgradeRecipeJS;
import com.benbenlaw.opoliscompat.kubejs.strainers.StrainerRecipeJS;
import com.benbenlaw.opoliscompat.kubejs.utilities.*;
import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.event.EventGroupRegistry;
import dev.latvian.mods.kubejs.plugin.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchemaRegistry;
import net.minecraft.resources.ResourceLocation;

public class KubeJSOpolisPlugin implements KubeJSPlugin {

    public static EventGroup GROUP = EventGroup.of("OpolisJSEvents");

    @Override
    public void registerRecipeSchemas(RecipeSchemaRegistry event) {

        //Opolis Utilities
        event.register(ResourceLocation.fromNamespaceAndPath("opolisutilities", "catalogue"), CatalogueRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("opolisutilities", "drying_table"), DryingRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("opolisutilities", "fluid_generator"), FluidGenRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("opolisutilities", "resource_generator"), ResourceGenRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("opolisutilities", "soaking_table"), ResourceGenRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("opolisutilities", "speed_upgrades"), SpeedUpgradesRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("opolisutilities", "summoning_block"), SummoningRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("opolisutilities", "cloche"), ClocheRecipeJS.SCHEMA);


        //Strainers
        event.register(ResourceLocation.fromNamespaceAndPath("strainers", "strainer"), StrainerRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("strainers", "mesh_upgrade"), MeshUpgradeRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("strainers", "output_upgrade"), OutputUpgradeRecipeJS.SCHEMA);

        //Casting
        event.register(ResourceLocation.fromNamespaceAndPath("casting", "fuel"), FuelRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("casting", "melting"), MeltingRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("casting", "mixing"), MixingRecipeJS.SCHEMA);
        event.register(ResourceLocation.fromNamespaceAndPath("casting", "solidifier"), SolidifierRecipeJS.SCHEMA);

        //Market
        event.register(ResourceLocation.fromNamespaceAndPath("market", "market"), MarketRecipeJS.SCHEMA);


    }

    @Override
    public void registerEvents(EventGroupRegistry registry) {
        registry.register(GROUP);
    }
}