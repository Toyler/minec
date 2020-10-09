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

public class Imposter implements Player{
    private int killCooldown = 30;
    private boolean vent = false;
    private boolean use = false;
    PlayerInventory inventory = player.getInventory();
    Lights = inventory.addItem(new ItemStack(Material.PAPER));
    Reactor = invetory.addItem(new ItemStack(Material.PAPER));
    Oxygen = invetory.addItem(new ItemStack(Material.PAPER));
    Communications = inventory.addItem(new ItemStack(Material.PAPER));

    public kill(){
        while(killCooldown == 0){
            player.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 255, 10000, true));
            invetory.addItem(new ItemStack(Material.WOOD_SWORD));
            killCooldown = 30;
        }
    }

    public sabotage(){
        if(Lights.getClick() == ClickType.RIGHT){
            sabo = lights;
        }
        if(Reactor.getClick() == ClickType.RIGHT){
            sabo = reactor;
        }
        if(Oxygen.getClick() == ClickType.RIGHT){
            sabo = oxygen;
        }
        if(Communications.getClick() == ClickType.Right){
            sabo = communications;
        }
        while(sabotageCooldown == 0){
                if(sabo == lights){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1, 10000));
                    lightsOff = true;
                    sabotageCooldown = 45;
                }
                if(sabo == reactor){
                    Game.countdownTimerStart();
                    sabotageCooldown = 45;
                }
                if(sabo == communications){
                    //turn taskbar off
                    sabotageCooldown = 45;
                }
                if(sabo == oxygen){
                    //idk how they even fix this and idk what to start
                    sabotageCooldown = 45;
                }
        }
    }

    public vent()){
        //i honestly have no idea how this is going to work, do something with cmd blocks? no se
    }
}
