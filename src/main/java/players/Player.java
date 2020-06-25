package players;
import characters.GameCharacter;
import rooms.Room;

import java.util.ArrayList;

public abstract class Player extends GameCharacter{

    public Player(String name, String meleeWeapon, int gold, int health, int maxHealth, boolean alive, ArrayList items, int meleeAttackPower) {
        super(name, meleeWeapon, gold, health, maxHealth, alive, items, meleeAttackPower);
    }

    public void getAllRoomItems(Room room){
        if(room.getEnemies().size() == 0) {
            int goldAmount = room.getGold() + this.getGold();
            setGold(goldAmount);
            ArrayList<String> roomItems = room.getItems();
            for (String item : roomItems) {
                items.add(item);
            }
        }
    }
}
