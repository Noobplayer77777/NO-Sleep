package me.noob.minecraft.nobed;

import me.noob.minecraft.nobed.Event.NoBedEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoBed extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("NO BED TO SLEEP HAS LOADED");
        getServer().getPluginManager().registerEvents(new NoBedEvent(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
