package com.gutza1.bunchoblocks.item.IC2;

import com.gutza1.bunchoblocks.lib.RefStrings;
import com.gutza1.bunchoblocks.main.BunchOBlocks;

import net.minecraft.item.Item;

public class PureMagDust extends Item{
	public PureMagDust(){
		setCreativeTab(BunchOBlocks.tabBoB);
		setUnlocalizedName(RefStrings.MODID + ".dust.pure.magnesium");
		setTextureName(RefStrings.MODID + ":dustPureMagnesium");
	}

}
