package opgave04.model;

import java.util.ArrayList;

public class Episode {
    protected int number;
    protected ArrayList<String> guestActors = new ArrayList<>();
    protected int lengthMinutes;

    public Episode (int number, ArrayList<String> guestActors, int lengthMinutes){
        this.number = number;
        this.guestActors = guestActors;
        this.lengthMinutes = lengthMinutes;
    }

    public int getNumber() {
        return number;
    }

    public int getLengthMinutes() {
        return lengthMinutes;
    }

    public ArrayList<String> getGuestActors() {
        return guestActors;
    }
}