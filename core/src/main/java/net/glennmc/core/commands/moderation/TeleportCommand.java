package net.glennmc.core.commands.moderation;

import net.glennmc.core.utils.C;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class TeleportCommand implements CommandExecutor {
    // Lets start by creating a constructor for our command.
    private String command;
    private String permission;
    private String module;

    public TeleportCommand(String module, String command, String permission) {
        this.module = module;
        this.command = command;
        this.permission = permission;
    }

    // Now we can create our onCommand method. This is where we will handle the command. We will also add a check to see if the command is correct and if the player has the permission to use the command.
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // Now we can start by checking if the command is correct.
        // We can do this by using the cmd.getName() method.
        // This will return the name of the command that was executed.
        // We can then use the .equalsIgnoreCase() method to check if the command is correct.
        if (cmd.getName().equalsIgnoreCase(command)) {
            // Now we can check if the sender is a player.
            if (sender instanceof Player) {
                // Now we can cast the sender to a player and check if they have the permission, if they don't we can send them a message.
                Player player = (Player) sender;
                if (!player.hasPermission(permission)) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.red + "You do not have permission to use this command.");
                else {
                    // Let's first of all check if the player has entered any arguments, if they haven't or if they have entered more than 2 argument we can send them a message.
                    if (args.length != 1 || args.length != 2 || args == null) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.gray + "Usage: " + C.red + "/teleport <all/here/target> [target]");
                    else {
                        // Let's check if the player has entered the argument "all".
                        String teleportArgument1 = args[0];
                        switch(teleportArgument1) {
                            case "all":
                            case "@a": {
                                if (!player.hasPermission("glennmc.commands.teleport.all")) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.red + "You do not have permission to use this command.");
                                else {
                                    // Now we can loop through all the players on the server and teleport them to the player.
                                    for (Player target : Bukkit.getOnlinePlayers()) {
                                        target.teleport(player);
                                        // Let's also send a message to the players that have been teleported.
                                        target.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.green + "You have been teleported to " + C.darkAqua + player.getName() + C.green + ".");
                                    }
                                    // Let's also send a message to the player that has teleported all the players.
                                    player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.green + "You have teleported all players to you.");
                                }
                            }
                            case "here": {
                                // Permission check for the "here" argument.
                                if (!player.hasPermission("glennmc.commands.teleport.here")) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.red + "You do not have permission to use this command.");
                                else {
                                    // Let's check if the player has entered a target.
                                    if (args.length == 1) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.gray + "Usage: " + C.red + "/teleport here <target>");
                                    else {
                                        // Let's get the target and check if they are online.
                                        String teleportArgument2 = args[1];
                                        Player target = Bukkit.getPlayer(teleportArgument2);
                                        if (target == null) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.red + "That player is not online.");
                                        else {
                                            // Now we can teleport the target to the player.
                                            target.teleport(player);
                                            // Let's also send a message to the player that has been teleported.
                                            target.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.green + "You have been teleported to " + C.darkAqua + player.getName() + C.green + ".");
                                            // Let's also send a message to the player that has teleported the target.
                                            player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.green + "You have teleported " + C.darkAqua + target.getName() + C.green + " to you.");
                                        }
                                    }
                                }
                            }
                            // finally let's do the two player argument teleports
                            default: {
                                Player target = Bukkit.getPlayer(teleportArgument1);
                                if (target == null) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.red + "That player is not online.");
                                else {
                                    // Let's check if the player has entered a second argument.
                                    if (args.length == 1) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.gray + "Usage: " + C.red + "/teleport <target> <target>");
                                    else {
                                        // Let's get the second target and check if they are online.
                                        String teleportArgument2 = args[1];
                                        Player target2 = Bukkit.getPlayer(teleportArgument2);
                                        if (target2 == null) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.red + "That player is not online.");
                                        else {
                                            // Now we can teleport the target to the second target.
                                            target.teleport(target2);
                                            // Let's also send a message to the player that has been teleported.
                                            target.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.green + "You have been teleported to " + C.darkAqua + target2.getName() + C.green + ".");
                                            target2.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.darkAqua + target.getName() + C.green + " has been teleported to you.");
                                            // Let's also send a message to the player that has teleported the target.
                                            player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.green + "You have teleported " + C.darkAqua + target.getName() + C.green + " to " + C.darkAqua + target2.getName() + C.green + ".");
                                        }
                                    }
                                }
                            }
                        }

                    }
                }
             } else sender.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Sorry but this command can only be used by players.");
        }
        return true;
    }
}
