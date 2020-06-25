package enemies;

import org.junit.Before;
import org.junit.Test;
import players.Knight;
import players.Player;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Player knight;
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

    @Test
    public void setAttackPower(){
        enemy1.setMeleeAttackPower(100);
        assertEquals(100, enemy1.getMeleeAttackPower());
    }

    @Test
    public void meleeAttack() {
        enemy1.meleeAttack(knight);
        assertEquals(7, knight.getHealth());
    }

    @Test
    public void canMeleeKillPlayer(){
        knight.setHealth(1);
        enemy1.meleeAttack(knight);
        assertEquals(false,knight.isAlive());
    }
}
