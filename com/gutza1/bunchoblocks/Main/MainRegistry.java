package com.gutza1.bunchoblocks.Main;

import com.gutza1.bunchoblocks.blocks.IC2.ICBlocks;
import com.gutza1.bunchoblocks.item.IC2.ICItems;
import com.gutza1.bunchoblocks.lib.RefStrings;
import com.gutza1.bunchoblocks.world.BunchOBlocksWorld;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {
	
		@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
		public static ServerProxy proxy;
		
		@EventHandler
		public static void PreLoad(FMLPreInitializationEvent PreEvent){
			if (Loader.isModLoaded("IC2")){
				ICItems.MainRegistry();
				ICBlocks.MainRegistry();
				IC2CraftingManager.mainRegistry();
			}
			BunchOBlocksWorld.mainRegistry();
			CraftingManager.mainRegistry();
			proxy.registerRenderInfo();
		}
		@EventHandler
		public static void load(FMLInitializationEvent event){
			
		}
		@EventHandler
		public static void PostLoad(FMLPostInitializationEvent PostEvent){
			
		}

}
