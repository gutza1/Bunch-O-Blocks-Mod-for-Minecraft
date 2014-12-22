package com.gutza1.bunchoblocks.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class BunchOBlocksWorld {
	public static void mainRegistry(){
		initializeWorldGen();
	}
	
	public static void initializeWorldGen(){
		registerWorldGen(new BunchOBlocksOre(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}
}
