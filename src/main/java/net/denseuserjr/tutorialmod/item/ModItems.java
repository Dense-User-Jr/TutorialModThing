package net.denseuserjr.tutorialmod.item;

import net.denseuserjr.tutorialmod.TutorialMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.event.InputEvent;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> Obamium = ITEMS.register("obamium",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Tutorial_Tab)));
    public static final RegistryObject<Item> Raw_Obamium = ITEMS.register("raw_obamium",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Tutorial_Tab)));

    public static void  register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
