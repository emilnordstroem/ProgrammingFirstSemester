package opgave03;

public class Monster {
    public static int lifePoints;
    public static int damagePoints;
    public static int chanceOfHit;
    public static String description;
    public static String attackDescription;
    public static String attribute;

    public Monster (int lifePoints, int damagePoints, int chanceOfHit, String description, String attackDescription, String attribute){
        this.lifePoints = lifePoints;
        this.damagePoints = damagePoints;
        this.chanceOfHit = chanceOfHit;
        this.description = description;
        this.attackDescription = attackDescription;
        this.attribute = attribute;
    }
}
