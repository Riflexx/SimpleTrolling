package ru.don1x.simpletrolling;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleTrolling extends JavaPlugin {
    private static SimpleTrolling plugin;

    @Override
    public void onEnable() {
        plugin = this;
        getCommand("trolling").setExecutor(new Commands());
        Bukkit.getPluginManager().registerEvents(new Listener(), this);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {

    }
    public static SimpleTrolling getPlugin() {return plugin;}
}
