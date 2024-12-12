package nitis.dev.patsb.neoforge.client;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

public class PotionsAsTheyShouldBeNeoForgeClient {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            // PotionsAsTheyShouldBeClient.init();


        });
    }
}
