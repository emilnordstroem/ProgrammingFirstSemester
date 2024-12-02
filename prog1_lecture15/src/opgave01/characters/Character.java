package opgave01.characters;

public class Character {
    private String name;
    private int level;

    public Character(String name, int level){
        setName(name);
        setLevel(level);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setLevel(int level){
        this.level = level;
    }
}
