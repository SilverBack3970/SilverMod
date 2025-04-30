package net.silverback.silvermod.item;

import net.silverback.silvermod.SilverMod;
import net.silverback.silvermod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SILVER = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1400, 11f, 3f, 26,
                    ModTags.Blocks.NEEDS_SILVER_TOOL, () -> Ingredient.of(ModItems.SILVER_INGOT.get())),
            new ResourceLocation(SilverMod.MOD_ID, "silver"), List.of(Tiers.NETHERITE), List.of());

}