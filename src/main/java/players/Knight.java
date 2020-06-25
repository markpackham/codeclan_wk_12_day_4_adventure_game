package players;

import enemies.Enemy;

import java.util.ArrayList;

public class Knight extends Player {
    public Knight(String name, String meleeWeapon, int gold, int health, int maxHealth, boolean alive, ArrayList items, int meleeAttackPower) {
        super(name, meleeWeapon, gold, health, maxHealth, alive, items, meleeAttackPower);
    }

    public ArrayList getItem() {
        return null;
    }

    public void meleeAttack(Enemy enemy) {
        int health = enemy.getHealth() - getMeleeAttackPower();
        if(isAlive()) {
            if (health > 0) {
                enemy.setHealth(health);
            } else {
                enemy.setHealth(0);
                enemy.setAlive(false);
            }
        }
    }
}
