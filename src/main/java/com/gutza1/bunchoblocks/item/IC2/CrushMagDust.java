package com.gutza1.bunchoblocks.item.IC2;

import com.gutza1.bunchoblocks.lib.RefStrings;
import com.gutza1.bunchoblocks.main.BunchOBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CrushMagDust extends Item{
	public CrushMagDust(){
		setCreativeTab(BunchOBlocks.tabBoB);
		setUnlocalizedName(RefStrings.MODID + ".dust.unref.magnesium");
		setTextureName(RefStrings.MODID + ":dustUnrefMagnesium");
	}
}
