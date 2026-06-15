package io.github.worldscapesuitemc_byte.worldscape_core.item;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;

import java.util.stream.Stream;

public class ModItemModelProvider extends ModelProvider
{
    public ModItemModelProvider(PackOutput output) {
        super(output,"worldscape_core");
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return Stream.of(
                ModItems.ENRICHED_IRON,
                ModItems.RAW_GALENA,
                ModItems.RAW_LEAD,
                ModItems.RAW_LITHIUM,
                ModItems.PRYSMAGNETAL_SHARD,
                ModItems.RAW_SIGNALIUM,
                ModItems.RAW_SILICA,
                ModItems.RAW_SILVER,
                ModItems.RAW_TITANIUM,
                ModItems.RAW_TRITANIUM,
                ModItems.RAW_UNUNTRIUM,
                ModItems.RAW_URANIUM,
                ModItems.CRUSHED_LEAD,
                ModItems.CRUSHED_LITHIUM,
                ModItems.CRUSHED_PRYSMAGNETAL,
                ModItems.CRUSHED_SIGNALIUM,
                ModItems.CRUSHED_SILVER,
                ModItems.CRUSHED_STEEL,
                ModItems.CRUSHED_TITANIUM,
                ModItems.CRUSHED_TRITANIUM,
                ModItems.CRUSHED_UNUNTRIUM,
                ModItems.CRUSHED_URANIUM,
                ModItems.CRUSHED_COPPER,
                ModItems.CRUSHED_IRON,
                ModItems.CRUSHED_GOLD
        );
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.ENRICHED_IRON.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_GALENA.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_LEAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_LITHIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PRYSMAGNETAL_SHARD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_SIGNALIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_SILICA.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_SILVER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_TITANIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_TRITANIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_UNUNTRIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_URANIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRUSHED_LEAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRUSHED_LITHIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRUSHED_PRYSMAGNETAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRUSHED_SIGNALIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRUSHED_SILVER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRUSHED_STEEL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRUSHED_TITANIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRUSHED_TRITANIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRUSHED_UNUNTRIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRUSHED_URANIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRUSHED_COPPER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRUSHED_IRON.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CRUSHED_GOLD.get(), ModelTemplates.FLAT_ITEM);

    }
}
