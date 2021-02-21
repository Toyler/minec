package me.RitzCrackerzMan.amongus;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import Java.util.ArrayList;

public class Imposter extends Player implements Listeners{
    private int killCooldown = 30;
    private boolean vent = false;
    private boolean use = false;
    String sabo = "";
    PlayerInventory inventory = player.getInventory();
    Lights = inventory.addItem(new ItemStack(Material.PAPER));
    Reactor = inventory.addItem(new ItemStack(Material.PAPER));
    Oxygen = inventory.addItem(new ItemStack(Material.PAPER));
    Communications = inventory.addItem(new ItemStack(Material.PAPER));

    public kill(){
        while(killCooldown == 0){
            player.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 10000, 255, true));
            inventory.addItem(new ItemStack(Material.WOOD_SWORD));
            killCooldown = 30;
        }
    }

    public ItemStack getOxygen() {

        ItemStack Oxygen = new ItemStack(Material.PAPER);
        ItemMeta OxygenMeta = Oxygen.getItemMeta();

        OxygenMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Oxygen Sabotage");
        OxygenMeta.setItemMeta(OxygenMeta);

        return Oxygen;
    }

    public ItemStack getReactor() {

        ItemStack Reactor = new ItemStack(Material.PAPER);
        ItemMeta ReactorMeta = Reactor.getItemMeta();

        ReactorMeta.setDisplayName(ChatColor.BLACK + "" + ChatColor.BOLD + "Reactor Sabotage");
        ReactorMeta.setItemMeta(ReactorMeta);

        return Reactor;
    }

    public ItemStack getCommunication() {

        ItemStack Communication = new ItemStack(Material.PAPER);
        ItemMeta CommunicationMeta = Communication.getItemMeta();

        CommunicationMeta.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Communication Sabotage");
        CommunicationMeta.setItemMeta(CommunicationMeta);

        return Communication;
    }

    public ItemStack getLights() {

        ItemStack Lights = new ItemStack(Material.PAPER);
        ItemMeta LightsMeta = Lights.getItemMeta();

        LightsMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Lights Sabotage");
        LightsMeta.setItemMeta(LightsMeta);

        return Lights;
    }

    public sabotage(){
        if(getLights.getClick() == ClickType.RIGHT){
            sabo = "lights";
        }
        if(getReactor.getClick() == ClickType.RIGHT){
            sabo = "reactor";
        }
        if(getOxygen.getClick() == ClickType.RIGHT){
            sabo = "oxygen";
        }
        if(getCommunication.getClick() == ClickType.Right){
            sabo = "communications";
        }
        while(sabotageCooldown == 0){
                if(sabo == "lights"){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1, 10000));
                    lightsOff = true;
                    sabotageCooldown = 45;
                }
                if(sabo == "reactor"){
                    Game.countdownTimerStart();
                    Game.ReactorTrigger = true;
                    sabotageCooldown = 45;
                }
                if(sabo == "communications"){
                    tasks.total = false;
                    tasks.display = false;
                    sabotageCooldown = 45;
                }
                if(sabo == "oxygen"){
                    oxygen = true;

                    //idk how they even fix this and idk what to start
                    sabotageCooldown = 45;
                }
        }
    }

    public vent(){
        //set into spectator
        // probably some class for imposter in a vent idk 
        }
}
