package rooms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TortureChamberTest {

    TortureChamber chamber1;

    @Before
    public void setUp() throws Exception {
        chamber1 = new TortureChamber(0);
    }

    @Test
    public void canSetGold(){
        chamber1.setGold(100);
        assertEquals(100, chamber1.getGold());
    }

    @Test
    public void canAddItem(){
        chamber1.addItem("Whip");
        assertEquals(1, chamber1.getItems().size());
    }
}