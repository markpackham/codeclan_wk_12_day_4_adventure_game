package players;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Arthur","Warhammer",1,10,true,null);

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
    public void items(){
        knight.addItem("Bread");
        assertEquals(1, knight.getItems().size());
    }
}
