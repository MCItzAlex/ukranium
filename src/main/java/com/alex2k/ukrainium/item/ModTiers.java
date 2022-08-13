package com.alex2k.ukrainium.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier UKRAINIUM = new ForgeTier(4, 2595, 12.0f, 5f, 20, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.UKRAINIUM_INGOT.get()));

}
