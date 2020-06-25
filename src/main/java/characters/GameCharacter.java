package characters;

import behaviors.ILoot;

public abstract class GameCharacter implements ILoot {
    private String name;
    private String meleeWeapon;
    private int gold;
    private int health;
    boolean alive;

    public GameCharacter(String name, String meleeWeapon, int gold, int health, boolean alive) {
        this.name = name;
        this.meleeWeapon = meleeWeapon;
        this.gold = gold;
        this.health = health;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeleWeapon() {
        return meleeWeapon;
    }

    public void setMeleWeapon(String meleWeapon) {
        this.meleeWeapon = meleWeapon;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void meleeAttack(){

    }

}
