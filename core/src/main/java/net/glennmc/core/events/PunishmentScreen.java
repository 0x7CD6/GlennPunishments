package net.glennmc.core.events;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.glennmc.core.Core;

public class PunishmentScreen implements Listener {
	
	// Holy fuck I do not want to clean this up right now.
	// I'll do it later.
	// I'm just going to leave it here for now.
	// I'll clean it up later.
	// I promise.
	// I'll clean it up later.
	// I promise.

	static Core core = Core.getInstance();
	public String module;

	public PunishmentScreen(String module) {
		this.module = module;
	}

	public static void openScreen(Player player, String target) {
		Inventory PlayerInventory = Bukkit.createInventory(null, 27, core.getConfig().getString("Messages.GUItitle").replace("%player%", target));
		List<String> B1L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button1") });
		List<String> B2L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button2") });
		List<String> B3L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button3") });
		List<String> B4L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button4") });
		List<String> B5L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button5") });
		List<String> B6L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button6") });
		List<String> B7L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button7") });
		List<String> B8L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button8") });
		List<String> B9L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button9") });
		List<String> B10L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button10") });
		List<String> B11L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button11") });
		List<String> B12L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button12") });
		List<String> B13L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button13") });
		List<String> B14L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button14") });
		List<String> B15L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button15") });
		List<String> B16L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button16") });
		List<String> B17L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban", core.getConfig().getString("PunishmentTimes.Button17") });
		List<String> B18L = Arrays.asList(new String[] { ChatColor.GOLD + "Perm Ban", core.getConfig().getString("PunishmentTimes.Button18") });
		List<String> B19L = Arrays.asList(new String[] { ChatColor.GOLD + "Kick", core.getConfig().getString("PunishmentTimes.Button19") });
		List<String> B20L = Arrays.asList(new String[] { ChatColor.GOLD + "Kick", core.getConfig().getString("PunishmentTimes.Button20") });
		List<String> B21L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Mute", core.getConfig().getString("PunishmentTimes.Button21") });
		List<String> B22L = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Mute", core.getConfig().getString("PunishmentTimes.Button22") });
		List<String> B23L = Arrays.asList(new String[] { ChatColor.GOLD + "Unused", core.getConfig().getString("PunishmentTimes.Button23") });
		List<String> B24L = Arrays.asList(new String[] { ChatColor.GOLD + "Unused", core.getConfig().getString("PunishmentTimes.Button24") });
		List<String> B25L = Arrays.asList(new String[] { ChatColor.GOLD + "Unused", core.getConfig().getString("PunishmentTimes.Button25") });
		List<String> B26L = Arrays.asList(new String[] { ChatColor.GOLD + "Perm IP Mute", core.getConfig().getString("PunishmentTimes.Button26") });
		List<String> B27L = Arrays.asList(new String[] { ChatColor.GOLD + "Perm IP Ban", core.getConfig().getString("PunishmentTimes.Button27") });
		ItemStack B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,B26,B27;
		ItemMeta B1Meta = (B1 = new ItemStack(Material.DIAMOND)).getItemMeta();
		ItemMeta B2Meta = (B2 = new ItemStack(Material.FEATHER)).getItemMeta();
		ItemMeta B3Meta = (B3 = new ItemStack(Material.BOW)).getItemMeta();
		ItemMeta B4Meta = (B4 = new ItemStack(Material.IRON_SWORD)).getItemMeta();
		ItemMeta B5Meta = (B5 = new ItemStack(Material.GLASS)).getItemMeta();
		ItemMeta B6Meta = (B6 = new ItemStack(Material.BOOK)).getItemMeta();
		ItemMeta B7Meta = (B7 = new ItemStack(Material.TNT)).getItemMeta();
		ItemMeta B8Meta = (B8 = new ItemStack(Material.SKULL_ITEM)).getItemMeta();
		ItemMeta B9Meta = (B9 = new ItemStack(Material.BOOK_AND_QUILL)).getItemMeta();
		ItemMeta B10Meta = (B10 = new ItemStack(Material.COAL_ORE)).getItemMeta();
		ItemMeta B11Meta = (B11 = new ItemStack(Material.IRON_ORE)).getItemMeta();
		ItemMeta B12Meta = (B12 = new ItemStack(Material.GOLD_ORE)).getItemMeta();
		ItemMeta B13Meta = (B13 = new ItemStack(Material.DIAMOND_ORE)).getItemMeta();
		ItemMeta B14Meta = (B14 = new ItemStack(Material.EMERALD_ORE)).getItemMeta();
		ItemMeta B15Meta = (B15 = new ItemStack(Material.REDSTONE_ORE)).getItemMeta();
		ItemMeta B16Meta = (B16 = new ItemStack(Material.LOG)).getItemMeta();
		ItemMeta B17Meta = (B17 = new ItemStack(Material.STONE_SLAB2)).getItemMeta();
		ItemMeta B18Meta = (B18 = new ItemStack(Material.BEDROCK)).getItemMeta();
		ItemMeta B19Meta = (B19 = new ItemStack(Material.SKULL_ITEM, 4)).getItemMeta();
		ItemMeta B20Meta = (B20 = new ItemStack(Material.GOLD_NUGGET)).getItemMeta();
		ItemMeta B21Meta = (B21 = new ItemStack(Material.PAPER)).getItemMeta();
		ItemMeta B22Meta = (B22 = new ItemStack(Material.WRITTEN_BOOK)).getItemMeta();
		ItemMeta B23Meta = (B23 = new ItemStack(Material.ANVIL)).getItemMeta();
		ItemMeta B24Meta = (B24 = new ItemStack(Material.ANVIL)).getItemMeta();
		ItemMeta B25Meta = (B25 = new ItemStack(Material.ANVIL)).getItemMeta();
		ItemMeta B26Meta = (B26 = new ItemStack(Material.REDSTONE_BLOCK)).getItemMeta();
		ItemMeta B27Meta = (B27 = new ItemStack(Material.BARRIER)).getItemMeta();
		String BName1 = core.getConfig().getString("Names.Button1");
		String BName2 = core.getConfig().getString("Names.Button2");
		String BName3 = core.getConfig().getString("Names.Button3");
		String BName4 = core.getConfig().getString("Names.Button4");
		String BName5 = core.getConfig().getString("Names.Button5");
		String BName6 = core.getConfig().getString("Names.Button6");
		String BName7 = core.getConfig().getString("Names.Button7");
		String BName8 = core.getConfig().getString("Names.Button8");
		String BName9 = core.getConfig().getString("Names.Button9");
		String BName10 = core.getConfig().getString("Names.Button10");
		String BName11 = core.getConfig().getString("Names.Button11");
		String BName12 = core.getConfig().getString("Names.Button12");
		String BName13 = core.getConfig().getString("Names.Button13");
		String BName14 = core.getConfig().getString("Names.Button14");
		String BName15 = core.getConfig().getString("Names.Button15");
		String BName16 = core.getConfig().getString("Names.Button16");
		String BName17 = core.getConfig().getString("Names.Button17");
		String BName18 = core.getConfig().getString("Names.Button18");
		String BName19 = core.getConfig().getString("Names.Button19");
		String BName20 = core.getConfig().getString("Names.Button20");
		String BName21 = core.getConfig().getString("Names.Button21");
		String BName22 = core.getConfig().getString("Names.Button22");
		String BName23 = core.getConfig().getString("Names.Button23");
		String BName24 = core.getConfig().getString("Names.Button24");
		String BName25 = core.getConfig().getString("Names.Button25");
		String BName26 = core.getConfig().getString("Names.Button26");
		String BName27 = core.getConfig().getString("Names.Button27");
		B1Meta.setDisplayName(ChatColor.GREEN + BName1);
		B1Meta.setLore(B1L);
		B1.setItemMeta(B1Meta);
		B2Meta.setDisplayName(ChatColor.GREEN + BName2);
		B2Meta.setLore(B2L);
		B2.setItemMeta(B2Meta);
		B3Meta.setDisplayName(ChatColor.GREEN + BName3);
		B3Meta.setLore(B3L);
		B3.setItemMeta(B3Meta);
		B4Meta.setDisplayName(ChatColor.GREEN + BName4);
		B4Meta.setLore(B4L);
		B4.setItemMeta(B4Meta);
		B5Meta.setDisplayName(ChatColor.GREEN + BName5);
		B5Meta.setLore(B5L);
		B5.setItemMeta(B5Meta);
		B6Meta.setDisplayName(ChatColor.GREEN + BName6);
		B6Meta.setLore(B6L);
		B6.setItemMeta(B6Meta);
		B7Meta.setDisplayName(ChatColor.GREEN + BName7);
		B7Meta.setLore(B7L);
		B7.setItemMeta(B7Meta);
		B8Meta.setDisplayName(ChatColor.GREEN + BName8);
		B8Meta.setLore(B8L);
		B8.setItemMeta(B8Meta);
		B9Meta.setDisplayName(ChatColor.GREEN + BName9);
		B9Meta.setLore(B9L);
		B9.setItemMeta(B9Meta);
		B10Meta.setDisplayName(ChatColor.GREEN + BName10);
		B10Meta.setLore(B10L);
		B10.setItemMeta(B10Meta);
		B11Meta.setDisplayName(ChatColor.GREEN + BName11);
		B11Meta.setLore(B11L);
		B11.setItemMeta(B11Meta);
		B12Meta.setDisplayName(ChatColor.GREEN + BName12);
		B12Meta.setLore(B12L);
		B12.setItemMeta(B12Meta);
		B13Meta.setDisplayName(ChatColor.GREEN + BName13);
		B13Meta.setLore(B13L);
		B13.setItemMeta(B13Meta);
		B14Meta.setDisplayName(ChatColor.GREEN + BName14);
		B14Meta.setLore(B14L);
		B14.setItemMeta(B14Meta);
		B15Meta.setDisplayName(ChatColor.GREEN + BName15);
		B15Meta.setLore(B15L);
		B15.setItemMeta(B15Meta);
		B16Meta.setDisplayName(ChatColor.GREEN + BName16);
		B16Meta.setLore(B16L);
		B16.setItemMeta(B16Meta);
		B17Meta.setDisplayName(ChatColor.GREEN + BName17);
		B17Meta.setLore(B17L);
		B17.setItemMeta(B17Meta);
		B18Meta.setDisplayName(ChatColor.GREEN + BName18);
		B18Meta.setLore(B18L);
		B18.setItemMeta(B18Meta);
		B19Meta.setDisplayName(ChatColor.GREEN + BName19);
		B19Meta.setLore(B19L);
		B19.setItemMeta(B19Meta);
		B20Meta.setDisplayName(ChatColor.GREEN + BName20);
		B20Meta.setLore(B20L);
		B20.setItemMeta(B20Meta);
		B21Meta.setDisplayName(ChatColor.GREEN + BName21);
		B21Meta.setLore(B21L);
		B21.setItemMeta(B21Meta);
		B22Meta.setDisplayName(ChatColor.GREEN + BName22);
		B22Meta.setLore(B22L);
		B22.setItemMeta(B22Meta);
		B23Meta.setDisplayName(ChatColor.GREEN + BName23);
		B23Meta.setLore(B23L);
		B23.setItemMeta(B23Meta);
		B24Meta.setDisplayName(ChatColor.GREEN + BName24);
		B24Meta.setLore(B24L);
		B24.setItemMeta(B24Meta);
		B25Meta.setDisplayName(ChatColor.GREEN + BName25);
		B25Meta.setLore(B25L);
		B25.setItemMeta(B25Meta);
		B26Meta.setDisplayName(ChatColor.GREEN + BName26);
		B26Meta.setLore(B26L);
		B26.setItemMeta(B26Meta);
		B27Meta.setDisplayName(ChatColor.GREEN + BName27);
		B27Meta.setLore(B27L);
		B27.setItemMeta(B27Meta);
		PlayerInventory.setItem(0, B1);
		PlayerInventory.setItem(1, B2);
		PlayerInventory.setItem(2, B3);
		PlayerInventory.setItem(3, B4);
		PlayerInventory.setItem(4, B5);
		PlayerInventory.setItem(5, B6);
		PlayerInventory.setItem(6, B7);
		PlayerInventory.setItem(7, B8);
		PlayerInventory.setItem(8, B9);
		PlayerInventory.setItem(9, B10);
		PlayerInventory.setItem(10, B11);
		PlayerInventory.setItem(11, B12);
		PlayerInventory.setItem(12, B13);
		PlayerInventory.setItem(13, B14);
		PlayerInventory.setItem(14, B15);
		PlayerInventory.setItem(15, B16);
		PlayerInventory.setItem(16, B17);
		PlayerInventory.setItem(17, B18);
		PlayerInventory.setItem(18, B19);
		PlayerInventory.setItem(19, B20);
		PlayerInventory.setItem(20, B21);
		PlayerInventory.setItem(21, B22);
		PlayerInventory.setItem(22, B23);
		PlayerInventory.setItem(23, B24);
		PlayerInventory.setItem(24, B25);
		PlayerInventory.setItem(25, B26);
		PlayerInventory.setItem(26, B27);
		player.openInventory(PlayerInventory);
	}
	
