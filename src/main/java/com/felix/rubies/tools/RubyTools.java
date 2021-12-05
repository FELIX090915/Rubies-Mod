package com.felix.rubies.tools;

import com.felix.rubies.Rubies;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

public class RubyTools {

    public static final ToolItem RUBY_SHOVEL = new ShovelItem(RubyToolMaterial.INSTANCE, 1f, -3f, new Item.Settings().group(Rubies.ITEM_GROUP));
    public static final ToolItem RUBY_SWORD = new SwordItem(RubyToolMaterial.INSTANCE, 4, -2.4f, new Item.Settings().group(Rubies.ITEM_GROUP));

}
