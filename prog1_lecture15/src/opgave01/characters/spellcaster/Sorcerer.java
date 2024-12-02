package opgave01.characters.spellcaster;

import opgave01.characters.spellcaster.spells.Spell;

import java.util.ArrayList;

public class Sorcerer extends Spellcaster {
    public Sorcerer (String name, int level, ArrayList<Spell> spells){
        super(name, level, spells);
    }
}
