package ru.don1x.simpletrolling;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            if (player.hasPermission("simpletrolling.use")) {
                if (strings[0].equals("help") || strings[0].equals("?") || strings[0].equals("info") || strings.length == 0) {

                }
            }
        }
        return true;
    }
}
