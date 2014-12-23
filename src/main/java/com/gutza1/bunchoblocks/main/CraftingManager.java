package com.gutza1.bunchoblocks.main;

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
