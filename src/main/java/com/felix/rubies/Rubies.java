package com.felix.rubies;

import com.felix.rubies.registry.ModBlocks;
import com.felix.rubies.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Rubies implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
