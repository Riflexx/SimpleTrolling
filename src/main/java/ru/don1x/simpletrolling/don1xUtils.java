package ru.don1x.simpletrolling;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class don1xUtils {
    public static List<String> help() {
        return Arrays.asList("/trolling DAMAGE [ник] [сила]", "/trolling");
    }

    public static ConfigurationSection getData() {
        return SimpleTrolling.getPlugin().getConfig().getConfigurationSection("data");
    }

    public static boolean isPranked(String name) {
        if (getData().getConfigurationSection("data." + name) != null) {
            return getData().getConfigurationSection("data." + name).getBoolean("pranked");
        } else {
            return false;
        }
    }

    public static String getPrank(String name) {
        return getData().getConfigurationSection("data." + name).getString("prank-type");
    }

    public static int getPrankPower(String name) {
        return getData().getConfigurationSection("data." + name).getInt("power");
    }

    public static void createPrank(String name, String pranktype, int power) {
        try {
            FileConfiguration config = (FileConfiguration) getData();
            config.getConfigurationSection("data." + name).set("pranked", true);
            config.getConfigurationSection("data." + name).set("prank-type", pranktype);
            config.getConfigurationSection("data." + name).set("power", power);
            config.save(String.valueOf(getData()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void removePrank(String name) throws IOException {
        FileConfiguration config = (FileConfiguration) getData();
        config.set("data." + name, null);
        config.save(String.valueOf(getData()));
    }
}
