package me.RitzCrackerzMan.amongus;

public class Ghost extends Player implements Listener {
    private boolean task = true
    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 48000, 2, true, false, false));
    player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 48000, 2, true, false, false));
}

@EventHandler
private void onPlayerDamage(EntityDamageEvent event) {
    if (event.getEntity() instanceof Player) {
        Player player = (Player) event.getEntity();
        if (event.getCause() == DAMAGE.ENTITY_ATTACK) {
            event.setCancelled(true);
    }
    }
    
}
@EventHandler
private void onPlayerAttack(EntityDamageByEntity event) {
    if (event.getEntity() instanceof Player) {
        Player player = (Player) event.getEntity();
        event.setCancelled(true);
    }
}