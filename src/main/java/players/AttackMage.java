package players;

import enemies.Enemy;

import java.util.ArrayList;

public abstract class AttackMage extends MagicPlayer {
    protected int creatureSummons;

    public AttackMage(String name, String meleeWeapon, int gold, int health, int maxHealth, boolean alive, ArrayList items, int meleeAttackPower) {
        super(name, meleeWeapon, gold, health, maxHealth, alive, items, meleeAttackPower);
        this.creatureSummons = 3;
    }

    public int getCreatureSummons() {
        return creatureSummons;
    }

    public void setCreatureSummons(int creatureSummons) {
        this.creatureSummons = creatureSummons;
    }

    public void fireBall(Enemy enemy){
        int damage = enemy.getHealth() - 7;
        enemy.setHealth(damage);
    }

    public void summonCreature(Enemy enemy){
        int damage = enemy.getHealth() - 20;
        enemy.setHealth(damage);
        creatureSummons -= 1;
    }
}
