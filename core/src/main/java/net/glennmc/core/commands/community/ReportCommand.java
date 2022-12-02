package net.glennmc.core.commands.community;

import net.glennmc.core.events.ReportScreen;
import net.glennmc.core.utils.C;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReportCommand implements CommandExecutor {
	
	// Let's make a constructor for this class.
	// This will allow us to pass in the ReportScreen class, the command, the permission, and the module.
	// This will allow us to use the same class for multiple commands.
	private ReportScreen reportScreen;
	private String command;
	private String permission;
	private String module;

	public ReportCommand(String module, String command, String permission, ReportScreen reportScreen) {
		this.reportScreen = reportScreen;
		this.module = module;
		this.command = command;
		this.permission = permission;
	}

	// Let's start building the command now.
	public final boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// Let's make sure the command is the one we want.
		if (cmd.getName().equalsIgnoreCase(command)) {
			// Let's make sure the sender is a player. If not, we'll send a message to the console.
			if (sender instanceof Player) {
				Player player = (Player)sender;
				// Let's make sure the player has the permission to use this command.
				if (!player.hasPermission(permission)) player.sendMessage(C.darkAqua + C.bold + module + C.gray + " » " + C.red + "You do not have permission to use this command.");
				else {
					// Let's check if args isn't null or empty.
					if (args.length != 1 || args == null) player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Usage: " + C.red + "/report <user>");
					else {
						// Let's make sure they're not reporting themselves.
						if (player.getName().equalsIgnoreCase(args[0])) player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "You can't report yourself!");
						else {
							// Let's now check the player they're trying to report is online.
							if (Bukkit.getPlayer(args[0]) == null) player.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "That player is not online!");
							// Let's now open the report screen. We'll pass in the player and the player they're reporting.
							else reportScreen.openReportScreen(player, Bukkit.getPlayer(args[0]).getName());							
						}
					}
				}
			// Let's send a message to the console saying that this command can only be used by players.
			} else sender.sendMessage(C.darkAqua + C.bold + module + " " + C.gray + C.bold + ">> " + C.gray + "Sorry but this command can only be used by players.");
			
		}
		return true;
	}
}
