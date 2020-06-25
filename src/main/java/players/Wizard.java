package players;

import java.util.ArrayList;

public class Wizard extends Player {

    public Wizard(String name, String meleeWeapon, int gold, int health, boolean alive, ArrayList items, int meleeAttackPower) {
        super(name, meleeWeapon, gold, health, alive, items, meleeAttackPower);
    }

    public void addItem(ArrayList item) {

    }

    public void addGold(int gold) {

    }

    public ArrayList getItem() {
        return null;
    }
}
