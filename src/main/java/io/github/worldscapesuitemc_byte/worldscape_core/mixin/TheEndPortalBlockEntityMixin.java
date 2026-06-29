package io.github.worldscapesuitemc_byte.worldscape_core.mixin;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.TheEndPortalBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TheEndPortalBlockEntity.class)
public class TheEndPortalBlockEntityMixin {

    @Inject(at = @At("HEAD"), method = "shouldRenderFace", cancellable = true)
    private void wc$shouldRenderFace(Direction direction, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}

