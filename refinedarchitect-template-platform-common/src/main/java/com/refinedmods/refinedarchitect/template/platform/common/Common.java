package com.refinedmods.refinedarchitect.template.platform.common;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Blocks;

public class Common {
    public static final String MOD_ID = "refinedarchitecttemplate";

    private Common() {
    }

    public static void helloWorld() {
        System.out.println("Hello World! " + BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));
    }
}
