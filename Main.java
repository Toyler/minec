package me.RitzCrackerzMan.amongus;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class GameManager extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			String name = cmd.getName();
			if (name.equalsIgnoreCase("amongus")) {
				if (args.length == 0) {
					return false;
				}
				String command = args[0];
				Player player = (Player) sender;
				if (command.equalsIgnoreCase("start")) {
					Bukkit.broadcastMessage("Game has started!");
					for (Player player : Bukkit.getOnlinePlayers()) {
						int impostorOne = (int) (Math.random() * 10 + 1);
						int impostorTwo = (int) (Math.random() * 10 + 1);
						
					}
				}
			}
		}
		return false;
	}
}
