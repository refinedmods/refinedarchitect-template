package com.refinedmods.refinedarchitect.template.fabric;

import com.refinedmods.refinedarchitect.template.common.Common;

import net.fabricmc.api.ModInitializer;

public class ModInitializerImpl implements ModInitializer {
    @Override
    public void onInitialize() {
        Common.helloWorld();
    }
}
