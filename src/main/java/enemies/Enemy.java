package enemies;
import characters.GameCharacter;
import players.Player;

import java.util.ArrayList;

public class Enemy extends GameCharacter {
    public Enemy(String name, String meleeWeapon, int gold, int health, int maxHealth, boolean alive, ArrayList items, int meleeAttackPower) {
        super(name, meleeWeapon, gold, health, maxHealth, alive, items, meleeAttackPower);
    }

    public void meleeAttack(Player player) {
        int health = player.getHealth() - getMeleeAttackPower();
        if(isAlive()) {
            if (health > 0) {
                player.setHealth(health);
            } else {
                player.setHealth(0);
                player.setAlive(false);
            }
        }

    }

}
