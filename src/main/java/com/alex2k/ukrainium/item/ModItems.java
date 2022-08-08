package com.alex2k.ukrainium.item;

import com.alex2k.ukrainium.Ukrainium;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ukrainium.MOD_ID);

    public static final RegistryObject<Item> UKRAINIUM_INGOT = ITEMS.register("ukrainium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UKRAINIUM_TAB)));

    public static final RegistryObject<Item> RAW_UKRAINIUM = ITEMS.register("raw_ukrainium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UKRAINIUM_TAB)));

    public static final RegistryObject<Item> BORSCHT = ITEMS.register("borscht",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UKRAINIUM_TAB).food(ModFoods.BORSCHT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
