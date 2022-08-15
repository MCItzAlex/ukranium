package com.alex2k.ukrainium.item;

import com.alex2k.ukrainium.Ukrainium;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
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

    public static final RegistryObject<Item> UKRAINIUM_SCRAP = ITEMS.register("ukrainium_scrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UKRAINIUM_TAB)));

    public static final RegistryObject<Item> BORSCHT = ITEMS.register("borscht",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UKRAINIUM_TAB).food(ModFoods.BORSCHT)));

    // UKRAINIUM TOOLS
    public static final RegistryObject<Item> UKRAINIUM_SWORD = ITEMS.register("ukrainium_sword",
            () -> new SwordItem(ModTiers.UKRAINIUM, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.UKRAINIUM_TAB)));

    public static final RegistryObject<Item> UKRAINIUM_PICKAXE = ITEMS.register("ukrainium_pickaxe",
            () -> new PickaxeItem(ModTiers.UKRAINIUM, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.UKRAINIUM_TAB)));

    public static final RegistryObject<Item> UKRAINIUM_AXE = ITEMS.register("ukrainium_axe",
            () -> new AxeItem(ModTiers.UKRAINIUM, 5, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.UKRAINIUM_TAB)));

    public static final RegistryObject<Item> UKRAINIUM_SHOVEL = ITEMS.register("ukrainium_shovel",
            () -> new ShovelItem(ModTiers.UKRAINIUM, 1, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.UKRAINIUM_TAB)));

    public static final RegistryObject<Item> UKRAINIUM_HOE = ITEMS.register("ukrainium_hoe",
            () -> new HoeItem(ModTiers.UKRAINIUM, -5, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.UKRAINIUM_TAB)));

    // UKRAINIUM ARMOUR
    public static final RegistryObject<Item> UKRAINIUM_HELMET = ITEMS.register("ukrainium_helmet",
            () -> new ArmorItem(ModArmorMaterials.UKRAINIUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.UKRAINIUM_TAB)));

    public static final RegistryObject<Item> UKRAINIUM_CHESTPLATE = ITEMS.register("ukrainium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.UKRAINIUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.UKRAINIUM_TAB)));

    public static final RegistryObject<Item> UKRAINIUM_LEGGINGS = ITEMS.register("ukrainium_leggings",
            () -> new ArmorItem(ModArmorMaterials.UKRAINIUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.UKRAINIUM_TAB)));

    public static final RegistryObject<Item> UKRAINIUM_BOOTS = ITEMS.register("ukrainium_boots",
            () -> new ArmorItem(ModArmorMaterials.UKRAINIUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.UKRAINIUM_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
