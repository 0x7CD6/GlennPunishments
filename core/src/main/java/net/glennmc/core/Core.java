package net.glennmc.core;

import net.glennmc.core.commands.administration.FlyCommand;
import net.glennmc.core.commands.administration.GamemodeCommand;
import net.glennmc.core.commands.administration.ReloadCommand;
import net.glennmc.core.commands.community.ReportCommand;
import net.glennmc.core.commands.moderation.PunishCommand;
import net.glennmc.core.commands.moderation.TeleportCommand;
import net.glennmc.core.events.*;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Core extends JavaPlugin {

    public String noAccessMessage = getConfig().getString("Messages.NoAccess");
    public String invalidUsageMessage = getConfig().getString("Messages.InvalidUsage");
    public String invalidUsageMessageReport = getConfig().getString("Messages.InvalidUsageReport");
    public String reloadMessage = getConfig().getString("Messages.ReloadMessage");
    public String notStaffxD = getConfig().getString("Messages.NotStaff");
    public String PluginPrefix = getConfig().getString("Prefix");
    public String PluginPrefixReport = getConfig().getString("PrefixReport");
    public FileConfiguration config;
    File cfile;

    public void onEnable() {
        getLogger().info("GlennCore >> Loading...");
        this.config = getConfig();
        this.config.options().copyDefaults(true);
        saveConfig();
        this.cfile = new File(getDataFolder(), "config.yml");
        getLogger().info("GlennPunishments >> Config loaded...");
        onCommand(); // Load commands in.
        onEvent(); // Load events in.
        getLogger().info("GlennPunishments >> PLUGIN READY!");
        // Initalize the instance
        instance = this;
    }

    public void onDisable() {
        getLogger().info("GlennPunishments >> Plugin disabled.");
    }

    // Let's make a public instance of the main class. 
    // This will be used to access the main class from other classes.
    private static Core instance;

    // Let's make a getter for the instance.
    public static Core getInstance() {
        return instance;
    }

    // Instead of all one function, split it off so it's easier to read and add.
    public void onCommand() {

        try {
            getLogger().info("GlennPunishments >> Commands loading...");
            getCommand("gpreload").setExecutor(new ReloadCommand("Reload", "gpreload", "glennmc.commands.reload"));
            getCommand("punish").setExecutor(new PunishCommand("Punish", "punish", "glennmc.commands.punish"));
            getCommand("report").setExecutor(new ReportCommand("Report", "report", "glennmc.commands.report", new ReportScreen("Reports", this)));
            getCommand("gamemode").setExecutor(new GamemodeCommand("Gamemode", "gm", "glennmc.commands.gamemode"));
            getCommand("fly").setExecutor(new FlyCommand("Flight", "fly", "glennmc.commands.flight"));
            getCommand("teleport").setExecutor(new TeleportCommand("Teleport", "teleport", "glennmc.commands.teleport"));
            getLogger().info("GlennPunishments >> Commands loaded...");
        } catch (Exception e) {
            getLogger().info("GlennPunishments >> Commands failed to load.");
        }
    }

    public void onEvent() {
        try {
            getLogger().info("GlennPunishments >> Events loading...");
            Bukkit.getPluginManager().registerEvents(new PunishmentScreen("Punish"), this);
            Bukkit.getPluginManager().registerEvents(new ReportScreen("Reports",this), this);
            Bukkit.getPluginManager().registerEvents(new TabComplete(), this);
            getLogger().info("GlennPunishments >> Events loaded.");
        } catch (Exception e) {
            getLogger().info("GlennPunishments >> Events failed to load.");
        }
    }
}
