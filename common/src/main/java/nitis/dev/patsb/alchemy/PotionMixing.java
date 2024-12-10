package nitis.dev.patsb.alchemy;

import net.minecraft.core.Holder;
import net.minecraft.core.NonNullList;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionContents;

import java.awt.*;
import java.util.List;
import java.util.Optional;

public class PotionMixing {
    private PotionMixing() {}

    public static void mix(NonNullList<ItemStack> mixingPotions) {
        if (mixingPotions.isEmpty() || !mixingPotions.stream().allMatch(t -> t.has(DataComponents.POTION_CONTENTS))) {
            return;
        }

        int mixR = 0, mixG = 0, mixB = 0;
        NonNullList<PotionContents> potions = NonNullList.createWithCapacity(mixingPotions.size());
        for (int i = 0; i < mixingPotions.size(); i++) {
            PotionContents potion = mixingPotions.get(i).get(DataComponents.POTION_CONTENTS);
            potions.set(i, potion);

            @SuppressWarnings("DataFlowIssue")
            int color = potion.getColor();

            mixR += (color >> 24) & 0xFF;
            mixG += (color >> 16) & 0xFF;
            mixB += (color >> 8) & 0xFF;
        }
        mixR /= potions.size();
        mixG /= potions.size();
        mixB /= potions.size();

        mixR = (mixR << 24) & 0xFF;
        mixG = (mixG << 16) & 0xFF;
        mixB = (mixB << 8) & 0xFF;
        Integer color = mixR | mixG | mixB;

        PotionContents mixedContent = new PotionContents(Optional.empty(), Optional.of(color), List.of());

        for (ItemStack mixingPotion : mixingPotions) { // Mix potions
            mixingPotion.set(DataComponents.POTION_CONTENTS, mixedContent);
        }
    }
}