package enemies;
import characters.GameCharacter;

import java.util.ArrayList;

public class Enemy extends GameCharacter {
    public Enemy(String name, String meleeWeapon, int gold, int health, boolean alive, ArrayList items) {
        super(name, meleeWeapon, gold, health, alive, items);
    }

    public void addItem(ArrayList item) {

    }

    public void addGold(int gold) {

    }

}
