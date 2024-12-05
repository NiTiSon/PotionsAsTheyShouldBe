package nitis.dev.patsb;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import nitis.dev.patsb.config.PotionsAsTheyShouldBeConfig;

public final class PotionsAsTheyShouldBe {
    public static final String MOD_ID = "patsb";

    public static PotionsAsTheyShouldBeConfig config;

    public static void init() {
        AutoConfig.register(PotionsAsTheyShouldBeConfig.class, GsonConfigSerializer::new);
        config = AutoConfig.getConfigHolder(PotionsAsTheyShouldBeConfig.class).getConfig();
    }
}
