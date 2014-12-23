package com.gutza1.bunchoblocks.client.gui;

import com.gutza1.bunchoblocks.lib.RefStrings;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;

import static com.gutza1.bunchoblocks.main.ConfigHandler.*;

import java.util.ArrayList;
import java.util.List;

public class ConfigGui extends GuiConfig {

    public ConfigGui(GuiScreen parentScreen) {
        super(parentScreen, getConfigElements(parentScreen), RefStrings.MODID, false, false, StatCollector.translateToLocal("gui." + RefStrings.MODID + ".config.title"));
    }

    @SuppressWarnings("rawtypes")
    private static List<IConfigElement> getConfigElements(GuiScreen parent) {
        List<IConfigElement> list = new ArrayList<IConfigElement>();
        list.add(new ConfigElement<ConfigCategory>(config.getCategory(generation.toLowerCase())));
        list.add(new ConfigElement<ConfigCategory>(config.getCategory(modules.toLowerCase())));

        return list;
    }
}
