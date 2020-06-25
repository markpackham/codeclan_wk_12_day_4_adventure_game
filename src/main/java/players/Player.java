package players;
import characters.GameCharacter;
import rooms.Room;

import java.util.ArrayList;

public abstract class Player extends GameCharacter{

    public Player(String name, String meleeWeapon, int gold, int health, boolean alive, ArrayList items, int meleeAttackPower) {
        super(name, meleeWeapon, gold, health, alive, items, meleeAttackPower);
    }

    public void getAllRoomItems(Room room){
        ArrayList<String> roomItems = room.getItems();
        for(String item : roomItems){
            items.add(item);
        }
    }
}
