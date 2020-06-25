package players;

import java.util.ArrayList;

public abstract class SupportMage extends Player {
    public SupportMage(String name, String meleeWeapon, int gold, int health, boolean alive, ArrayList items, int meleeAttackPower) {
        super(name, meleeWeapon, gold, health, alive, items, meleeAttackPower);
    }

    public void heal(Player player){
        int health = player.getHealth() + 5;
        player.setHealth(health);
    }
}
