package com.gutza1.bunchoblocks.Main;
import net.minecraft.item.ItemStack;
import ic2.api.recipe.RecipeInputOreDict;
import com.gutza1.bunchoblocks.item.IC2.ICItems;;

public class IC2CraftingManager extends CraftingManager{

	public static void addMachineRec(){
		ic2.api.recipe.Recipes.macerator.addRecipe(new RecipeInputOreDict("MagnesiteOre"), null, new ItemStack(ICItems.crushMagDust, 2));
	}
}
