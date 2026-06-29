package io.github.worldscapesuitemc_byte.worldscape_core.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

public class PredalienQueen extends LivingEntity {
    public PredalienQueen(EntityType<? extends LivingEntity> type, Level level) {
        super(type, level);
    }

    @Override
    public HumanoidArm getMainArm() {
        return HumanoidArm.RIGHT;
    }

    @Override
    public boolean shouldRender(double camX, double camY, double camZ) {
        return true;
    }

    @Override
    public boolean shouldRenderAtSqrDistance(double distance) {
        return true;
    }
}
