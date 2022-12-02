package net.glennmc.core.events;

import net.glennmc.core.utils.C;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.*;

public class TabComplete implements Listener {

    @EventHandler
    public void onTabCompleteEvent(PlayerChatTabCompleteEvent event) {
        Player player = (Player)event.getPlayer();
        String message = event.getChatMessage().split(" ").toString();


        final Collection community = Arrays.asList("/help", "/report");
        final Collection mod = Arrays.asList("/help", "/report", "/punish", "/vanish", "/sc");
        final Collection admin = Arrays.asList("/help", "report", "/punish", "/vanish", "/sc", "/gm", "/fly");
        final Collection dev = Arrays.asList("/help", "/report", "/punish", "/vanish", "/sc", "/gm", "/fly");


        // Let's check the message actually starts with a slash.
        if (message.startsWith("/")) {
            // Let's check if the player has the permission to see the moderator commands.
            if (player.hasPermission("glennmc.staff.mod")) {
                event.getTabCompletions().clear();
                event.getTabCompletions().addAll(mod);
            // Let's check if the player has the permission to see the admin commands.
            } else if (player.hasPermission("glennmc.staff.admin")) {
                event.getTabCompletions().clear();
                event.getTabCompletions().addAll(admin);
            // Let's check if the player has the permission to see the developer commands.
            } else if (player.hasPermission("glennmc.staff.developer")) {
                event.getTabCompletions().clear();
                event.getTabCompletions().addAll(dev);
            } else if (player.hasPermission("glennmc.staff.owner") || player.hasPermission("*")) {
                // idk why this is blank okay dont question me, this code was a mess to write and i dont want to touch it again
                // it was from 3 years ago and i dont want to touch it again. [May 2020]
            } else {
                // If the player doesn't have any of the permissions, we'll just send them the community commands.
                event.getTabCompletions().clear();
                event.getTabCompletions().addAll(community);
            }
        }
    }

    @EventHandler
    public void onTabCompleteEvent(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();
        String[] message = event.getMessage().split(" ");
        List<String> plugins = new ArrayList<>();
        // I guess this is a way to block commands that are not wanted to be used by the developers to prevent any issues with the server community.
        plugins.add("pl");
        plugins.add("plugins");
        plugins.add("ver");
        plugins.add("version");
        plugins.add("about");
        plugins.add("?");
        plugins.add("bukkit:?");
        plugins.add("bukkit:about");
        plugins.add("bukkit:help");
        plugins.add("bukkit:pl");
        plugins.add("bukkit:plugins");
        plugins.add("bukkit:ver");
        plugins.add("bukkit:version");

        // Let's check if the player has the permission to see the developer commands.
        if (!player.hasPermission("glennmc.tab.admin")) {
            // We loop through the plugins list and check if the message contains any of the plugins.
            for (String loop : plugins) {
                if (message[0].equalsIgnoreCase("/" + loop)) {
                    // If the message contains any of the plugins, we'll cancel the event and send the player a message.
                    player.sendMessage(C.darkAqua + C.bold + "GlennMC" + C.gray + " » " + C.red + "You do not have permission to use this command.");
                    event.setCancelled(true);
                }
            }
        }
    }
}
