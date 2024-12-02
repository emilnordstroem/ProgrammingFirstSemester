package opgave01.characters.spellcaster.spells;

import opgave01.models.Duration;

import java.util.ArrayList;

public class Spell {
    private int range;
    private Duration duration;

    public Spell (int range, Duration duration){
        setRange(range);
    }

    public void setRange(int range) {
        this.range = range;
    }
}
