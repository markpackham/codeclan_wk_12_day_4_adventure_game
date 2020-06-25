package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy1;
    Enemy enemy2;
    Enemy enemy3;

    @Before
    public void before(){
        enemy1 = new Enemy("Troll","Fists",1,10,true,null);

    }

    @Test
    public void setName(){
        enemy1.setName("Trollomus");
        assertEquals("Trollomus", enemy1.getName());
    }

    @Test
    public void setMeleeWeapon(){
        enemy1.setMeleWeapon("Giant Fish");
        assertEquals("Giant Fish", enemy1.getMeleWeapon());
    }

    @Test
    public void setGold(){
        enemy1.setGold(1000);
        assertEquals(1000, enemy1.getGold());
    }

    @Test
    public void setHealth(){
        enemy1.setHealth(100);
        assertEquals(100, enemy1.getHealth());
    }

    @Test
    public void setAlive(){
        enemy1.setAlive(false);
        assertEquals(false, enemy1.isAlive());
    }

    @Test
    public void items(){
        enemy1.addItem("Stones");
        assertEquals(1, enemy1.getItems().size());
    }
}