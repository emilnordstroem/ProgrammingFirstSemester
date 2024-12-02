package opgave01;

import opgave01.characters.spellcaster.Wizard;
import opgave01.characters.spellcaster.spells.Spell;
import opgave01.characters.warrior.Barbarian;
import opgave01.characters.warrior.Warrior;
import opgave01.characters.warrior.weapons.Ranged;
import opgave01.characters.warrior.weapons.Weapon;
import opgave01.models.Duration;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    // Task B
        // Barbarian delopgaver
        ArrayList<Weapon> weaponArrayList = new ArrayList<>();
        Weapon longsword = new Weapon("longsword");
        Ranged shortbow = new Ranged("shortbow", 80);

        Barbarian fofstelr = new Barbarian("Fofstelr", 1, weaponArrayList);
        fofstelr.addWeapon(longsword);
        fofstelr.addWeapon(shortbow);

        // Wizard delopgaver
        ArrayList<Spell> spellArrayList = new ArrayList<>();
        Spell fireball = new Spell(150, Duration.INSTANTANEOUS);

        Wizard orlemaex = new Wizard("Orlemaex", 1, spellArrayList);
        orlemaex.addSpells(fireball);

        /*
        Spørgsmål 1: Overvej hvorfor du kan tilføje noget af typen ”Ranged” til en ArrayList der indeholder noget
        af typen Weapon?
            - Svar: Fordi ranged arver generalle egenskaber fra superklassen weapon

        Spørgsmål 2: Overvej hvorfor du får en kompilefejl, når du forsøger dette.
            - Svar: Fordi vi forsøger at tilgå et objekt som ikke indeholder et range

        Spørgsmål 3: Lav en Ranger klasse der både nedarver fra Spellcaster og Warrior klassen. Hvad siger kompileren til dette?
            - svar: Det er ikke muligt for en subklasse at nedarve fra to superklasser. Kun mulighed for single inheritance
        */
    }
}
