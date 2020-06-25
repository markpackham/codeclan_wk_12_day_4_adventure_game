package players;

import java.util.ArrayList;
import enemies.Enemy;

public class Cleric extends SupportMage{

    public Cleric(String name, String meleeWeapon, int gold, int health, boolean alive, ArrayList items, int meleeAttackPower) {
        super(name, meleeWeapon, gold, health, alive, items, meleeAttackPower);
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
            enemy.setAlive(false);
        }

    }



    public ArrayList getItem() {
        return null;
    }
}
