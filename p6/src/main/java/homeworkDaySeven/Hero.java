package homeworkDaySeven;

import java.io.Serializable;

public class Hero implements Serializable {
    String name;
    int lvl;
    Weapon weapon;

    public Hero(String name, int lvl, Weapon weapon) {
        this.name = name;
        this.lvl = lvl;
        this.weapon = weapon;
    }
}
