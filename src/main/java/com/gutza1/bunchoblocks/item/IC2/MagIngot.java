package com.gutza1.bunchoblocks.item.IC2;

import com.gutza1.bunchoblocks.lib.RefStrings;
import com.gutza1.bunchoblocks.main.BunchOBlocks;

import net.minecraft.item.Item;

public class MagIngot extends Item{
	public MagIngot(){
		setCreativeTab(BunchOBlocks.tabBoB);
		setUnlocalizedName(RefStrings.MODID + "item.ingot.magnesium");
		setTextureName(RefStrings.MODID + ":itemIngotMagnesium");
	}
}
