package com.github.neapovil.dynamicslots;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class DynamicSlots extends JavaPlugin implements Listener
{
    private static DynamicSlots instance;

    @Override
    public void onEnable()
    {
        instance = this;

        this.getServer().setMaxPlayers(0);

        this.getServer().getPluginManager().registerEvents(this, this);
    }

    public static DynamicSlots instance()
    {
        return instance;
    }

    @EventHandler
    private void onPlayerLogin(PlayerLoginEvent event)
    {
        if (event.getResult().equals(PlayerLoginEvent.Result.KICK_FULL))
        {
            event.setResult(PlayerLoginEvent.Result.ALLOWED);
        }
    }
}
