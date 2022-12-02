package net.glennmc.core.commands.administration;

import net.glennmc.core.Core;
import net.glennmc.core.utils.C;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReloadCommand implements CommandExecutor {

    // Lets start by creating a constructor for our command.

    private String command;
    private String permission;
    private String module;

    public ReloadCommand(String module, String command, String permission) {
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
                Player player = (Player) sender;
                // Now we can cast the sender to a player and check if they have the permission, if they don't we can send them a message.
				if (!player.hasPermission(permission)) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.red + "You do not have permission to use this command.");
                else {
                    // Now we reload the plugins config and send the player a nice little message :)
                    Core.getInstance().reloadConfig();
                    player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "The config has been reloaded!");
                }
                // Let's check if the sender is the console.
            } else if (sender instanceof org.bukkit.command.ConsoleCommandSender) {
                // Let's allow the console to run this command too.
                Core.getInstance().reloadConfig();
                sender.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "The config has been reloaded!");
                // Let's add a warning though so the console knows that this command is not recommended to be run by the console.
                sender.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "This command is not recommended to be run by the console!");
            }
        }
        return false;
    }

    

}
