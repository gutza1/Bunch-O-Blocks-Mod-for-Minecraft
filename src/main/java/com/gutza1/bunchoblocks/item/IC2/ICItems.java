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
	public static Item pureMagDust;
	public static Item magIngot;
	public static void initializeItem(){
		crushMagDust = new CrushMagDust();
		pureMagDust = new PureMagDust();
		magIngot = new MagIngot();
	}
	public static void registerItem(){
		GameRegistry.registerItem(crushMagDust, "crushMagDust");
		GameRegistry.registerItem(pureMagDust, "pureMagDust");
		GameRegistry.registerItem(magIngot, "magIngot");
	}

}
