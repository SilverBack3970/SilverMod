package net.silverback.silvermod.item;

import net.silverback.silvermod.SilverMod;
import net.silverback.silvermod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SilverMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SILVER_TAB = CREATIVE_MODE_TABS.register("silver_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SILVER_INGOT.get()))
                    .title(Component.translatable("creativetab.silver_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.SILVER_INGOT.get());
                        output.accept(ModItems.RAW_SILVER.get());

                        output.accept(ModItems.SILVER_SWORD.get());
                        output.accept(ModItems.SILVER_PICKAXE.get());
                        output.accept(ModItems.SILVER_SHOVEL.get());
                        output.accept(ModItems.SILVER_AXE.get());
                        output.accept(ModItems.SILVER_HOE.get());
                        output.accept(ModItems.SILVER_PAXEL.get());

                        output.accept(ModItems.SILVER_HELMET.get());
                        output.accept(ModItems.SILVER_CHESTPLATE.get());
                        output.accept(ModItems.SILVER_LEGGING.get());
                        output.accept(ModItems.SILVER_BOOTS.get());

                        output.accept(ModBlocks.SILVER_BLOCK.get());
                        output.accept(ModBlocks.RAW_SILVER_BLOCK.get());

                        output.accept(ModBlocks.SILVER_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
                        output.accept(ModBlocks.END_STONE_SILVER_ORE.get());
                        output.accept(ModBlocks.NETHER_SILVER_ORE.get());


                        output.accept(ModBlocks.SILVER_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.SILVER_BUTTON.get());
                        output.accept(ModBlocks.SILVER_FENCE.get());
                        output.accept(ModBlocks.SILVER_FENCE_GATE.get());
                        output.accept(ModBlocks.SILVER_WALL.get());
                        output.accept(ModBlocks.SILVER_DOOR.get());
                        output.accept(ModBlocks.SILVER_TRAPDOOR.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}