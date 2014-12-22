package com.gutza1.bunchoblocks.Main;

import com.gutza1.bunchoblocks.blocks.IC2.ICBlocks;
import com.gutza1.bunchoblocks.item.IC2.ICItems;




import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addCraftingRec(){
		//Shaped
		//GameRegistry.addRecipe(new ItemStack(IndustrialCraftBlocks.ComStone, 1), new Object[]{"XXX", "XXX", "XXX", 'X', Blocks.stone});
		//GameRegistry.addRecipe(new ItemStack(IndustrialCraftItems.oStick, 1), new Object[]{" X ", " X ", 'X', Blocks.obsidian});
		//GameRegistry.addRecipe(new ItemStack(IndustrialCraftItems.oStick, 1), new Object[]{"  X", "  X", 'X', Blocks.obsidian});
		//GameRegistry.addRecipe(new ItemStack(IndustrialCraftItems.oStick, 1), new Object[]{"X  ", "X  ", 'X', Blocks.obsidian});
		//Shapeless
		//GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 1), new Object[]{Blocks.stone, IndustrialCraftBlocks.ComStone, Blocks.obsidian});
	}
	public static void addSmeltingRec(){
		//GameRegistry.addSmelting(Blocks.coal_block, new ItemStack(Blocks.obsidian, 1), 20.0f);
	}

}
