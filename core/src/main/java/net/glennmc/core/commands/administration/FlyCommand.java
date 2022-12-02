package net.glennmc.core.commands.administration;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.glennmc.core.utils.C;

public class FlyCommand implements CommandExecutor {
    // Let's start by building a module for this command
    private String module;
    private String command;
    private String permission;

    public FlyCommand(String module, String command, String permission) {
        this.module = module;
        this.command = command;
        this.permission = permission;
    }

    // Now let's build the command itself
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase(command)) {
            if (sender instanceof Player) {
                // Now let's check if the player has the permission
				if (!player.hasPermission(permission)) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.red + "You do not have permission to use this command.");
                else {
                    // Let's have a switch event for the flight toggle
                    switch(player.getGameMode()) {
                        // Here we just have a simple check to see if the player is in creative or spectator mode and if they are, we'll just send them a message
                        case CREATIVE: case SPECTATOR:
                            player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Flight mode can't be toggled when in Creative or Spectator mode.");
                            break;
                        // If the player is in any other mode, we'll just toggle their flight mode.
                        default: {
                            String flight = player.getAllowFlight() ? "disabled" : "enabled";
                            switch(flight) {
                                // If the player's flight is disabled, we'll just enable it and send them a message
                                case "disabled":
                                    player.setAllowFlight(true);
                                    player.setFlying(true);
                                    player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Flight has been " + flight + ".");
                                    break;
                                // If the player's flight is enabled, we'll just disable it and send them a message
                                case "enabled":
                                    player.setAllowFlight(false);
                                    player.setFlying(false);
                                    player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Flight has been " + flight + ".");
                                    break;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
