package players;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WizardTest {

   Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Harry","Wand",1,10,true,null);

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
    public void items(){
        wizard.addItem("Stones");
        assertEquals(1, wizard.getItems().size());
    }
}
