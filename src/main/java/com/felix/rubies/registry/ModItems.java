package com.felix.rubies.registry;

import com.felix.rubies.Rubies;
import com.felix.rubies.tools.RubyTools;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Items
    public static final Item RUBY = new Item(new Item.Settings().group(Rubies.ITEM_GROUP));

    // Blocks
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(Rubies.ITEM_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Rubies.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Rubies.MOD_ID, "ruby_block"), RUBY_BLOCK);

        // Tools
        Registry.register(Registry.ITEM, new Identifier(Rubies.MOD_ID, "ruby_shovel"), RubyTools.RUBY_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Rubies.MOD_ID, "ruby_sword"), RubyTools.RUBY_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Rubies.MOD_ID, "ruby_pickaxe"), RubyTools.RUBY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Rubies.MOD_ID, "ruby_axe"), RubyTools.RUBY_AXE);
        Registry.register(Registry.ITEM, new Identifier(Rubies.MOD_ID, "ruby_hoe"), RubyTools.RUBY_HOE);
    }


}
