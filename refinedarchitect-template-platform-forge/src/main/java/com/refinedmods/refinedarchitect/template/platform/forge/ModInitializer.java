package com.refinedmods.refinedarchitect.template.platform.forge;

import com.refinedmods.refinedarchitect.template.platform.common.Common;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;

@Mod(Common.MOD_ID)
public class ModInitializer {
    public ModInitializer() {
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientModInitializer::onClientSetup);
        });
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onRegister);
    }

    @SubscribeEvent
    public void onRegister(final RegisterEvent e) {
        Common.helloWorld();
    }
}
