package com.github.neapovil.dynamicslots;

import org.bukkit.plugin.java.JavaPlugin;

public final class DynamicSlots extends JavaPlugin
{
    private static DynamicSlots instance;

    @Override
    public void onEnable()
    {
        instance = this;
    }

    public static DynamicSlots instance()
    {
        return instance;
    }
}
