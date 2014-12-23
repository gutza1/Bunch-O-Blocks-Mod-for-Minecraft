package com.gutza1.bunchoblocks.main;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;

    // Sections to add to the config
    public static String generation = "Generation";
    public static String modules = "Modules";

    // Options in the config
    public static boolean enableGeneration;

    public static boolean enableIC2Module;

    public static void init(File file) {
        config = new Configuration(file);
        syncConfig();
    }

    public static void syncConfig() {
        config.addCustomCategoryComment(generation, "This section contains all settings regarding ore generation.");
        config.addCustomCategoryComment(modules, "This section allows enabling and disabling of all modules");

        enableGeneration = config.get(generation, "enableGeneration", true, "Enable world generation").getBoolean(enableGeneration);

        enableIC2Module = config.get(modules, "enableIC2Module", true).getBoolean(enableIC2Module);

        config.save();
    }
}
