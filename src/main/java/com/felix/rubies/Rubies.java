package com.felix.rubies;

import com.felix.rubies.registry.ModBlocks;
import com.felix.rubies.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Rubies implements ModInitializer {

    public static final String MOD_ID = "frubies";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(Rubies.MOD_ID, "general"),
            () -> new ItemStack(ModItems.RUBY)
    );

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
