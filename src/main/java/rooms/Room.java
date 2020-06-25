package rooms;

import java.util.ArrayList;

public abstract class Room {

    private int gold;
    private ArrayList items;
    private ArrayList enemies;

    public Room( int gold) {
        this.gold = gold;
        this.items = new ArrayList();
        this.enemies = new ArrayList();
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
}
