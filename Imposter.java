package me.RitzCrackerzMan.amongus;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import Java.util.ArrayList;

public class Imposter implements Player{
    private int killCooldown = 30;
    private boolean vent = false;
    private boolean use = false;

    public kill(){
        while(killCooldown == 0){
            //some pvp rule probably
            //potion effect for strength + wooden sword
            continue;
            killCooldown = 30;
        }
    }

    public sabotage(){
        while(sabotageCooldown == 0){
            //some inventory thingy
            //some if statement to check if m2 on inventory thingy
                if(sabo == lights){
                    //efffect all players with blindness
                    sabotageCooldown = 25;
                }
                if(sabo == reactor){
                    //some timer start
                    //fix with 2 pressure plates?
                    sabotageCooldown = 25;
                }
                if(sabo == communications){
                    //turn taskbar off
                    sabotageCooldown = 25;
                }
                if(sabo == oxygen){
                    //idk how they even fix this and idk what to start
                    sabotageCooldown = 25;
                }
        }
    }

    public vent(){
        //teleport player 
    }

    public impostorUse(){
        //idk
    }
}
