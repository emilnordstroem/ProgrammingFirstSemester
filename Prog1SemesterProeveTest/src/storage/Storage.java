package storage;

import domain.models.Arrangement;
import domain.models.Plads;
import domain.models.Reservation;

import java.util.ArrayList;

public class Storage {
    private static final ArrayList<Arrangement> arrangementer = new ArrayList<>();
    private static final ArrayList<Reservation> reservationer = new ArrayList<>();
    private static final ArrayList<Plads> pladser = new ArrayList<>();

    public static ArrayList<Arrangement> getArrangementer(){
        System.out.println("getArrangementer() kaldt i Storage");
        return new ArrayList<>(arrangementer);
    }

    public static ArrayList<Reservation> getReservationer(){
        System.out.println("getReservationer() kaldt i Storage");
        return new ArrayList<>(reservationer);
    }

    public static ArrayList<Plads> getPladser(){
        System.out.println("getPladser() kaldt i Storage");
        return new ArrayList<>(pladser);
    }

    public static void tilføjArrangement(Arrangement arrangement){
        System.out.println("tilføjArrangement() kaldt i Storage");
        if(!arrangementer.contains(arrangement)){
            arrangementer.add(arrangement);
        }
    }

    public static void tilføjReservation(Reservation reservation){
        System.out.println("tilføjReservation() kaldt i Storage");
        if(!reservationer.contains(reservation)){
            reservationer.add(reservation);
        }
    }

    public static void tilføjPlads(Plads plads){
        System.out.println("tilføjPlads() kaldt i Storage");
        if(!pladser.contains(plads)){
            pladser.add(plads);
        }
    }
}