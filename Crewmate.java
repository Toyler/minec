//Have a use check in the game manager cuz both imps and crewmates can do it
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Crewmate{
    private int tasks = 5;
    private boolean death = false;
    private boolean use = false;
    Player player;
    

    public Using(){
        while(use == true){
            player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1, 5));
        }
    }

    public taskFinish(){
        continue;
    }

    public deathKill(){
        continue;
    }

    public deathVote(){
        continue;
    }
}