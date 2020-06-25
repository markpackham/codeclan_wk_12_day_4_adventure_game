package players;

import java.util.ArrayList;
import enemies.Enemy;

public class Cleric extends SupportMage{

    private int potionAmount;

    public Cleric(String name, String meleeWeapon, int gold, int health, int maxHealth, boolean alive, ArrayList items, int meleeAttackPower) {
        super(name, meleeWeapon, gold, health, maxHealth, alive, items, meleeAttackPower);
        this.potionAmount = 0;
    }

    public int getPotionAmount() {
        return potionAmount;
    }

    public void setPotionAmount(int potionAmount) {
        this.potionAmount = potionAmount;
    }

    public void potionHeal(Player player){
        int health = player.getHealth() + 10;
        if(potionAmount > 0) {
            if (health + player.getHealth() > player.getMaxHealth()) {
                player.setHealth(player.getMaxHealth());
            } else {
                player.setHealth(health);
            }
            potionAmount = getPotionAmount() - 1;
        }
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

}
