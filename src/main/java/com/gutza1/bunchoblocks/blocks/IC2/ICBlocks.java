package com.gutza1.bunchoblocks.blocks.IC2;

import com.gutza1.bunchoblocks.lib.ModChecker;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class ICBlocks {

	public static void MainRegistry(){
		initializeBlock();
		registerItem();
	}
	
	public static Block magnesiteOre;

	public static void initializeBlock(){
		if (ModChecker.isIC2Loaded()){
			magnesiteOre = new MagnesiteOre(Material.rock);
		}
	}
	public static void registerItem(){
		if (ModChecker.isIC2Loaded()){
			GameRegistry.registerBlock(magnesiteOre, magnesiteOre.getUnlocalizedName());
			OreDictionary.registerOre(magnesiteOre.getUnlocalizedName(), new ItemStack(magnesiteOre));
		}
	}
}
