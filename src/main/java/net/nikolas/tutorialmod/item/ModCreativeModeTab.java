package net.nikolas.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("TutorialLabel") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };
}
