package net.glennmc.core.commands.administration;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.glennmc.core.utils.C;

public class GamemodeCommand implements CommandExecutor {
    // Let's start by building a module for this command
    private String module;
    private String command;
    private String permission;

    // Now let's build a constructor for this command
    public GamemodeCommand(String module, String command, String permission) {
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
                    // If the user hasn't provided arguments we'll cycle them through the gamemodes
                    if (args.length == 0) {
                        switch(player.getGameMode()) {
                            case SURVIVAL:
                                player.setGameMode(GameMode.CREATIVE);
                                player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Creative" + C.gray + ".");
                                break;
                            case CREATIVE:
                                player.setGameMode(GameMode.ADVENTURE);
                                player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Adventure" + C.gray + ".");
                                break;
                            case ADVENTURE:
                                player.setGameMode(GameMode.SPECTATOR);
                                player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Spectator" + C.gray + ".");
                                break;
                            case SPECTATOR:
                                player.setGameMode(GameMode.SURVIVAL);
                                player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Survival" + C.gray + ".");
                                break;
                        }
                    } 
                    // Now let's get to working with arguments and swapping their gamemodes provided with their arguments
                    else if (args.length == 1) {
                        // Let's change the users gamemode depending on the argument provided
                        switch(args[0]) {
                            // If the argument is "survival" or "0" we'll set their gamemode to survival
                            case "survival":
                            case "0":
                                player.setGameMode(GameMode.SURVIVAL);
                                player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Survival" + C.gray + ".");
                                break;
                            // If the argument is "creative" or "1" we'll set their gamemode to creative
                            case "creative":
                            case "1":
                                player.setGameMode(GameMode.CREATIVE);
                                player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Creative" + C.gray + ".");
                                break;
                            // If the argument is "adventure" or "2" we'll set their gamemode to adventure
                            case "adventure":
                            case "2":
                                player.setGameMode(GameMode.ADVENTURE);
                                player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Adventure" + C.gray + ".");
                                break;
                            // If the argument is "spectator" or "3" we'll set their gamemode to spectator
                            case "spectator":
                            case "3":
                                player.setGameMode(GameMode.SPECTATOR);
                                player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Spectator" + C.gray + ".");
                                break;
                            // If the argument is anything else we'll tell the user that the argument is invalid
                            default:
                                // Let's check if the argument is a player
                                Player target = player.getServer().getPlayer(args[0]);
                                // If the argument is a player let's check if they're online
                                if (target != null) {
                                    // If the player is online we'll cycle their gamemode
                                    switch(target.getGameMode()) {
                                        case SURVIVAL:
                                            // If the player is in survival we'll set their gamemode to creative and tell them
                                            // We'll also send a message to the command executor telling them that they've changed the target's gamemode
                                            player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "You have changed " + C.darkAqua + target.getName() + C.gray + "'s gamemode to " + C.darkAqua + "Creative" + C.gray + ".");
                                            target.setGameMode(GameMode.CREATIVE);
                                            target.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Creative" + C.gray + ".");
                                            break;
                                        case CREATIVE:
                                            // If the player is in creative we'll set their gamemode to adventure and tell them
                                            // We'll also send a message to the command executor telling them that they've changed the target's gamemode
                                            player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "You have changed " + C.darkAqua + target.getName() + C.gray + "'s gamemode to " + C.darkAqua + "Adventure" + C.gray + ".");
                                            target.setGameMode(GameMode.ADVENTURE);
                                            target.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Adventure" + C.gray + ".");
                                            break;
                                        case ADVENTURE:
                                            // If the player is in adventure we'll set their gamemode to spectator and tell them
                                            // We'll also send a message to the command executor telling them that they've changed the target's gamemode
                                            player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "You have changed " + C.darkAqua + target.getName() + C.gray + "'s gamemode to " + C.darkAqua + "Spectator" + C.gray + ".");
                                            target.setGameMode(GameMode.SPECTATOR);
                                            target.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Spectator" + C.gray + ".");
                                            break;
                                        case SPECTATOR:
                                            // If the player is in spectator we'll set their gamemode to survival and tell them
                                            // We'll also send a message to the command executor telling them that they've changed the target's gamemode
                                            player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "You have changed " + C.darkAqua + target.getName() + C.gray + "'s gamemode to " + C.darkAqua + "Survival" + C.gray + ".");
                                            target.setGameMode(GameMode.SURVIVAL);
                                            target.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Survival" + C.gray + ".");
                                            break;
                                    }
                                }
                                // otherwise we'll send the user a message saying that the argument is invalid
                                else player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "The argument " + C.darkAqua + args[0] + C.gray + " is invalid!");
                                break;
                        }
                    }
                    else if (args.length == 2) {
                        // Here we'll just repeat the same process as above but with the gamemode being the second argument instead of the first one (if the user has permission to do so)
                        if (player.hasPermission("core.gamemode.others")) {
                            Player target = player.getServer().getPlayer(args[0]);
                            if (target != null) {
                                switch(args[1].toLowerCase()) {
                                    // If the argument is "survival" or "0" we'll set the target's gamemode to survival
                                    case "survival":
                                    case "0":
                                        // We'll also send a message to the command executor telling them that they've changed the target's gamemode
                                        // We'll also send a message to the target telling them that their gamemode has been changed
                                        player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "You have changed " + C.darkAqua + target.getName() + C.gray + "'s gamemode to " + C.darkAqua + "Survival" + C.gray + ".");
                                        target.setGameMode(GameMode.SURVIVAL);
                                        target.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Survival" + C.gray + ".");
                                        break;
                                    // If the argument is "creative" or "1" we'll set the target's gamemode to creative
                                    case "creative":
                                    case "1":
                                        // We'll also send a message to the command executor telling them that they've changed the target's gamemode
                                        // We'll also send a message to the target telling them that their gamemode has been changed
                                        player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "You have changed " + C.darkAqua + target.getName() + C.gray + "'s gamemode to " + C.darkAqua + "Creative" + C.gray + ".");
                                        target.setGameMode(GameMode.CREATIVE);
                                        target.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Creative" + C.gray + ".");
                                        break;
                                    // If the argument is "adventure" or "2" we'll set the target's gamemode to adventure
                                    case "adventure":
                                    case "2":
                                        // We'll also send a message to the command executor telling them that they've changed the target's gamemode
                                        // We'll also send a message to the target telling them that their gamemode has been changed
                                        player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "You have changed " + C.darkAqua + target.getName() + C.gray + "'s gamemode to " + C.darkAqua + "Adventure" + C.gray + ".");
                                        target.setGameMode(GameMode.ADVENTURE);
                                        target.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Adventure" + C.gray + ".");
                                        break;
                                    // If the argument is "spectator" or "3" we'll set the target's gamemode to spectator
                                    case "spectator":
                                    case "3":
                                        // We'll also send a message to the command executor telling them that they've changed the target's gamemode
                                        // We'll also send a message to the target telling them that their gamemode has been changed
                                        player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "You have changed " + C.darkAqua + target.getName() + C.gray + "'s gamemode to " + C.darkAqua + "Spectator" + C.gray + ".");
                                        target.setGameMode(GameMode.SPECTATOR);
                                        target.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Your gamemode has been set to " + C.darkAqua + "Spectator" + C.gray + ".");
                                        break;
                                    default:
                                        // If the argument is invalid we'll send the user a message saying that the argument is invalid
                                        player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "The argument " + C.darkAqua + args[1] + C.gray + " is invalid!");
                                        break;
                                }
                                // If the target is null we'll send the user a message saying that the target is offline
                            } else player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "The player " + C.darkAqua + args[0] + C.gray + " is not online!");
                        }
                    } else player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Usage: " + C.darkAqua + "/gm <gamemode> [player]");
                }
            }
        }
        return true;
    }
}
