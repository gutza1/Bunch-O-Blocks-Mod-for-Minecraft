package com.gutza1.bunchoblocks.main;
import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;
import ic2.api.recipe.RecipeInputOreDict;
import com.gutza1.bunchoblocks.item.IC2.ICItems;

public class IC2CraftingManager extends CraftingManager{

	public static void addMachineRec(){
		Recipes.macerator.addRecipe(new RecipeInputOreDict("MagnesiteOre"), null, new ItemStack(ICItems.crushMagDust, 2));
	}
}
