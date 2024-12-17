package domain.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reservation {
    private LocalDateTime start;
    private LocalDateTime slut;
    private ArrayList<Plads> pladsArrayList;

    public Reservation(LocalDateTime start, LocalDateTime slut, ArrayList<Plads> pladsArrayList) {
        this.start = start;
        this.slut = slut;
        this.pladsArrayList = pladsArrayList;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getSlut() {
        return slut;
    }

    public ArrayList<Plads> getPladsArrayList() {
        return pladsArrayList;
    }
}
