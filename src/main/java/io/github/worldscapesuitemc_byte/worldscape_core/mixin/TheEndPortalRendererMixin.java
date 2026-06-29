package io.github.worldscapesuitemc_byte.worldscape_core.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.FaceInfo;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.TheEndPortalRenderer;
import net.minecraft.client.renderer.blockentity.state.EndPortalRenderState;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.core.Direction;
import net.minecraft.util.Util;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Mixin(TheEndPortalRenderer.class)
public class TheEndPortalRendererMixin {

    private static final Vector3fc FROM = new Vector3f(0.0F, 0.0F, 0.0F);
    private static final Vector3fc TO = new Vector3f(1.0F, 1.0F, 1.0F);
    private static final Map<Direction, List<Vector3fc>> FACES = Util.makeEnumMap(Direction.class, (direction) -> {
        FaceInfo faceInfo = FaceInfo.fromFacing(direction);
        return List.of(faceInfo.getVertexInfo(0).select(FROM, TO), faceInfo.getVertexInfo(1).select(FROM, TO), faceInfo.getVertexInfo(2).select(FROM, TO), faceInfo.getVertexInfo(3).select(FROM, TO));
    });

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/EndPortalRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void wc$shouldRenderFace(EndPortalRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera, CallbackInfo ci) {
        poseStack.pushPose();
        wc$submitCube(state.facesToShow, RenderTypes.endPortal(), poseStack, submitNodeCollector);
        poseStack.popPose();


        ci.cancel();
    }

    private static void wc$submitCube(Collection<Direction> facesToShow, RenderType renderType, PoseStack poseStack, SubmitNodeCollector submitNodeCollector) {
        if (!facesToShow.isEmpty()) {
            submitNodeCollector.submitCustomGeometry(poseStack, renderType, (pose, buffer) -> {
                for(Direction direction : facesToShow) {
                    for(Vector3fc faceVertex : FACES.get(direction)) {
                        buffer.addVertex(pose, faceVertex);
                    }
                }

            });
        }

    }
}

