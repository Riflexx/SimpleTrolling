package ru.don1x.simpletrolling;

import org.bukkit.Bukkit;
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
                if (strings[0].equals("DAMAGE")) {

                        String type = strings[0];
                        Player playerArg = Bukkit.getPlayer(strings[1]);
                        int power = Integer.parseInt(strings[2]);
                        assert playerArg != null;
                    don1xUtils.createPrank(playerArg.getName(), type, power);

                }
            }
        }
        return true;
    }
}
