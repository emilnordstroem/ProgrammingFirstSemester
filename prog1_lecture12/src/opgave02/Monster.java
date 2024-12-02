package opgave02;

public class Monster {
    private int lifePoints;
    private int damagePoints;
    private int chanceOfHit;
    private String description;
    private String attackDescription;

    public Monster(int lifePoints, int damagePoints, int chanceOfHit, String description, String attackDescription) {
        setLifePoints(lifePoints);
        setDamagePoints(damagePoints);
        setChanceOfHit(chanceOfHit);
        setDescription(description);
        setAttackDescription(attackDescription);
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
    public void setChanceOfHit(int chanceOfHit) {
        this.chanceOfHit = chanceOfHit;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setAttackDescription(String attackDescription) {
        this.attackDescription = attackDescription;
    }

    public int getLifePoints() {
        return lifePoints;
    }
    public String getDescription() {
        return description;
    }

    public void attacks(int roll, Hero hero) {
        System.out.print("the " + description + " " + attackDescription);
        if (roll <= chanceOfHit) {
            System.out.println(" inflicting " + damagePoints + " damage");


            // Make it a method
            int lifePoints = hero.getLifePoints();
            lifePoints -= damagePoints;
            hero.setLifePoints(lifePoints);

            if (hero.getLifePoints() <= 0) {
                System.out.println("Slaying " + hero.getName());
            }
        } else {
            System.out.println(" but " + hero.getName() + " defends heroically");
        }
    }
}
