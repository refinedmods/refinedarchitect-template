package com.refinedmods.refinedarchitect.template.platform.forge;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public final class ClientModInitializer {
    private ClientModInitializer() {
    }

    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent e) {
        System.out.println("Hello world from the client");
    }
}
