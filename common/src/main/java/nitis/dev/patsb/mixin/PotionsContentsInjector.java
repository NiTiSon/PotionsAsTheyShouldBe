package nitis.dev.patsb.mixin;

import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionContents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PotionContents.class)
public class PotionsContentsInjector {
    @Inject(method = "createItemStack", at = @At("TAIL"))
    private static void createItemStack(Item item, Holder<Potion> holder, CallbackInfoReturnable<ItemStack> cir) {
        cir.getReturnValue().set(DataComponents.MAX_STACK_SIZE, 3);
    }
}
