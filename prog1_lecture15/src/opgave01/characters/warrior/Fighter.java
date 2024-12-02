package opgave01.characters.warrior;

import opgave01.characters.warrior.weapons.Weapon;

import java.util.ArrayList;

public class Fighter extends Warrior {
    public Fighter (String name, int level, ArrayList<Weapon> weapons){
        super(name, level, weapons);
    }
}
