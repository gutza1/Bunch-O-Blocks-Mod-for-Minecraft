package com.gutza1.bunchoblocks.blocks.IC2;

import com.gutza1.bunchoblocks.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class ICBlocks {
	public static void MainRegistry(){
		initializeBlock();
		registerItem();
	}
	
	public static Block MagnesiteOre;
	public static void initializeBlock(){
		if (Loader.isModLoaded("IC2")){
			MagnesiteOre = new MagnesiteOre(Material.rock);
		}
	}
	public static void registerItem(){
		if (Loader.isModLoaded("IC2")){
			GameRegistry.registerBlock(MagnesiteOre, MagnesiteOre.getUnlocalizedName());
			OreDictionary.registerOre(MagnesiteOre.getUnlocalizedName(), new ItemStack(MagnesiteOre));
		}
	}

}
