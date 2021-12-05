package com.felix.rubies.registry;

import com.felix.rubies.Rubies;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(3f, 3)
            .sounds(BlockSoundGroup.METAL)
    );

    public static final BLock RUBY_ORE_BLOCK = new Block(FabricBlockSettings
            .of(Material.STONE)
            .requiresTool()
            .strength(2f, 3)
            .sounds(BlockSoundGroup.STONE)
    );

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Rubies.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Rubies.MOD_ID, "ruby_ore_block"), RUBY_BLOCK);
    }
}
