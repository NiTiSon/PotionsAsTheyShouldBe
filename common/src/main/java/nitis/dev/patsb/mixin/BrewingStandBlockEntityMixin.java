package nitis.dev.patsb.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BrewingStandBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BrewingStandBlockEntity.class)
public class BrewingStandBlockEntityMixin {

    @Inject(method = "isBrewable", at = @At("RETURN"))
    private static void isBrewable(PotionBrewing potionBrewing, NonNullList<ItemStack> nonNullList, CallbackInfoReturnable<Boolean> cir) {
        if (!cir.getReturnValue() && !nonNullList.isEmpty()) {
            ItemStack top = nonNullList.get(3);
            ItemStack
                    x1 = nonNullList.get(0),
                    x2 = nonNullList.get(1),
                    x3 = nonNullList.get(2);


        }
    }
//
//    @Inject(method = "doBrew", at = @At(""))
//    private static void doBrew(Level level, BlockPos blockPos, NonNullList<ItemStack> nonNullList, CallbackInfo ci) {
//
//    }
}
