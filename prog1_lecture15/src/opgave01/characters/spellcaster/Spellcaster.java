package opgave01.characters.spellcaster;

import opgave01.characters.Character;
import opgave01.characters.spellcaster.spells.Spell;
import opgave01.characters.warrior.weapons.Weapon;

import java.util.ArrayList;

public class Spellcaster extends Character {
    private ArrayList<Spell> spells;

    public Spellcaster(String name, int level, ArrayList<Spell> spells){
        super(name, level);
        setSpells(spells);
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }

    public void addSpell(Spell spell){
        spells.add(spell);
    }
}
