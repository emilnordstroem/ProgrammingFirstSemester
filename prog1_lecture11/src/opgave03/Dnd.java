package opgave03;

public class Dnd {

    public static void main(String[] args) {
        Hero hero = new Hero(100, 8, 3, "Chicken", "Them/They", "Pistol");
        Monster monster = new Monster(250, 20, 5, "Slauther", "Cut", "Knife");
        fight(hero, monster);
    }

    public static void fight(Hero hero, Monster monster) {
        while (hero.lifePoints > 0 && monster.lifePoints > 0) {
            int roll = rollD100();
            heroAttacks(roll, hero, monster);
            if (monster.lifePoints > 0) {
                roll = rollD100();
                monsterAttacks(roll, hero, monster);
            }
        }
    }

    private static void heroAttacks(int roll, Hero hero, Monster monster) {
        System.out.print(hero.name + " attacks with " + hero.pronoun + " " + hero.weapon);
        if (roll <= hero.chanceOfHit) {
            System.out.println(" and hits the " + monster.description + " inflicting " + hero.damagePoints);
            monster.lifePoints -= hero.damagePoints;
            if (monster.lifePoints <= 0) {
                System.out.println("killing the " + monster.description);
            }
        } else {
            System.out.println(" but misses the target.");
        }
    }
    private static void monsterAttacks(int roll, Hero hero, Monster monster) {
        System.out.print("the " + monster.description + " " + monster.attackDescription);
        if (roll <= monster.chanceOfHit) {
            System.out.println(" inflicting " + monster.damagePoints + " damage");
            hero.lifePoints -= monster.damagePoints;
            if (hero.lifePoints <= 0) {
                System.out.println("Slaying " + hero.name);
               }
        } else {
                System.out.println(" but " + hero.name + " defends heroically");
            }
        }
        public static int rollD100() {
            return (int) (Math.random() * 100 + 1);
        }
}

