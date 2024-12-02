package opgave01.characters.warrior.weapons;

public class Ranged extends Weapon {
    private int range;

    public Ranged(String name, int range){
        super(name);
        setRange(range);

    }
    public void setRange(int range){
        this.range = range;
    }
    public int getRange() {
        return range;
    }
}
