package players;

import java.util.ArrayList;
import enemies.Enemy;

public class Wizard extends AttackMage {

    public Wizard(String name, String meleeWeapon, int gold, int health, int maxHealth, boolean alive, ArrayList items, int meleeAttackPower) {
        super(name, meleeWeapon, gold, health, maxHealth, alive, items, meleeAttackPower);
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

    public void summonCreature(Enemy enemy){
        int damage = enemy.getHealth() - 30;
        enemy.setHealth(damage);
        creatureSummons -= 1;
    }

}
