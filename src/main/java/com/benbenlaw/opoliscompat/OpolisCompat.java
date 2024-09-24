package com.benbenlaw.opoliscompat;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(OpolisCompat.MOD_ID)
public class OpolisCompat {

    public static final String MOD_ID = "opoliscompat";
    private static final Logger LOGGER = LogUtils.getLogger();

    public OpolisCompat(IEventBus modEventBus) {

    }
}
