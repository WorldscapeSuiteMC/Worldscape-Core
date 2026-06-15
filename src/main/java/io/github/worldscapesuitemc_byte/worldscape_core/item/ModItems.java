package io.github.worldscapesuitemc_byte.worldscape_core.item;

import io.github.worldscapesuitemc_byte.worldscape_core.WorldscapeCore;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // Create a Deferred Register to hold Items which will all be registered under the "worldscape_core" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WorldscapeCore.MODID);
    // Creates a new food item with the id "worldscape_core:example_id", nutrition 1 and saturation 2
    public static final DeferredItem<Item> MOD_APPLE = ITEMS.registerItem("mod_apple", ModAppleItem::new, p -> p.food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build()));

    public static final DeferredItem<Item> ENRICHED_IRON = ITEMS.registerSimpleItem("enriched_iron");
    public static final DeferredItem<Item> RAW_GALENA = ITEMS.registerSimpleItem("raw_galena");
    public static final DeferredItem<Item> RAW_LEAD = ITEMS.registerSimpleItem("raw_lead");
    public static final DeferredItem<Item> RAW_LITHIUM = ITEMS.registerSimpleItem("raw_lithium");
    public static final DeferredItem<Item> PRYSMAGNETAL_SHARD = ITEMS.registerSimpleItem("prysmagnetal_shard");
    public static final DeferredItem<Item> RAW_SIGNALIUM = ITEMS.registerSimpleItem("raw_signalium");
    public static final DeferredItem<Item> RAW_SILICA = ITEMS.registerSimpleItem("raw_silica");
    public static final DeferredItem<Item> RAW_SILVER = ITEMS.registerSimpleItem("raw_silver");
    public static final DeferredItem<Item> RAW_TITANIUM = ITEMS.registerSimpleItem("raw_titanium");
    public static final DeferredItem<Item> RAW_TRITANIUM = ITEMS.registerSimpleItem("raw_tritanium");
    public static final DeferredItem<Item> RAW_UNUNTRIUM = ITEMS.registerSimpleItem("raw_ununtrium");
    public static final DeferredItem<Item> RAW_URANIUM = ITEMS.registerSimpleItem("raw_uranium");
    public static final DeferredItem<Item> CRUSHED_LEAD = ITEMS.registerSimpleItem("crushed_lead");
    public static final DeferredItem<Item> CRUSHED_LITHIUM = ITEMS.registerSimpleItem("crushed_lithium");
    public static final DeferredItem<Item> CRUSHED_PRYSMAGNETAL = ITEMS.registerSimpleItem("crushed_prysmagnetal");
    public static final DeferredItem<Item> CRUSHED_SIGNALIUM = ITEMS.registerSimpleItem("crushed_signalium");
    public static final DeferredItem<Item> CRUSHED_SILVER = ITEMS.registerSimpleItem("crushed_silver");
    public static final DeferredItem<Item> CRUSHED_STEEL = ITEMS.registerSimpleItem("crushed_steel");
    public static final DeferredItem<Item> CRUSHED_TITANIUM = ITEMS.registerSimpleItem("crushed_titanium");
    public static final DeferredItem<Item> CRUSHED_TRITANIUM = ITEMS.registerSimpleItem("crushed_tritanium");
    public static final DeferredItem<Item> CRUSHED_UNUNTRIUM = ITEMS.registerSimpleItem("crushed_ununtrium");
    public static final DeferredItem<Item> CRUSHED_URANIUM = ITEMS.registerSimpleItem("crushed_uranium");
    public static final DeferredItem<Item> CRUSHED_COPPER = ITEMS.registerSimpleItem("crushed_copper");
    public static final DeferredItem<Item> CRUSHED_IRON = ITEMS.registerSimpleItem("crushed_iron");
    public static final DeferredItem<Item> CRUSHED_GOLD = ITEMS.registerSimpleItem("crushed_gold");
    public static final DeferredItem<Item> CRUSHED_GOLD = ITEMS.registerSimpleItem("crushed_gold");
    public static final DeferredItem<Item> CRUSHED_GOLD = ITEMS.registerSimpleItem("crushed_gold");
    public static final DeferredItem<Item> CRUSHED_GOLD = ITEMS.registerSimpleItem("crushed_gold");
    public static final DeferredItem<Item> CRUSHED_GOLD = ITEMS.registerSimpleItem("crushed_gold");
    public static final DeferredItem<Item> CRUSHED_GOLD = ITEMS.registerSimpleItem("crushed_gold");
    public static final DeferredItem<Item> CRUSHED_GOLD = ITEMS.registerSimpleItem("crushed_gold");
    public static final DeferredItem<Item> CRUSHED_GOLD = ITEMS.registerSimpleItem("crushed_gold");
    public static final DeferredItem<Item> CRUSHED_GOLD = ITEMS.registerSimpleItem("crushed_gold");
    public static final DeferredItem<Item> CRUSHED_GOLD = ITEMS.registerSimpleItem("crushed_gold");
    public static final DeferredItem<Item> CRUSHED_GOLD = ITEMS.registerSimpleItem("crushed_gold");
    public static final DeferredItem<Item> CRUSHED_GOLD = ITEMS.registerSimpleItem("crushed_gold");
    public static final DeferredItem<Item> CRUSHED_GOLD = ITEMS.registerSimpleItem("crushed_gold");
}
