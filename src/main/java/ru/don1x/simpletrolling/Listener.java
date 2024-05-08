package ru.don1x.simpletrolling;

import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Listener implements org.bukkit.event.Listener {
    public void onPlayerDamage(EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Player) {
            Player damaged = (Player) e.getEntity();
            if (don1xUtils.isPranked(damaged.getName())) {
                if (don1xUtils.getPrank(damaged.getName()).equals("DAMAGE")) {
                    double damage = e.getDamage() * don1xUtils.getPrankPower(damaged.getName());
                    e.setDamage(damage);
                }
            }
        }
    }
}
