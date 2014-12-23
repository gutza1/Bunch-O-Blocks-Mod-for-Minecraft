package com.gutza1.bunchoblocks.lib;

import com.gutza1.bunchoblocks.main.BunchOBlocks;
import com.gutza1.bunchoblocks.main.ConfigHandler;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equals(RefStrings.MODID)) {
            ConfigHandler.syncConfig();
            BunchOBlocks.logger.info("Refreshing configuration file");
        }
    }
}
