package com.refinedmods.refinedarchitect.template.platform.fabric;

import net.fabricmc.api.ClientModInitializer;

public class ClientModInitializerImpl implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Hello from the client");
    }
}
