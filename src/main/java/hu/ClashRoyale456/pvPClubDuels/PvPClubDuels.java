package hu.ClashRoyale456.pvPClubDuels;

import org.bukkit.plugin.java.JavaPlugin;
import hu.ClashRoyale456.pvPClubDuels.Commands.*;
import hu.ClashRoyale456.pvPClubDuels.Managers.*;

public final class PvPClubDuels extends JavaPlugin {

    @Override
    public void onEnable() {
        // Config load
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        getCommand("duel").setExecutor(new DuelCommand(new DuelManager()));
        getCommand("leave").setExecutor(new LeaveCommand());
        getCommand("acceptduel").setExecutor(new AcceptduelCommand(new DuelManager()));
        getCommand("editkit").setExecutor(new KitCommand(new KitManager()));
        getCommand("setarena").setExecutor(new SetarenaCommand());
        getLogger().info("The PvP Club duels has been enablade!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("The PvP Club duels has been disabled!");
    }
}
