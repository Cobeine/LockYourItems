package me.sanhak.lockyouritem.utils;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class PlayerUtils {

	public static void noPermissionsMessage(Player player) {
		if (player != null && player.isOnline()) {
			player.playSound(player.getLocation(), Sound.ITEM_BREAK, 0.5f, 5.0f);
			player.sendMessage(StringUtils.format("&cYou don't have enough permissions to perform this command !"));
		}
		return;
	}

	public static void successfullyMessage(Player player, String message) {
		if (player != null && player.isOnline()) {
			player.playSound(player.getLocation(), Sound.SUCCESSFUL_HIT, 0.5f, 5.0f);
			player.sendMessage(StringUtils.format(message));
		}
		return;
	}
	
	public static void errorMessage(Player player, String message) {
		if (player != null && player.isOnline()) {
			player.playSound(player.getLocation(), Sound.VILLAGER_NO, 0.5f, 5.0f);
			player.sendMessage(StringUtils.format(message));
		}
		return;
	}

}
