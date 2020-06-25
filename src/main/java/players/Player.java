package players;
import characters.GameCharacter;

public abstract class Player extends GameCharacter{

    public Player(String name, String meleeWeapon, int gold, int health, boolean alive) {
        super(name, meleeWeapon, gold, health, alive);
    }
}
