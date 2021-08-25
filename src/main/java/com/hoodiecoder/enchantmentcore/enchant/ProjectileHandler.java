package com.hoodiecoder.enchantmentcore.enchant;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * An extension to {@link com.hoodiecoder.enchantmentcore.CustomEnch} to deal with projectile event
 */
public interface ProjectileHandler {
    /**
     * <p>Event method automatically called when an entity using this enchantment hits something.</p>
     *
     * @param entity The entity involved
     * @param levels The levels of each item currently in use with this enchantment
     * @param items  Each item currently in use with this enchantment
     * @param event  The event that the entity is involved with
     */
    void onHit(LivingEntity entity, List<Integer> levels, List<ItemStack> items, ProjectileHitEvent event);
}
