package it.pancla.compasstracker;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Tracker implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if(event.getAction() != Action.RIGHT_CLICK_AIR) return;
        Player player = event.getPlayer();
        Location location = Main.target.getLocation();
        player.setCompassTarget(location);
    }
}
