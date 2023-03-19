package com.refinedmods.refinedarchitect.template.platform.fabric;

import com.refinedmods.refinedarchitect.template.platform.common.Common;

import net.fabricmc.api.ModInitializer;

public class ModInitializerImpl implements ModInitializer {
    @Override
    public void onInitialize() {
        Common.helloWorld();
    }
}
