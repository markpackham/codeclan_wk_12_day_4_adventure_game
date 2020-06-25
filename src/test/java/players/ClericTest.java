package players;

import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Knight knight;
    Enemy enemy1;
    Enemy enemy2;
    Enemy enemy3;

    @Before
    public void before(){
        cleric = new Cleric("Healer McMedic","Book",1,10, 10,true,null, 3);
        knight = new Knight("Arthur","Warhammer",1,10, 10,true, null, 5);
        enemy1 = new Enemy("Troll","Fists",1,10, 10,true, null, 3);
        enemy2 = new Enemy("Orc","Club",3,5, 10,true,null, 2);
        enemy3 = new Enemy("Goblin","Spear",1,10, 10,true,null, 1);
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

    @Test
    public void canHealCharacter(){
        knight.setHealth(1);
        cleric.heal(knight);
        assertEquals(6, knight.getHealth());
    }

    @Test
    public void cannotHealOverMaxHealth(){
        knight.setMaxHealth(10);
        cleric.heal(knight);
        assertEquals(10, knight.getHealth());
    }

    @Test
    public void canPotionHeal(){
        knight.setHealth(1);
        cleric.setPotionAmount(5);
        cleric.potionHeal(knight);
        assertEquals(10, knight.getHealth());
        assertEquals(4,cleric.getPotionAmount());
    }

    @Test
    public void cannotPotionHealNoPotions(){
        knight.setHealth(1);
        cleric.setPotionAmount(0);
        cleric.potionHeal(knight);
        assertEquals(1, knight.getHealth());
        assertEquals(0,cleric.getPotionAmount());
    }
}
