package com.benbenlaw.opoliscompat;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Compat.MOD_ID)
public class Compat {

    public static final String MOD_ID = "bblcompat";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Compat(IEventBus modEventBus) {

    }
}
