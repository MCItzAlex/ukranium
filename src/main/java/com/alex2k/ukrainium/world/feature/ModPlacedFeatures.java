package com.alex2k.ukrainium.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> UKRAINIUM_ORE_PLACED = PlacementUtils.register("ukrainium_ore_placed",
            ModConfiguredFeatures.UKRAINIUM_ORE, ModOrePlacement.commonOrePlacement(6, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(20))));

}
