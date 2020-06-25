package characters;

import java.util.ArrayList;

public abstract class GameCharacter {
    private String name;
    private String meleeWeapon;
    private int meleeAttackPower;
    private int gold;
    private int health;
    private int maxHealth;
    boolean alive;
    protected ArrayList items;

    public GameCharacter(String name, String meleeWeapon, int gold, int health, int maxHealth, boolean alive, ArrayList<String> items, int meleeAttackPower) {
        this.name = name;
        this.meleeWeapon = meleeWeapon;
        this.gold = gold;
        this.health = health;
        this.maxHealth = maxHealth;
        this.alive = alive;
        this.meleeAttackPower = meleeAttackPower;
        this.items = new ArrayList();
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

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getMeleeAttackPower() {
        return meleeAttackPower;
    }

    public void setMeleeAttackPower(int meleeAttackPower) {
        this.meleeAttackPower = meleeAttackPower;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public void meleeAttack(){

    }

    public void addItem(String item){
        this.items.add(item);
    }
}
