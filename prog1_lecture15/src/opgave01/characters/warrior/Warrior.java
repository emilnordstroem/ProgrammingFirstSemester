package opgave01.characters.warrior;

import opgave01.characters.Character;
import opgave01.characters.warrior.weapons.Weapon;

import java.util.ArrayList;

public class Warrior extends Character {
    private ArrayList<Weapon> weapons;

    public Warrior(String name, int level, ArrayList<Weapon> weapons){
        super(name, level);
        setWeapons(weapons);
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }
}
