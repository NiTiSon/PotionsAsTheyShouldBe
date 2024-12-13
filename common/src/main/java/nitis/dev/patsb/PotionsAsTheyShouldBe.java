package nitis.dev.patsb;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import nitis.dev.patsb.config.PotionsAsTheyShouldBeConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public final class PotionsAsTheyShouldBe {
    public static final String MOD_ID = "patsb";

    private static final Logger logger = LogManager.getLogger(MOD_ID);

    private static boolean isLoaded;
    private static PotionsAsTheyShouldBeConfig config;

    public static void init() {
        AutoConfig.register(PotionsAsTheyShouldBeConfig.class, GsonConfigSerializer::new);
        config = readConfig();
        if (config == null) {
            logger.warn("Unable to read config by initialization");
        }
        isLoaded = true;
    }

    private static PotionsAsTheyShouldBeConfig readConfig() {
        return AutoConfig.getConfigHolder(PotionsAsTheyShouldBeConfig.class).getConfig();
    }

    public static PotionsAsTheyShouldBeConfig getConfig() {
        if (config != null) return config;

        if (!isLoaded) {
            logger.warn("getConfig called before mod initialization: Default config returned");
            return PotionsAsTheyShouldBeConfig.DEFAULT;
        } else {
            config = readConfig();

            if (config != null) return config; // Lazy config loading

            logger.error("Failed to load config, possibly GlitchCore is installed");
            return PotionsAsTheyShouldBeConfig.DEFAULT;
        }
    }
}
