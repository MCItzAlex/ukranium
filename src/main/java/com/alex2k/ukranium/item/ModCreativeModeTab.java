package com.alex2k.ukranium.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab UKRANIUM_TAB = new CreativeModeTab("ukraniumtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.UKRANIUM_INGOT.get());
        }
    };
}
