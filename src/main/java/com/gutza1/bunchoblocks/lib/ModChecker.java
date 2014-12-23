package com.gutza1.bunchoblocks.lib;

import com.gutza1.bunchoblocks.main.ConfigHandler;
import cpw.mods.fml.common.Loader;

public class ModChecker {

    public static boolean isIC2Loaded() {
        return Loader.isModLoaded("IC2") && ConfigHandler.enableIC2Module;
    }
}
