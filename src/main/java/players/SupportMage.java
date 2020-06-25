package players;

import java.util.ArrayList;

public abstract class SupportMage extends Player {
    public SupportMage(String name, String meleeWeapon, int gold, int health, int maxHealth, boolean alive, ArrayList items, int meleeAttackPower) {
        super(name, meleeWeapon, gold, health, maxHealth, alive, items, meleeAttackPower);
    }

    public void heal(Player player){
        int health = player.getHealth() + 5;
        if(health + player.getHealth() > player.getMaxHealth()){
            player.setHealth(player.getMaxHealth());
        }else{
            player.setHealth(health);
        }
    }
}
