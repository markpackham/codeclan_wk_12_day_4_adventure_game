package characters;

import java.util.ArrayList;

public abstract class GameCharacter {
    private String name;
    private String meleeWeapon;
    private int gold;
    private int health;
    boolean alive;
    private ArrayList items;

    public GameCharacter(String name, String meleeWeapon, int gold, int health, boolean alive, ArrayList items) {
        this.name = name;
        this.meleeWeapon = meleeWeapon;
        this.gold = gold;
        this.health = health;
        this.alive = alive;
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

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
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
