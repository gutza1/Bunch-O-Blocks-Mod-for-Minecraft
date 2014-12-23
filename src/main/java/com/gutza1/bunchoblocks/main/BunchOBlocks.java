package com.gutza1.bunchoblocks.main;

import com.gutza1.bunchoblocks.blocks.IC2.ICBlocks;
import com.gutza1.bunchoblocks.client.gui.CreativeTabBoB;
import com.gutza1.bunchoblocks.item.IC2.ICItems;
import com.gutza1.bunchoblocks.lib.EventHandler;
import com.gutza1.bunchoblocks.lib.ModChecker;
import com.gutza1.bunchoblocks.lib.RefStrings;
import com.gutza1.bunchoblocks.world.BunchOBlocksWorld;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION, dependencies = RefStrings.DEPEND, guiFactory = RefStrings.GUIFACTORY)
public class BunchOBlocks {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;

	public static CreativeTabs tabBoB = new CreativeTabBoB(RefStrings.MODID + ".creativeTab");
	public static Logger logger = LogManager.getLogger(RefStrings.NAME);

	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event){
		ConfigHandler.init(event.getSuggestedConfigurationFile());

		if (ModChecker.isIC2Loaded()){
			logger.info("Activing IC2 integration.");
			ICItems.MainRegistry();
			ICBlocks.MainRegistry();
			IC2CraftingManager.mainRegistry();
		}

		FMLCommonHandler.instance().bus().register(new EventHandler());
		BunchOBlocksWorld.mainRegistry();
		CraftingManager.mainRegistry();
		proxy.registerRenderInfo();
	}

	@Mod.EventHandler
	public static void init(FMLInitializationEvent event){

	}

	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event){

	}

}
