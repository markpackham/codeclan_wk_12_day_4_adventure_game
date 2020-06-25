package rooms;

import java.util.Random;
import enemies.Enemy;
import players.Player;

import java.util.ArrayList;

public abstract class Room {

    private int gold;
    private ArrayList<String> items;
    private ArrayList<Enemy> enemies;
    private ArrayList<Player> heroes;
    private ArrayList<ExitType> exists;
    Random rand = new Random();
    private int randomNum;

    public Room( int gold) {
        this.gold = gold;
        this.items = new ArrayList<String>();
        this.enemies = new ArrayList<Enemy>();
        this.heroes = new ArrayList<Player>();
        this.exists = new ArrayList<ExitType>();
        this.randomNum = rand.nextInt(4);
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
        for(Enemy enemy: enemies){
            if(enemy.isAlive() == false){
                enemies.remove(enemy);
            }
        }

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

    public ArrayList<Player> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Player> heroes) {
        this.heroes = heroes;
    }

    public void addHero(Player hero){
        this.heroes.add(hero);
    }

    public int getRandomNum() {
        return randomNum;
    }

    public ArrayList<ExitType> getExists() {
        return exists;
    }

    public void setExists(ArrayList<ExitType> exists) {
        this.exists = exists;
    }

    public void generateExits(){
        for(ExitType exit : ExitType.values()) {
            exists.add(exit);
            }
        exists.remove(randomNum);
        }

    public void remove(Enemy enemy) {
        this.enemies.remove(enemy);
    }
}
