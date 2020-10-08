package me.RitzCrackerzMan.amongus;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import Java.util.ArrayList;

public class GameRun extends JavaPlugin implements Listener {
	public static int imposterOne = -1;
	public static int imposterTwo = -1;



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
				try
				{
					boolean areTwoImposters = args[1];
				}
				catch(Exception e)
				{
					System.out.println(e + "/amongus (start) (has two imposters{true/false})");
				}

				Player player = (Player) sender;
				if (command.equalsIgnoreCase("start")) {
					Bukkit.broadcastMessage("Game has started!");
					generateImposters(areTwoImposters);
					System.out.println("Number of players: " + getNumPlayers() + ", Imposters: " + imposterOne + ", " + imposterTwo); // debug line
				}
			}
		}
		return false;
	}

	

	public int getNumPlayers() {
		return getPlayerNames().size();
	}

	public ArrayList<String> getPlayerNames() {
		ArrayList<String> playerList = new ArrayList<String>();
		Player onlinePlayers = Bukkit.getOnlinePlayers();
		for(Player player : onlinePlayers)
		{
			playerList.add(player.getDisplayName());
		}
		
		return playerList;
	}

	public void generateImposters(boolean hasTwoImposters)
	{
		imposterOne = (int) (Math.random() * getNumPlayers() + 1);
		if(hasTwoImposters)
		{
			imposterTwo = imposterOne;
			while(imposterOne == imposterTwo)
			{
				int impostorTwo = (int) (Math.random() * getNumPlayers() + 1);
			}
		}
	}
}
