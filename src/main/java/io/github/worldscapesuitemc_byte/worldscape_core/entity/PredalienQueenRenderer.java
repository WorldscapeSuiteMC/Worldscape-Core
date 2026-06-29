package io.github.worldscapesuitemc_byte.worldscape_core.entity;

import io.github.worldscapesuitemc_byte.worldscape_core.WorldscapeCore;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.Identifier;

public class PredalienQueenRenderer extends LivingEntityRenderer<PredalienQueen, LivingEntityRenderState, PredalienQueenModel> {
    public PredalienQueenRenderer(EntityRendererProvider.Context context ){
        super(context, new PredalienQueenModel(context.bakeLayer(PredalienQueenModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public Identifier getTextureLocation(LivingEntityRenderState livingEntityRenderState) {
        return Identifier.fromNamespaceAndPath(WorldscapeCore.MODID, "textures/entity/predalien_queen_base.png");
    }

    @Override
    public LivingEntityRenderState createRenderState() {
        return new LivingEntityRenderState();
    }

    @Override
    public boolean shouldRender(PredalienQueen entity, Frustum culler, double camX, double camY, double camZ) {
        return true;
    }

    @Override
    protected boolean shouldRenderLayers(LivingEntityRenderState state) {
        return true;
    }

    @Override
    protected boolean shouldShowName(PredalienQueen entity, double distanceToCameraSq) {
        return false;
    }
}
