package com.alex2k.ukranium.item;

import com.alex2k.ukranium.Ukranium;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ukranium.MOD_ID);

    public static final RegistryObject<Item> UKRANIUM_INGOT = ITEMS.register("ukranium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UKRANIUM_TAB)));

    public static final RegistryObject<Item> RAW_UKRANIUM = ITEMS.register("raw_ukranium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UKRANIUM_TAB)));

    public static final RegistryObject<Item> BORSCHT = ITEMS.register("borscht",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UKRANIUM_TAB).food(ModFoods.BORSCHT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
