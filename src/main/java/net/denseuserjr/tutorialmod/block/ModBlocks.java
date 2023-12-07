package net.denseuserjr.tutorialmod.block;

import net.denseuserjr.tutorialmod.TutorialMod;
import net.denseuserjr.tutorialmod.item.ModCreativeModeTab;
import net.denseuserjr.tutorialmod.item.ModItems;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> Obamium_Block = registerBlock("obamium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f)
                    .requiresCorrectToolForDrops())
                    ,ModCreativeModeTab.Tutorial_Tab);
    public static final RegistryObject<Block> Raw_Obamium_Block = registerBlock("raw_obamium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.Tutorial_Tab);
    public static final RegistryObject<Block> Obamium_Ore = registerBlock("obamium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f)
                    .requiresCorrectToolForDrops()
                    ,UniformInt.of(3, 7))
                    , ModCreativeModeTab.Tutorial_Tab);
    public static final RegistryObject<Block> Deepslate_Obamium_Ore = registerBlock("deepslate_obamium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f)
                    .requiresCorrectToolForDrops()
                    ,UniformInt.of(3, 7))
                    , ModCreativeModeTab.Tutorial_Tab);


    private static <T extends Block>RegistryObject<T>registerBlock(String name, Supplier<T> block, CreativeModeTab tab)
    {
        RegistryObject<T> toReturn=BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);

        return  toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
