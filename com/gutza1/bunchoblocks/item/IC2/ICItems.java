package com.gutza1.bunchoblocks.item.IC2;

import com.gutza1.bunchoblocks.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ICItems {
	public static void MainRegistry(){
		initializeItem();
		registerItem();
	}
	public static Item crushMagDust;
	public static void initializeItem(){
		crushMagDust = new CrushMagDust();
	}
	public static void registerItem(){
		GameRegistry.registerItem(crushMagDust, "crushMagDust");
	}

}
