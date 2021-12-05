package com.felix.rubies.tools;

import com.felix.rubies.Rubies;
import net.minecraft.item.*;

public class RubyTools {

    public static final ToolItem RUBY_SHOVEL = new ShovelItem(RubyToolMaterial.INSTANCE, 1f, -3f, new Item.Settings().group(Rubies.ITEM_GROUP));
    public static final ToolItem RUBY_SWORD = new SwordItem(RubyToolMaterial.INSTANCE, 4, -2.4f, new Item.Settings().group(Rubies.ITEM_GROUP));
    public static final ToolItem RUBY_PICKAXE = new RubyPickaxeItem(RubyToolMaterial.INSTANCE, 2, -2.8f, new Item.Settings().group(Rubies.ITEM_GROUP));
    public static final ToolItem RUBY_AXE = new RubyAxeItem(RubyToolMaterial.INSTANCE, 6, -3f, new Item.Settings().group(Rubies.ITEM_GROUP));
    public static final ToolItem RUBY_HOE = new RubyHoeItem(RubyToolMaterial.INSTANCE, -3, 0, new Item.Settings().group(Rubies.ITEM_GROUP));

}

