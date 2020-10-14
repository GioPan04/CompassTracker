package it.pancla.compasstracker;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Player target;

    @Override
    public void onEnable() {
        Bukkit.getServer().getConsoleSender().sendMessage(Color.GREEN + "CompassTracker is starting");
    }

    @Override
    public void onDisable() {
        Bukkit.getServer().getConsoleSender().sendMessage(Color.RED + "CompassTracker is starting");
    }

}
