package ru.don1x.simpletrolling;

import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Listener implements org.bukkit.event.Listener {
    public void onPlayerDamage(EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player) {
            Player damager = (Player) e.getDamager();
            if (e.getEntity() instanceof Player) {
                Player damaged = (Player) e.getEntity();
                if ()
            }
        }
    }
}
