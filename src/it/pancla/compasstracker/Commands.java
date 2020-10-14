package it.pancla.compasstracker;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player) || s != "track" ) {
            return false;
        }

        Main.target = commandSender.getServer().getPlayer(strings[0]);
        return true;
    }
}
