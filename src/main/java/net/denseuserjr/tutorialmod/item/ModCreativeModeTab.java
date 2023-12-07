package net.denseuserjr.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Tutorial_Tab = new CreativeModeTab("tutorialtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Obamium.get());
        }
    };
}
