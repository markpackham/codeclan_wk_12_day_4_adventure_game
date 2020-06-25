package players;

import enemies.Enemy;

import java.util.ArrayList;

public class Knight extends Player {
    public Knight(String name, String meleeWeapon, int gold, int health, boolean alive, ArrayList items, int meleeAttackPower) {
        super(name, meleeWeapon, gold, health, alive, items, meleeAttackPower);
    }

    public void addItem(ArrayList item) {

    }

    public void addGold(int gold) {

    }

    public ArrayList getItem() {
        return null;
    }

    public void meleeAttack(Enemy enemy) {
        int health = enemy.getHealth() - getMeleeAttackPower();
        enemy.setHealth(health);
    }
}
