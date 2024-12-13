package nitis.dev.patsb.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.example.ExampleConfig;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry.*;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.*;
import nitis.dev.patsb.PotionsAsTheyShouldBe;

@Config(name = PotionsAsTheyShouldBe.MOD_ID)
public class PotionsAsTheyShouldBeConfig implements ConfigData {
    @Tooltip
    @BoundedDiscrete(min = 1, max = 64) // Strict 1..64 bounds: values out of this bounds cause Exceptions during game
    public int potionMaxStackValue = 3;

    /* WHEN COMBINATION WILL BE ADDED
    @Category("combination")
    @Tooltip
    public boolean potionMixEnabled = true;
    @Category("combination")
    @Tooltip
    @EnumHandler(option = EnumHandler.EnumDisplayOption.BUTTON)
    public PotionMixBehaviour mixedPotionColorBehaviour = PotionMixBehaviour.PROPORTIONAL_CONTRIBUTION;
    @Category("combination")
    @Tooltip
    @ColorPicker
    public int fixedMixedPotionColor = 0xFF0000;
     */

    @Excluded
    public static final PotionsAsTheyShouldBeConfig DEFAULT = new PotionsAsTheyShouldBeConfig();
}

