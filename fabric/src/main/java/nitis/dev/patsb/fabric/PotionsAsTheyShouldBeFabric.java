package nitis.dev.patsb.fabric;

import nitis.dev.patsb.PotionsAsTheyShouldBe;
import net.fabricmc.api.ModInitializer;

public final class PotionsAsTheyShouldBeFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PotionsAsTheyShouldBe.init();
    }
}
