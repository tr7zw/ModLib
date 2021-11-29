package dev.tr7zw.modlib;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModBase {

    public static Logger LOGGER;
    
    public ModBase(String name) {
        LOGGER = LogManager.getLogger(name);
    }
    
}
