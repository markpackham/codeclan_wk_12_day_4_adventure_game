package players;

import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Enemy enemy1;
    Enemy enemy2;
    Enemy enemy3;

    @Before
    public void before(){
        cleric = new Cleric("Healer McMedic","Book",1,10,true,null, 3);
        enemy1 = new Enemy("Troll","Fists",1,10,true, null, 3);
        enemy2 = new Enemy("Orc","Club",3,5,true,null, 2);
        enemy3 = new Enemy("Goblin","Spear",1,10,true,null, 1);
    }

    @Test
    public void setName(){
        cleric.setName("Mike");
        assertEquals("Mike", cleric.getName());
    }

    @Test
    public void setMeleeWeapon(){
        cleric.setMeleWeapon("Spell book");
        assertEquals("Spell book", cleric.getMeleWeapon());
    }

    @Test
    public void setGold(){
        cleric.setGold(1000);
        assertEquals(1000, cleric.getGold());
    }

    @Test
    public void setHealth(){
        cleric.setHealth(100);
        assertEquals(100, cleric.getHealth());
    }

    @Test
    public void setAlive(){
        cleric.setAlive(false);
        assertEquals(false, cleric.isAlive());
    }

    @Test
    public void setAttackPower(){
        cleric.setMeleeAttackPower(400);
        assertEquals(400, cleric.getMeleeAttackPower());
    }

    @Test
    public void items(){
        cleric.addItem("Watch");
        assertEquals(1, cleric.getItems().size());
    }

    @Test
    public void canMeleeAttack(){
        cleric.meleeAttack(enemy1);
        assertEquals(7,enemy1.getHealth());
    }

    @Test
    public void canMeleeKillEnemy(){
        enemy1.setHealth(1);
        cleric.meleeAttack(enemy1);
        assertEquals(false,enemy1.isAlive());
    }
}
