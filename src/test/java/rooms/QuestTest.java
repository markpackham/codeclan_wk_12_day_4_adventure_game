package rooms;

import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Knight;
import players.Player;

import static org.junit.Assert.*;

public class QuestTest {

    Quest quest1;
    Room chamber1;
    Room jail1;
    Room mainhall1;
    Room courtyard1;
    Knight knight;
    Cleric cleric;
    Enemy enemy1;
    Enemy enemy2;
    Enemy enemy3;

    @Before
    public void setUp() throws Exception {
        chamber1 = new TortureChamber(100);
        mainhall1 = new MainHall(25);
        jail1 = new JailCell(5);
        courtyard1 = new Courtyard(15);
        quest1 = new Quest();
        knight = new Knight("Arthur","Warhammer",1,20, 10,true, null, 5);
        cleric = new Cleric("Healer McMedic","Book",1,10, 10,true,null, 3);
        enemy1 = new Enemy("Troll","Fists",1,10, 10,true, null, 3);
        enemy2 = new Enemy("Orc","Club",3,5, 5,true,null, 2);
        enemy3 = new Enemy("Goblin","Spear",1,10, 10,true,null, 1);
    }

    @Test
    public void canAddRoom(){
        quest1.addRoom(mainhall1);
        assertEquals(1,quest1.getRooms().size());
    }

    @Test
    public void canFightEnemyInRoom(){
        chamber1.addEnemy(enemy1);
        chamber1.addEnemy(enemy2);
        chamber1.addHero(cleric);
        chamber1.addHero(knight);
        quest1.addRoom(chamber1);
        knight.meleeAttack(enemy1);
        enemy1.meleeAttack(knight);
        knight.meleeAttack(enemy1);
        assertEquals(1,quest1.getRooms().get(0).getEnemies().size());
    }

    @Test
    public void cannotLootRoomEnemiesStillThere(){
        chamber1.setGold(10000);
        chamber1.addEnemy(enemy1);
        chamber1.addEnemy(enemy2);
        chamber1.addHero(cleric);
        chamber1.addHero(knight);
        quest1.addRoom(chamber1);
        knight.meleeAttack(enemy1);
        enemy1.meleeAttack(knight);
        knight.meleeAttack(enemy1);
        knight.getAllRoomItems(chamber1);
        assertEquals(1,knight.getGold());
    }

    // FAILING, issue with melee attack after enemy status set to alive = false
    @Test
    public void canLootRoomEnemiesDead(){
        chamber1.setGold(10000);
        chamber1.addItem("Candle");
        chamber1.addEnemy(enemy1);
        chamber1.addHero(knight);
        quest1.addRoom(chamber1);
        knight.meleeAttack(enemy1);
        knight.meleeAttack(enemy1);
        knight.getAllRoomItems(chamber1);
        assertEquals(10001, knight.getGold());
    }

}