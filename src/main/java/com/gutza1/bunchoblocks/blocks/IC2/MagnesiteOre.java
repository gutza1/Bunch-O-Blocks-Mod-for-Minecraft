package com.gutza1.bunchoblocks.blocks.IC2;

import com.gutza1.bunchoblocks.lib.RefStrings;
import com.gutza1.bunchoblocks.main.BunchOBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MagnesiteOre extends Block {

	protected MagnesiteOre(Material material) {
		super(material);

		setBlockName(RefStrings.MODID + ".ore.magnesite");
		setCreativeTab(BunchOBlocks.tabBoB);
		setBlockTextureName(RefStrings.MODID + ":magnesite_ore");
		setStepSound(Block.soundTypeStone);
		setHardness(2.5f);
		setResistance(12.5f);
	}
}
