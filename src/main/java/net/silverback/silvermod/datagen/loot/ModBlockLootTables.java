package net.silverback.silvermod.datagen.loot;

import net.silverback.silvermod.block.ModBlocks;
import net.silverback.silvermod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());

        this.add(ModBlocks.SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.END_STONE_SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.END_STONE_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.NETHER_SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.NETHER_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));


        this.dropSelf(ModBlocks.SILVER_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SILVER_BUTTON.get());
        this.dropSelf(ModBlocks.SILVER_FENCE.get());
        this.dropSelf(ModBlocks.SILVER_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SILVER_WALL.get());
        this.dropSelf(ModBlocks.SILVER_TRAPDOOR.get());

        this.add(ModBlocks.SILVER_DOOR.get(),
                block -> createDoorTable(ModBlocks.SILVER_DOOR.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}