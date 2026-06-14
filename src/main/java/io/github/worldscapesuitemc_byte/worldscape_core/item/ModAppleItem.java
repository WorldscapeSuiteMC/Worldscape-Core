package io.github.worldscapesuitemc_byte.worldscape_core.item;

import io.github.worldscapesuitemc_byte.worldscape_core.WorldscapeCore;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ModAppleItem extends Item {
    public ModAppleItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {

        WorldscapeCore.LOGGER.info("You ate the apple...");
        return super.finishUsingItem(itemStack, level, entity);
    }
}
