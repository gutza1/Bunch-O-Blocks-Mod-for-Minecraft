package com.gutza1.bunchoblocks.blocks.IC2;

import java.util.Random;

import com.gutza1.bunchoblocks.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MagnesiteOre extends Block{

	protected MagnesiteOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		setBlockName("MagnesiteOre");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(textureName);
		setHardness(2.5f);
		setStepSound(Block.soundTypeStone);
		setHarvestLevel("pickaxe", 1);
		setResistance(12.5f);
	}
	
	@Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(ICBlocks.MagnesiteOre);
    }

}
