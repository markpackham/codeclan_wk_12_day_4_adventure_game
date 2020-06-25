package players;

import java.util.ArrayList;

public abstract class AttackMage extends MagicPlayer {
    public AttackMage(String name, String meleeWeapon, int gold, int health, int maxHealth, boolean alive, ArrayList items, int meleeAttackPower) {
        super(name, meleeWeapon, gold, health, maxHealth, alive, items, meleeAttackPower);
    }
}
