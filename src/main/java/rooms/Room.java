package rooms;

import enemies.Enemy;

import java.util.ArrayList;

public abstract class Room {

    private int gold;
    private ArrayList<String> items;
    private ArrayList<Enemy> enemies;

    public Room( int gold) {
        this.gold = gold;
        this.items = new ArrayList<String>();
        this.enemies = new ArrayList<Enemy>();
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public ArrayList getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList enemies) {
        this.enemies = enemies;
    }

    public void addItem(String item){
        this.items.add(item);
    }

    public void addEnemy(Enemy enemy){
        this.enemies.add(enemy);
    }
}
