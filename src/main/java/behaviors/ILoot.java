package behaviors;

import java.util.ArrayList;

public interface ILoot {

    void addItem(ArrayList item);

    void addGold(int gold);

    ArrayList getItem();

    int getGold();
}
