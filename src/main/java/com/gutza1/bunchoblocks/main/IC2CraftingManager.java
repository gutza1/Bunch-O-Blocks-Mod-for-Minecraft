package com.gutza1.bunchoblocks.main;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;
import ic2.api.recipe.RecipeInputOreDict;

import com.gutza1.bunchoblocks.blocks.IC2.ICBlocks;
import com.gutza1.bunchoblocks.item.IC2.ICItems;
import com.gutza1.bunchoblocks.lib.ModChecker;

import cpw.mods.fml.common.registry.GameRegistry;

public class IC2CraftingManager extends CraftingManager{
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
		addMachineRec();
	}
	public static void addCraftingRec(){
		if (ModChecker.isGregtechLoaded()){
			
		}
		else{
			
		}
		
	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting(ICBlocks.magnesiteOre, new ItemStack(ICItems.magIngot, 1), 20.0f);
		if (ModChecker.isGregtechLoaded()){
			
		}
		else{
			GameRegistry.addSmelting(ICItems.pureMagDust, new ItemStack(ICItems.magIngot, 1), 30.0f);
		}
	}
	public static void addMachineRec(){
		Recipes.macerator.addRecipe(new RecipeInputOreDict(ICBlocks.magnesiteOre.getUnlocalizedName()), null, new ItemStack(ICItems.crushMagDust, 2));
		if (ModChecker.isGregtechLoaded()){
			
		}
		else{
			
		}
		
	}
}
