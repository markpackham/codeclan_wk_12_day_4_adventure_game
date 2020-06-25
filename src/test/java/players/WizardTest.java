package players;

import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WizardTest {

   Wizard wizard;
    Enemy enemy1;
    Enemy enemy2;
    Enemy enemy3;

    @Before
    public void before(){
        wizard = new Wizard("Harry","Wand",1,10, 10,true,null, 1);
        enemy1 = new Enemy("Troll","Fists",1,10, 10,true, null, 3);
        enemy2 = new Enemy("Orc","Club",3,5, 5,true,null, 2);
        enemy3 = new Enemy("Goblin","Spear",1,10, 10,true,null, 1);

    }

    @Test
    public void setName(){
        wizard.setName("Dave");
        assertEquals("Dave", wizard.getName());
    }

    @Test
    public void setMeleeWeapon(){
        wizard.setMeleWeapon("Wizard hat");
        assertEquals("Wizard hat", wizard.getMeleWeapon());
    }

    @Test
    public void setGold(){
        wizard.setGold(1000);
        assertEquals(1000, wizard.getGold());
    }

    @Test
    public void setHealth(){
        wizard.setHealth(100);
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void setAlive(){
        wizard.setAlive(false);
        assertEquals(false, wizard.isAlive());
    }

    @Test
    public void setAttackPower(){
        wizard.setMeleeAttackPower(400);
        assertEquals(400, wizard.getMeleeAttackPower());
    }

    @Test
    public void items(){
        wizard.addItem("Stones");
        assertEquals(1, wizard.getItems().size());
    }

    @Test
    public void canMeleeAttack(){
        wizard.meleeAttack(enemy1);
        assertEquals(9,enemy1.getHealth());
    }

    @Test
    public void canMeleeKillEnemy(){
        enemy1.setHealth(1);
        wizard.meleeAttack(enemy1);
        assertEquals(false,enemy1.isAlive());
    }

    @Test
    public void canCastFireball(){
        enemy1.setHealth(200);
        wizard.fireBall(enemy1);
        assertEquals(193, enemy1.getHealth());
    }
}
