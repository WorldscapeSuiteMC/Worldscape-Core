package io.github.worldscapesuitemc_byte.worldscape_core.entity;

import io.github.worldscapesuitemc_byte.worldscape_core.WorldscapeCore;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, WorldscapeCore.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<PredalienQueen>> ALIEN = ENTITY_TYPES.register("alien", () -> {
        return EntityType.Builder.of(PredalienQueen::new, MobCategory.MISC)
                .sized(0.6F, 1.95F)
                .passengerAttachments(2.125F)
                .ridingOffset(-0.7F).eyeHeight(1.74F)
                .clientTrackingRange(32)
                .build(modEntityId("alien"));
    });

    private static ResourceKey<EntityType<?>> modEntityId(String vanillaId) {
        return ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(WorldscapeCore.MODID,vanillaId));
    }
}
