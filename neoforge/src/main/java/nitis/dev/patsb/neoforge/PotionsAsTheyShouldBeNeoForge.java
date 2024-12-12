package nitis.dev.patsb.neoforge;

import net.neoforged.bus.api.IEventBus;
import nitis.dev.patsb.PotionsAsTheyShouldBe;
import net.neoforged.fml.common.Mod;

@Mod(PotionsAsTheyShouldBe.MOD_ID)
public final class PotionsAsTheyShouldBeNeoForge {

    public PotionsAsTheyShouldBeNeoForge(IEventBus bus) {
        PotionsAsTheyShouldBe.init();
    }
}
