package io.github.worldscapesuitemc_byte.worldscape_core;

import io.github.worldscapesuitemc_byte.worldscape_core.item.ModItemModelProvider;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = WorldscapeCore.MODID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = WorldscapeCore.MODID, value = Dist.CLIENT)
public class WorldscapeCoreClient {
    public WorldscapeCoreClient(ModContainer container) {
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        // Some client setup code
        WorldscapeCore.LOGGER.info("HELLO FROM CLIENT SETUP");
        WorldscapeCore.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }

    @SubscribeEvent
    static void onGatherData(GatherDataEvent.Client event) {
        event.createProvider(ModItemModelProvider::new);
    }
}
