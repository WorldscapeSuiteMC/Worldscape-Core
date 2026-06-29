package io.github.worldscapesuitemc_byte.worldscape_core.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EndPortalBlock;
import net.minecraft.world.level.block.entity.TheEndPortalBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndPortalBlock.class)
public class TheEndPortalBlockMixin {

    @Inject(at = @At("HEAD"), method = "getShape", cancellable = true)
    private void wc$shouldRenderFace(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context, CallbackInfoReturnable<VoxelShape> cir) {
        cir.setReturnValue(Block.column((double)16.0F, (double)0.0F, (double)16.0F));
    }
    @Inject(at = @At("HEAD"), method = "animateTick", cancellable = true)
    private void wc$animate(BlockState state, Level level, BlockPos pos, RandomSource random, CallbackInfo ci) {
        ci.cancel();
    }
}

