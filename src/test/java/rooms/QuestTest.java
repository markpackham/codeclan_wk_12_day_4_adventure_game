package rooms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuestTest {

    Quest quest1;
    Room chamber1;


    @Before
    public void setUp() throws Exception {
        chamber1 = new TortureChamber(0);
        quest1 = new Quest();
    }

    @Test
    public void canAddRoom(){
        quest1.addRoom(chamber1);
        assertEquals(1,quest1.getRooms().size());
    }



}