package net.glennmc.core.commands.moderation;

import net.glennmc.core.events.PunishmentScreen;
import net.glennmc.core.utils.C;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PunishCommand implements CommandExecutor {

	// Let's make a constructor for this class.
	// This will be used to set the command, permission and module.
	// We will also use this to register the command.
	private String command;
	private String permission;
	private String module;

	public PunishCommand(String module, String command, String permission) {
		this.module = module;
		this.command = command;
		this.permission = permission;
	}

	// Let's start building the command now.
	public final boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// Let's make sure the command is the one we want.
		if (cmd.getName().equalsIgnoreCase(command)) {
			// Let's check the player is a player. If not, we'll send a message to the console.
			if (sender instanceof Player) {
				// Let's check the player has the permission to use the command.
				Player player = (Player) sender;
				if (!player.hasPermission(permission)) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.red + "You do not have permission to use this command.");
				else {
					// Let's check if args isn't null or empty.
					if (args.length != 1 || args == null) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.red + "Please specify a player to punish.");
					else {
						// Let's prevent the player from punishing themselves otherwise that would be silly and suck for them.
						if (player.getName().equalsIgnoreCase(args[0])) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.red + "You cannot punish yourself.");
						else {
							// Let's check if the target they're trying to punish is an operator (even if they're offline)			
							if (player.getServer().getOfflinePlayer(args[0]).isOp()) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.red + "You cannot punish an operator.");
							else PunishmentScreen.openScreen(player, args[0]);
						}
						
					}
				}
			// Let's send a messagee to console due to them not being a player.
			} else sender.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Sorry but this command can only be used by players.");
		}
		return true;
	}
}
