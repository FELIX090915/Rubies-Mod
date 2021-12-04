package com.felix.rubies.tools;

import com.felix.rubies.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RubyToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1797;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0f;
    }

    @Override
    public float getAttackDamage() {
        return 3f;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.RUBY);
    }
}
