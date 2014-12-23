package com.gutza1.bunchoblocks.client.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabBoB extends CreativeTabs {

    public CreativeTabBoB(String tabLabel) {
        super(tabLabel);
    }

    // The tab icon is what you return here.
    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(Blocks.dragon_egg);
    }

    @Override
    public Item getTabIconItem() {
        return new Item();
    }
}
