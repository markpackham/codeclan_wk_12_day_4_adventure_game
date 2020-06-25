package players;

import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Enemy enemy1;
    Enemy enemy2;
    Enemy enemy3;

    @Before
    public void before(){
        knight = new Knight("Arthur","Warhammer",1,10,true, null, 5);
        enemy1 = new Enemy("Troll","Fists",1,10,true, null, 3);
        enemy2 = new Enemy("Orc","Club",3,5,true,null, 2);
        enemy3 = new Enemy("Goblin","Spear",1,10,true,null, 1);
    }

    @Test
    public void setName(){
        knight.setName("Guy");
        assertEquals("Guy", knight.getName());
    }

    @Test
    public void setMeleeWeapon(){
        knight.setMeleWeapon("Longsword");
        assertEquals("Longsword", knight.getMeleWeapon());
    }

    @Test
    public void setGold(){
        knight.setGold(1000);
        assertEquals(1000, knight.getGold());
    }

    @Test
    public void setHealth(){
        knight.setHealth(100);
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void setAlive(){
        knight.setAlive(false);
        assertEquals(false, knight.isAlive());
    }

    @Test
    public void setAttackPower(){
        knight.setMeleeAttackPower(400);
        assertEquals(400, knight.getMeleeAttackPower());
    }

    @Test
    public void items(){
        knight.addItem("Bread");
        assertEquals(1, knight.getItems().size());
    }

    @Test
    public void canMeleeAttack(){
        knight.meleeAttack(enemy1);
        assertEquals(5,enemy1.getHealth());
    }

    @Test
    public void canMeleeKillEnemy(){
        knight.meleeAttack(enemy1);
        knight.meleeAttack(enemy1);
        knight.meleeAttack(enemy1);
        assertEquals(false,enemy1.isAlive());
    }
}
