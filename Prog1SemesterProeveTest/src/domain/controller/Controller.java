package domain.controller;

import domain.models.Arrangement;
import domain.models.Område;
import domain.models.Plads;
import domain.models.Reservation;
import storage.Storage;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Controller {
    //======================================
    // oprette objekter

    public static Arrangement opretArrangement(String navn, boolean offentlig){
        System.out.println("opretArrangement() kaldt i Controller");
        Arrangement arrangement = new Arrangement(navn, offentlig);
        Storage.tilføjArrangement(arrangement);
        return arrangement;
    }

    public static Reservation opretReservation(LocalDateTime start, LocalDateTime slut, ArrayList<Plads> pladsArrayList){
        System.out.println("opretReservation() kaldt i Controller");
        Reservation reservation = new Reservation(start, slut, pladsArrayList);
        Storage.tilføjReservation(reservation);
        return reservation;
    }

    public static Plads opretPlads(int nr, Område område){
        System.out.println("opretPlads() kaldt i Controller");
        Plads plads = new Plads(nr, område);
        Storage.tilføjPlads(plads);
        return plads;
    }
}