	@EventHandler
	private void onScreenClick(InventoryClickEvent event) {
		Player player = (Player)event.getWhoClicked();
		if (!event.getInventory().getName().startsWith("Punish ")) return;
		if (event.getCurrentItem() == null) return;
		String _targetPlayer = event.getClickedInventory().getName().replace("Punish ", "");
		String B1Message = core.getConfig().getString("PunishmentMessages.Button1");
		String B2Message = core.getConfig().getString("PunishmentMessages.Button2");
		String B3Message = core.getConfig().getString("PunishmentMessages.Button3");
		String B4Message = core.getConfig().getString("PunishmentMessages.Button4");
		String B5Message = core.getConfig().getString("PunishmentMessages.Button5");
		String B6Message = core.getConfig().getString("PunishmentMessages.Button6");
		String B7Message = core.getConfig().getString("PunishmentMessages.Button7");
		String B8Message = core.getConfig().getString("PunishmentMessages.Button8");
		String B9Message = core.getConfig().getString("PunishmentMessages.Button9");
		String B10Message = core.getConfig().getString("PunishmentMessages.Button10");
		String B11Message = core.getConfig().getString("PunishmentMessages.Button11");
		String B12Message = core.getConfig().getString("PunishmentMessages.Button12");
		String B13Message = core.getConfig().getString("PunishmentMessages.Button13");
		String B14Message = core.getConfig().getString("PunishmentMessages.Button14");
		String B15Message = core.getConfig().getString("PunishmentMessages.Button15");
		String B16Message = core.getConfig().getString("PunishmentMessages.Button16");
		String B17Message = core.getConfig().getString("PunishmentMessages.Button17");
		String B18Message = core.getConfig().getString("PunishmentMessages.Button18");
		String B19Message = core.getConfig().getString("PunishmentMessages.Button19");
		String B20Message = core.getConfig().getString("PunishmentMessages.Button20");
		String B21Message = core.getConfig().getString("PunishmentMessages.Button21");
		String B22Message = core.getConfig().getString("PunishmentMessages.Button22");
		String B23Message = core.getConfig().getString("PunishmentMessages.Button23");
		String B24Message = core.getConfig().getString("PunishmentMessages.Button24");
		String B25Message = core.getConfig().getString("PunishmentMessages.Button25");
		String B26Message = core.getConfig().getString("PunishmentMessages.Button26");
		String B27Message = core.getConfig().getString("PunishmentMessages.Button27");
		String B1Time = core.getConfig().getString("PunishmentTimes.Button1");
		String B2Time = core.getConfig().getString("PunishmentTimes.Button2");
		String B3Time = core.getConfig().getString("PunishmentTimes.Button3");
		String B4Time = core.getConfig().getString("PunishmentTimes.Button4");
		String B5Time = core.getConfig().getString("PunishmentTimes.Button5");
		String B6Time = core.getConfig().getString("PunishmentTimes.Button6");
		String B7Time = core.getConfig().getString("PunishmentTimes.Button7");
		String B8Time = core.getConfig().getString("PunishmentTimes.Button8");
		String B9Time = core.getConfig().getString("PunishmentTimes.Button9");
		String B10Time = core.getConfig().getString("PunishmentTimes.Button10");
		String B11Time = core.getConfig().getString("PunishmentTimes.Button11");
		String B12Time = core.getConfig().getString("PunishmentTimes.Button12");
		String B13Time = core.getConfig().getString("PunishmentTimes.Button13");
		String B14Time = core.getConfig().getString("PunishmentTimes.Button14");
		String B15Time = core.getConfig().getString("PunishmentTimes.Button15");
		String B16Time = core.getConfig().getString("PunishmentTimes.Button16");
		String B17Time = core.getConfig().getString("PunishmentTimes.Button17");
		String B18Time = core.getConfig().getString("PunishmentTimes.Button18");
		String B19Time = core.getConfig().getString("PunishmentTimes.Button19");
		String B20Time = core.getConfig().getString("PunishmentTimes.Button20");
		String B21Time = core.getConfig().getString("PunishmentTimes.Button21");
		String B22Time = core.getConfig().getString("PunishmentTimes.Button22");
		String B23Time = core.getConfig().getString("PunishmentTimes.Button23");
		String B24Time = core.getConfig().getString("PunishmentTimes.Button24");
		String B25Time = core.getConfig().getString("PunishmentTimes.Button25");
		String B26Time = core.getConfig().getString("PunishmentTimes.Button26");
		String B27Time = core.getConfig().getString("PunishmentTimes.Button27");
		
		String _message1 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message);
		String _message2 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B2Time).replace("%reason%", B2Message);
		String _message3 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B3Time).replace("%reason%", B3Message);
		String _message4 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B4Time).replace("%reason%", B4Message);
		String _message5 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B5Time).replace("%reason%", B5Message);
		String _message6 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B6Time).replace("%reason%", B6Message);
		String _message7 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B7Time).replace("%reason%", B7Message);
		String _message8 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B8Time).replace("%reason%", B8Message);
		String _message9 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B9Time).replace("%reason%", B9Message);
		String _message10 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B10Time).replace("%reason%", B10Message);
		String _message11 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B11Time).replace("%reason%", B11Message);
		String _message12 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B12Time).replace("%reason%", B12Message);
		String _message13 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B13Time).replace("%reason%", B13Message);
		String _message14 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B14Time).replace("%reason%", B14Message);
		String _message15 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B15Time).replace("%reason%", B15Message);
		String _message16 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B16Time).replace("%reason%", B16Message);
		String _message17 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B17Time).replace("%reason%", B17Message);
		String _message18 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B18Time).replace("%reason%", B18Message);
		String _message19 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("banned", "kicked").replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B19Time).replace("%reason%", B19Message);
		String _message20 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("banned", "kicked").replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B20Time).replace("%reason%", B20Message);
		String _message21 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("banned", "muted").replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B21Time).replace("%reason%", B21Message);
		String _message22 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("banned", "muted").replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%reason%", B22Message);
		String _message23 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B23Time).replace("%reason%", B23Message);
		String _message24 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B24Time).replace("%reason%", B24Message);
		String _message25 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B25Time).replace("%reason%", B25Message);
		String _message26 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B26Time).replace("%reason%", B26Message);
		String _message27 = ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", player.getName()).replace("%player%", _targetPlayer).replace("%bantime%", B27Time).replace("%reason%", B27Message);

		String onPunishmentCommand = core.getConfig().getString("OnPunishedCommand.Command");
		onPunishmentCommand = onPunishmentCommand.replace("%player%", _targetPlayer);
		
		ItemStack ClickedButton = event.getCurrentItem();
		if (ClickedButton.getType() == Material.AIR) {
			return;
		}
		if (ClickedButton.getType() == Material.DIAMOND) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B1Time + " " + B1Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message1);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.FEATHER) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B2Time + " " + B2Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message2);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.BOW) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B3Time + " " + B3Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message3);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.IRON_SWORD) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B4Time + " " + B4Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message4);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.GLASS) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B5Time + " " + B5Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message5);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.BOOK) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B6Time + " " + B6Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message6);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.TNT) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B7Time + " " + B7Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message7);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.SKULL) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B8Time + " " + B8Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message8);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.BOOK_AND_QUILL) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B9Time + " " + B9Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message9);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.COAL_ORE) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B10Time + " " + B10Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message10);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.IRON_ORE) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B11Time + " " + B11Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message11);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.GOLD_ORE) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B12Time + " " + B12Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message12);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.DIAMOND_ORE) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B13Time + " " + B13Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message13);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.EMERALD_ORE) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B14Time + " " + B14Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message14);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.REDSTONE_ORE) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B15Time + " " + B15Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message15);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.LOG) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B16Time + " " + B16Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message16);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.STONE_SLAB2) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B17Time + " " + B17Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message17);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.BEDROCK) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B18Time + " " + B18Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message18);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.SKULL_ITEM) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:kick -s " + _targetPlayer + " " + B19Time + " " + B19Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message19);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("banned", "kicked").replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.GOLD_NUGGET) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:kick -s " + _targetPlayer + " " + B20Time + " " + B20Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message20);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("banned", "kicked").replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.PAPER) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:mute -s " + _targetPlayer + " " + B21Time + " " + B21Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message21);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("banned", "muted").replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.WRITTEN_BOOK) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:mute -s " + _targetPlayer + " " + B22Time + " " + B22Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message22);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("banned", "muted").replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.ANVIL) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B23Time + " " + B23Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message23);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.ANVIL) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B24Time + " " + B1Message);

			Bukkit.getOnlinePlayers().forEach(player1 -> {

				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message24);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.ANVIL) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ban -s " + _targetPlayer + " " + B25Time + " " + B25Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message25);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.REDSTONE_BLOCK) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ipmute -s " + _targetPlayer + " " + B26Time + " " + B26Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message26);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		if (ClickedButton.getType() == Material.BARRIER) {
			Bukkit.getServer().dispatchCommand(player, onPunishmentCommand);
			Bukkit.getServer().dispatchCommand(player, "litebans:ipban -s " + _targetPlayer + " " + B27Time + " " + B27Message);
			Bukkit.getOnlinePlayers().forEach(player1 -> {
				if (player1.hasPermission("glennpunishments.seepunishmentbroadcast")) {
					player1.sendMessage(_message27);
				} else {
					player1.sendMessage(ChatColor.translateAlternateColorCodes('&', core.getConfig().getString("BroadcastMessage.Message")).replace("%author%", "a Staff Member").replace("%player%", _targetPlayer).replace("%bantime%", B1Time).replace("%reason%", B1Message));
				}
			});
		}
		player.closeInventory();
		return;
	}
}