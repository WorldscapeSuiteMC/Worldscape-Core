package io.github.worldscapesuitemc_byte.worldscape_core.item;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

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
                ModItems.RAW_SIGNALIUM,
                ModItems.RAW_SILICA,
                ModItems.RAW_SILVER,
                ModItems.RAW_TITANIUM,
                ModItems.RAW_TRITANIUM,
                ModItems.RAW_UNUNTRIUM,
                ModItems.RAW_URANIUM
        );
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.ENRICHED_IRON.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_GALENA.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_LEAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_LITHIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_SIGNALIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_SILICA.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_SILVER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_TITANIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_TRITANIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_UNUNTRIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_URANIUM.get(), ModelTemplates.FLAT_ITEM);

    }
}
