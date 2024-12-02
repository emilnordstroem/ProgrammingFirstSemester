package opgave02.models;

import java.time.LocalDate;

public class Actor {
    private String name;
    private LocalDate birthday;

    public Actor(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    // Task A
    @Override
    public String toString(){
        return "\nActors name: " + name + " " + "Birthday: " + birthday;
    }
}
