package opgave03;

public class Hero {
    public static int lifePoints;
    public static int damagePoints;
    public static int chanceOfHit;
    public static String name;
    public static String pronoun;
    public static String weapon;

    public Hero (int lifePoints, int damagePoints, int chanceOfHit, String name, String pronoun, String weapon){
        this.lifePoints = lifePoints;
        this.damagePoints = damagePoints;
        this.chanceOfHit = chanceOfHit;
        this.name = name;
        this.pronoun = pronoun;
        this.weapon = weapon;
    }

}
