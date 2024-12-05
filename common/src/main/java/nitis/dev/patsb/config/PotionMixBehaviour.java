package nitis.dev.patsb.config;

import net.minecraft.client.resources.language.I18n;

public enum PotionMixBehaviour {
    EQUAL_CONTRIBUTION,
    PROPORTIONAL_CONTRIBUTION,
    FIXED_COLOR;

    @Override
    public String toString() {
        return I18n.get("text.autoconfig.patsb.PotionMixBehaviour." + name());
    }
}
