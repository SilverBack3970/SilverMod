package net.silverback.silvermod.datagen;

import net.silverback.silvermod.SilverMod;
import net.silverback.silvermod.block.ModBlocks;
import net.silverback.silvermod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SilverMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SILVER_BLOCK.get(),
                        ModBlocks.RAW_SILVER_BLOCK.get(),
                        ModBlocks.SILVER_ORE.get(),
                        ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                        ModBlocks.END_STONE_SILVER_ORE.get(),
                        ModBlocks.NETHER_SILVER_ORE.get(),

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SILVER_BLOCK.get(),
                        ModBlocks.RAW_SILVER_BLOCK.get(),
                        ModBlocks.SILVER_ORE.get(),

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                        ModBlocks.END_STONE_SILVER_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_SILVER_TOOL)
                .add(ModBlocks.NETHER_SILVER_ORE.get());

        this.tag(ModTags.Blocks.PAXEL_MINEABLE)
                .addTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(BlockTags.MINEABLE_WITH_SHOVEL)
                .addTag(BlockTags.MINEABLE_WITH_AXE);

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.SILVER_FENCE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SILVER_WALL.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.SILVER_FENCE_GATE.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}