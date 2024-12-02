package opgave02;

public class Hero {
    private int lifePoints;
    private int damagePoints;
    private int chanceOfHit;
    private String name;
    private String pronoun;
    private String weapon;

    public Hero(int lifePoints, int damagePoints, int chanceOfHit, String name, String pronoun, String weapon) {
        setLifePoints(lifePoints);
        setDamagePoints(damagePoints);
        setChanceOfHit(chanceOfHit);
        setName(name);
        setPronoun(pronoun);
        setWeapon(weapon);
    }

    public void setLifePoints(int lifePoints){
        this.lifePoints = lifePoints;
    }
    public void setDamagePoints(int damagePoints){
        this.damagePoints = damagePoints;
    }
    public void setChanceOfHit(int chanceOfHit){
        this.chanceOfHit = chanceOfHit;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPronoun(String pronoun){
        this.pronoun = pronoun;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }

    public int getLifePoints(){
        return this.lifePoints;
    }
    public String getName(){
        return this.name;
    }



    public void attacks(int roll, Monster monster) {
        System.out.print(name + " attacks with " + pronoun + " " + weapon);
        if (roll <= chanceOfHit) {
            System.out.println(" and hits the " + monster.getDescription() + " inflicting " + damagePoints);

            // Make it a method
            int lifePoints = monster.getLifePoints();
            lifePoints -= damagePoints;
            monster.setLifePoints(lifePoints);

            if (monster.getLifePoints() <= 0) {
                System.out.println("killing the " + monster.getDescription());
            }
        } else {
            System.out.println(" but misses the target.");
        }
    }
}
