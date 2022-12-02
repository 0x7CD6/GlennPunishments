package net.glennmc.core.events;

import java.util.Arrays;
import java.util.List;

import net.glennmc.core.Core;
import net.glennmc.core.utils.C;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ReportScreen implements Listener {

	public Core main;
	public String module;
	
	public ReportScreen(String module, Core passed) {
		this.main = passed;
		this.module = module;
	}

	public void openReportScreen(Player player, String _target) {
		Inventory ReportInventory = Bukkit.createInventory(player, 9, "Report " + _target);
		List<String> Lore1 = Arrays.asList(new String[] { C.red + this.main.getConfig().getString("ReportLores.Button1") });
		List<String> Lore2 = Arrays.asList(new String[] { C.red + this.main.getConfig().getString("ReportLores.Button2") });
		List<String> Lore3 = Arrays.asList(new String[] { C.red + this.main.getConfig().getString("ReportLores.Button3") });
		List<String> Lore4 = Arrays.asList(new String[] { C.red + this.main.getConfig().getString("ReportLores.Button4") });
		List<String> Lore5 = Arrays.asList(new String[] { C.red + this.main.getConfig().getString("ReportLores.Button5") });
		List<String> Lore6 = Arrays.asList(new String[] { C.red + this.main.getConfig().getString("ReportLores.Button6") });
		List<String> Lore7 = Arrays.asList(new String[] { C.red + this.main.getConfig().getString("ReportLores.Button7") });
		List<String> Lore8 = Arrays.asList(new String[] { C.red + this.main.getConfig().getString("ReportLores.Button8") });
		List<String> Lore9 = Arrays.asList(new String[] { C.red + this.main.getConfig().getString("ReportLores.Button9") });
		ItemStack Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9;
		ItemMeta Meta1 = (Item1 = new ItemStack(Material.IRON_SWORD)).getItemMeta();
		ItemMeta Meta2 = (Item2 = new ItemStack(Material.PAPER)).getItemMeta();
		ItemMeta Meta3 = (Item3 = new ItemStack(Material.ANVIL)).getItemMeta();
		ItemMeta Meta4 = (Item4 = new ItemStack(Material.REDSTONE_BLOCK)).getItemMeta();
		ItemMeta Meta5 = (Item5 = new ItemStack(Material.TNT)).getItemMeta();
		ItemMeta Meta6 = (Item6 = new ItemStack(Material.DIAMOND_AXE)).getItemMeta();
		ItemMeta Meta7 = (Item7 = new ItemStack(Material.BEDROCK)).getItemMeta();
		ItemMeta Meta8 = (Item8 = new ItemStack(Material.COMMAND)).getItemMeta();
		ItemMeta Meta9 = (Item9 = new ItemStack(Material.BOOK)).getItemMeta();
		Meta1.setDisplayName(C.white + C.italic + this.main.getConfig().getString("Reports.Button1"));
		Meta1.setLore(Lore1);
		Item1.setItemMeta(Meta1);
		Meta2.setDisplayName(C.white + C.italic + this.main.getConfig().getString("Reports.Button2"));
		Meta2.setLore(Lore2);
		Item2.setItemMeta(Meta2);
		Meta3.setDisplayName(C.white + C.italic + this.main.getConfig().getString("Reports.Button3"));
		Meta3.setLore(Lore3);
		Item3.setItemMeta(Meta3);
		Meta4.setDisplayName(C.white + C.italic + this.main.getConfig().getString("Reports.Button4"));
		Meta4.setLore(Lore4);
		Item4.setItemMeta(Meta4);
		Meta5.setDisplayName(C.white + C.italic + this.main.getConfig().getString("Reports.Button5"));
		Meta5.setLore(Lore5);
		Item5.setItemMeta(Meta5);
		Meta6.setDisplayName(C.white + C.italic + this.main.getConfig().getString("Reports.Button6"));
		Meta6.setLore(Lore6);
		Item6.setItemMeta(Meta6);
		Meta7.setDisplayName(C.white + C.italic + this.main.getConfig().getString("Reports.Button7"));
		Meta7.setLore(Lore7);
		Item7.setItemMeta(Meta7);
		Meta8.setDisplayName(C.white + C.italic + this.main.getConfig().getString("Reports.Button8"));
		Meta8.setLore(Lore8);
		Item8.setItemMeta(Meta8);
		Meta9.setDisplayName(C.white + C.italic + this.main.getConfig().getString("Reports.Button9"));
		Meta9.setLore(Lore9);
		Item9.setItemMeta(Meta9);
		ReportInventory.setItem(0, Item1);
		ReportInventory.setItem(1, Item2);
		ReportInventory.setItem(2, Item3);
		ReportInventory.setItem(3, Item4);
		ReportInventory.setItem(4, Item5);
		ReportInventory.setItem(5, Item6);
		ReportInventory.setItem(6, Item7);
		ReportInventory.setItem(7, Item8);
		ReportInventory.setItem(8, Item9);
		player.openInventory(ReportInventory);
	}
	
	@EventHandler
	private void onScreenClick(InventoryClickEvent event) {
		Player player = (Player)event.getWhoClicked();
		if (!event.getInventory().getName().startsWith("Report ")) return;
		if (event.getCurrentItem() == null) return;
		String targetOther = event.getInventory().getName().replace("Report ", "");
		ItemStack ClickedButton = event.getCurrentItem();

		switch(ClickedButton.getType()) {
			case AIR:
				return;
			case IRON_SWORD:
				player.closeInventory();
				Bukkit.getOnlinePlayers().forEach(player1 -> {
					if (player1.hasPermission("glennmc.staff.punishmentbroadcast")) player1.sendMessage(C.red + C.bold + "REPORT" + C.gray + " | " + C.white + player.getName() + C.gray + " has reported " + C.white + targetOther + C.gray + " for " + C.white + "Hacking");
				});
				player.sendMessage(C.red + "You have reported " + targetOther + " for " + C.white + C.italic + this.main.getConfig().getString("Reports.Button1"));
				return;
			case PAPER: 
				player.closeInventory();
				Bukkit.getOnlinePlayers().forEach(player1 -> {
					if (player1.hasPermission("glennmc.staff.punishmentbroadcast")) player1.sendMessage(C.red + C.bold + "REPORT" + C.gray + " | " + C.white + player.getName() + C.gray + " has reported " + C.white + targetOther + C.gray + " for " + C.white + "Advertising");
				});
				player.sendMessage(C.red + "You have reported " + targetOther + " for " + C.white + C.italic + this.main.getConfig().getString("Reports.Button2"));
				return;
			case ANVIL: 
				player.closeInventory();
				Bukkit.getOnlinePlayers().forEach(player1 -> {
					if (player1.hasPermission("glennmc.staff.punishmentbroadcast")) player1.sendMessage(C.red + C.bold + "REPORT" + C.gray + " | " + C.white + player.getName() + C.gray + " has reported " + C.white + targetOther + C.gray + " for " + C.white + "Scamming");
				});
				player.sendMessage(C.red + "You have reported " + targetOther + " for " + C.white + C.italic + this.main.getConfig().getString("Reports.Button3"));
				return;
			case REDSTONE_BLOCK: 
				player.closeInventory();
				Bukkit.getOnlinePlayers().forEach(player1 -> {
					if (player1.hasPermission("glennmc.staff.punishmentbroadcast")) player1.sendMessage(C.red + C.bold + "REPORT" + C.gray + " | " + C.white + player.getName() + C.gray + " has reported " + C.white + targetOther + C.gray + " for " + C.white + "Exploiting");
				});
				player.sendMessage(C.red + "You have reported " + targetOther + " for " + C.white + C.italic + this.main.getConfig().getString("Reports.Button4"));
				return;
			case TNT: 
				player.closeInventory();
				Bukkit.getOnlinePlayers().forEach(player1 -> {
					if (player1.hasPermission("glennmc.staff.punishmentbroadcast")) player1.sendMessage(C.red + C.bold + "REPORT" + C.gray + " | " + C.white + player.getName() + C.gray + " has reported " + C.white + targetOther + C.gray + " for " + C.white + "Griefing");
				});
				player.sendMessage(C.red + "You have reported " + targetOther + " for " + C.white + C.italic + this.main.getConfig().getString("Reports.Button5"));
				return;
			case DIAMOND_AXE: 
				player.closeInventory();
				Bukkit.getOnlinePlayers().forEach(player1 -> {
					if (player1.hasPermission("glennmc.staff.punishmentbroadcast")) player1.sendMessage(C.red + C.bold + "REPORT" + C.gray + " | " + C.white + player.getName() + C.gray + " has reported " + C.white + targetOther + C.gray + " for " + C.white + "Staff Impersonation");
				});
				player.sendMessage(C.red + "You have reported " + targetOther + " for " + C.white + C.italic + this.main.getConfig().getString("Reports.Button6"));
				return;
			case BEDROCK: 
				player.closeInventory();
				Bukkit.getOnlinePlayers().forEach(player1 -> {
					if (player1.hasPermission("glennmc.staff.punishmentbroadcast")) player1.sendMessage(C.red + C.bold + "REPORT" + C.gray + " | " + C.white + player.getName() + C.gray + " has reported " + C.white + targetOther + C.gray + " for " + C.white + "Staff Disrespect");
				});
				player.sendMessage(C.red + "You have reported " + targetOther + " for " + C.white + C.italic + this.main.getConfig().getString("Reports.Button7"));
				return;
			case COMMAND: 
				player.closeInventory();
				Bukkit.getOnlinePlayers().forEach(player1 -> {
					if (player1.hasPermission("glennmc.staff.punishmentbroadcast")) player1.sendMessage(C.red + C.bold + "REPORT" + C.gray + " | " + C.white + player.getName() + C.gray + " has reported " + C.white + targetOther + C.gray + " for " + C.white + "Staff Abuse");
				});
				player.sendMessage(C.red + "You have reported " + targetOther + " for " + C.white + C.italic + this.main.getConfig().getString("Reports.Button8"));
				return;
			case BOOK: 
				player.closeInventory();
				Bukkit.getOnlinePlayers().forEach(player1 -> {
					if (player1.hasPermission("glennmc.staff.punishmentbroadcast")) player1.sendMessage(C.red + C.bold + "REPORT" + C.gray + " | " + C.white + player.getName() + C.gray + " has reported " + C.white + targetOther + C.gray + " for " + C.white + "Staff Inactivity");
				});
				player.sendMessage(C.red + "You have reported " + targetOther + " for " + C.white + C.italic + this.main.getConfig().getString("Reports.Button9"));
				return;
			default:
				break;
		}
		return;
	}
}
