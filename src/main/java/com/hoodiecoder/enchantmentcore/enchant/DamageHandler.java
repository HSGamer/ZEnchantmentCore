package com.hoodiecoder.enchantmentcore.enchant;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * An extension to {@link com.hoodiecoder.enchantmentcore.CustomEnch} to deal with damage event
 */
public interface DamageHandler {
    /**
     * <p>Event method automatically called when an entity using this enchantment takes damage.</p>
     *
     * @param entity The entity involved
     * @param levels The levels of each item currently in use with this enchantment
     * @param items  Each item currently in use with this enchantment
     * @param event  The event that the entity is involved with
     */
    void onTakeDamage(LivingEntity entity, List<Integer> levels, List<ItemStack> items, EntityDamageEvent event);

    /**
     * <p>Event method automatically called when an entity using this enchantment deals damage.</p>
     *
     * @param entity The entity involved
     * @param levels The levels of each item currently in use with this enchantment
     * @param items  Each item currently in use with this enchantment
     * @param event  The event that the entity is involved with
     */
    void onDealDamage(LivingEntity entity, List<Integer> levels, List<ItemStack> items, EntityDamageByEntityEvent event);
}
