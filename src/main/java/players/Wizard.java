package players;

import java.util.ArrayList;
import enemies.Enemy;

public class Wizard extends AttackMage {

    public Wizard(String name, String meleeWeapon, int gold, int health, int maxHealth, boolean alive, ArrayList items, int meleeAttackPower) {
        super(name, meleeWeapon, gold, health, maxHealth, alive, items, meleeAttackPower);
    }

    public void addItem(ArrayList item) {

    }

    public void addGold(int gold) {

    }

    public void meleeAttack(Enemy enemy) {
        int health = enemy.getHealth() - getMeleeAttackPower();
        if(health > 0){
            enemy.setHealth(health);
        }else {
            enemy.setHealth(0);
            enemy.setAlive(false);
        }

    }

    public ArrayList getItem() {
        return null;
    }
}
