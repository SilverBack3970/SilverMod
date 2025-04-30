package net.silverback.silvermod.datagen;

import net.minecraftforge.registries.RegistryObject;
import net.silverback.silvermod.SilverMod;
import net.silverback.silvermod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SilverMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);

        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockWithItem(ModBlocks.END_STONE_SILVER_ORE);
        blockWithItem(ModBlocks.NETHER_SILVER_ORE);

        buttonBlock((ButtonBlock) ModBlocks.SILVER_BUTTON.get(), blockTexture(ModBlocks.SILVER_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.SILVER_PRESSURE_PLATE.get(), blockTexture(ModBlocks.SILVER_BLOCK.get()));

        fenceBlock((FenceBlock) ModBlocks.SILVER_FENCE.get(), blockTexture(ModBlocks.SILVER_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.SILVER_FENCE_GATE.get(), blockTexture(ModBlocks.SILVER_BLOCK.get()));
        wallBlock((WallBlock) ModBlocks.SILVER_WALL.get(), blockTexture(ModBlocks.SILVER_BLOCK.get()));

        doorBlockWithRenderType((DoorBlock) ModBlocks.SILVER_DOOR.get(), modLoc("block/silver_door_bottom"), modLoc("block/silver_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.SILVER_TRAPDOOR.get(), modLoc("block/silver_trapdoor"), true, "cutout");

    }



    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}