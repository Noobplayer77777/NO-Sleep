package me.noob.minecraft.nobed.Event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class NoBedEvent implements Listener {

    @EventHandler
    public void onSleep(PlayerBedEnterEvent e){
        Player player = e.getPlayer();
        e.getBed().getWorld().createExplosion(player.getLocation() , 5.0f ,true);
    }
}
