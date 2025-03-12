package com.benbenlaw.opoliscompat.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CompatStartupConfig {

    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;
    public static final ModConfigSpec.ConfigValue<Boolean> worldConversion;



    static {

        // Caveopolis Configs
        BUILDER.comment("BBL Compat Startup Config")
                .push("BBL Compat");

        worldConversion = BUILDER.comment("Enables the in world conversion of caveopolis to colors blocks, will increase load times and may cause lag")
                .define("Caveopolis to Colors World Conversion", false);


        BUILDER.pop();



        //LAST
        SPEC = BUILDER.build();

    }
}
