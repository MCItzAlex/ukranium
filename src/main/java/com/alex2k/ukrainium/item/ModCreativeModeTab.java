package com.alex2k.ukrainium.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab UKRAINIUM_TAB = new CreativeModeTab("ukrainiumtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.UKRAINIUM_INGOT.get());
        }
    };

}
