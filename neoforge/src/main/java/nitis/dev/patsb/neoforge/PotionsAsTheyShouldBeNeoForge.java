package nitis.dev.patsb.neoforge;

import me.shedaniel.autoconfig.AutoConfig;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import nitis.dev.patsb.PotionsAsTheyShouldBe;
import nitis.dev.patsb.config.PotionsAsTheyShouldBeConfig;
import net.neoforged.fml.common.Mod;

@Mod(PotionsAsTheyShouldBe.MOD_ID)
public final class PotionsAsTheyShouldBeNeoForge {

    public PotionsAsTheyShouldBeNeoForge(IEventBus bus) {
        PotionsAsTheyShouldBe.init();

        if (FMLEnvironment.dist.isClient()) {
            registerModsPage();
        }
    }

    private static void registerModsPage() {
        ModLoadingContext.get().registerExtensionPoint(IConfigScreenFactory.class, () -> (container, parent) -> {
            return AutoConfig.getConfigScreen(PotionsAsTheyShouldBeConfig.class, parent).get();
        });
    }
}
