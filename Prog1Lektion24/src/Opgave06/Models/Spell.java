package Opgave06.Models;

public class Spell {
    private String name;
    private String description;

    public Spell(String id, String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return String.format("%s%nDescription: %s", name, description);
    }

}
