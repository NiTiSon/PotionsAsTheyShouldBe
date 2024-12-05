package nitis.dev.patsb.fabric;

import com.terraformersmc.modmenu.api.*;
import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import nitis.dev.patsb.config.PotionsAsTheyShouldBeConfig;

@Environment(EnvType.CLIENT)
public class ModMenuIntegration implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> AutoConfig.getConfigScreen(PotionsAsTheyShouldBeConfig.class, parent).get();
    }
}