package io.github.worldscapesuitemc_byte.worldscape_core;

import io.github.worldscapesuitemc_byte.worldscape_core.item.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(WorldscapeCore.MODID)
public class WorldscapeCore {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "worldscape_core";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // Create a Deferred Register to hold Blocks which will all be registered under the "worldscape_core" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "worldscape_core" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);


    // Creates a creative tab with the id "worldscape_core:example_tab" for the example item, that is placed after the combat tab
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + MODID)) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.MOD_APPLE.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.MOD_APPLE.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event

                output.accept(ModItems.ENRICHED_IRON.get());
                output.accept(ModItems.RAW_GALENA.get());
                output.accept(ModItems.RAW_LEAD.get());
                output.accept(ModItems.RAW_LITHIUM.get());
                output.accept(ModItems.PRYSMAGNETAL_SHARD.get());
                output.accept(ModItems.RAW_SIGNALIUM.get());
                output.accept(ModItems.RAW_SILICA.get());
                output.accept(ModItems.RAW_SILVER.get());
                output.accept(ModItems.RAW_TITANIUM.get());
                output.accept(ModItems.RAW_TRITANIUM.get());
                output.accept(ModItems.RAW_UNUNTRIUM.get());
                output.accept(ModItems.RAW_URANIUM.get());

                output.accept(ModItems.CRUSHED_LEAD.get());
                output.accept(ModItems.CRUSHED_LITHIUM.get());
                output.accept(ModItems.CRUSHED_PRYSMAGNETAL.get());
                output.accept(ModItems.CRUSHED_SIGNALIUM.get());
                output.accept(ModItems.CRUSHED_SILVER.get());
                output.accept(ModItems.CRUSHED_STEEL.get());
                output.accept(ModItems.CRUSHED_TITANIUM.get());
                output.accept(ModItems.CRUSHED_TRITANIUM.get());
                output.accept(ModItems.CRUSHED_UNUNTRIUM.get());
                output.accept(ModItems.CRUSHED_URANIUM.get());

                output.accept(ModItems.CRUSHED_COPPER.get());
                output.accept(ModItems.CRUSHED_IRON.get());
                output.accept(ModItems.CRUSHED_GOLD.get());

                output.accept(ModItems.CRYSTALLIZED_LEAD.get());
                output.accept(ModItems.CRYSTALLIZED_LITHIUM.get());
                output.accept(ModItems.CRYSTALLIZED_PRYSMAGNETAL.get());
                output.accept(ModItems.CRYSTALLIZED_SIGNALIUM.get());
                output.accept(ModItems.CRYSTALLIZED_SILVER.get());
                output.accept(ModItems.CRYSTALLIZED_STEEL.get());
                output.accept(ModItems.CRYSTALLIZED_TITANIUM.get());
                output.accept(ModItems.CRYSTALLIZED_TRITANIUM.get());
                output.accept(ModItems.CRYSTALLIZED_UNUNTRIUM.get());
                output.accept(ModItems.CRYSTALLIZED_URANIUM.get());

                output.accept(ModItems.CRYSTALLIZED_COPPER.get());
                output.accept(ModItems.CRYSTALLIZED_IRON.get());
                output.accept(ModItems.CRYSTALLIZED_GOLD.get());

                output.accept(ModItems.LEAD_INGOT.get());
                output.accept(ModItems.LITHIUM_INGOT.get());
                output.accept(ModItems.PRYSMAGNETAL_INGOT.get());
                output.accept(ModItems.SIGNALIUM_INGOT.get());
                output.accept(ModItems.SILVER_INGOT.get());
                output.accept(ModItems.STEEL_INGOT.get());
                output.accept(ModItems.TITANIUM_INGOT.get());
                output.accept(ModItems.TRITANIUM_INGOT.get());
                output.accept(ModItems.UNUNTRIUM_INGOT.get());
                output.accept(ModItems.URANIUM_INGOT.get());

                output.accept(ModItems.LEAD_NUGGET.get());
                output.accept(ModItems.LITHIUM_NUGGET.get());
                output.accept(ModItems.PRYSMAGNETAL_NUGGET.get());
                output.accept(ModItems.SIGNALIUM_NUGGET.get());
                output.accept(ModItems.SILVER_NUGGET.get());
                output.accept(ModItems.STEEL_NUGGET.get());
                output.accept(ModItems.TITANIUM_NUGGET.get());
                output.accept(ModItems.TRITANIUM_NUGGET.get());
                output.accept(ModItems.UNUNTRIUM_NUGGET.get());
                output.accept(ModItems.URANIUM_NUGGET.get());

                output.accept(ModItems.DIAMOND_SHARD.get());
            }).build());

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public WorldscapeCore(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::registerLayerDefinitions);
        modEventBus.addListener(this::registerEntityRenderers);

        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (WorldscapeCore) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
//        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
//            event.accept(EXAMPLE_BLOCK_ITEM);
//        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }


    // on the mod event bus only on the physical client
    public void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        // Add our layer here.
        // event.add(MY_LAYER, MyEntityModel::createBodyLayer);

    }

    // on the mod event bus only on the physical client

    public void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
    }
}
