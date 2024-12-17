package domain.models;

import java.util.ArrayList;

public class Plads {
    private int nr;
    private Område område;
    private ArrayList<Reservation> reservationArrayList;
    private static double standardTimePris;

    public Plads(int nr, Område område) {
        this.nr = nr;
        this.område = område;
        this.reservationArrayList = new ArrayList<>();
    }

    public double pris(int antalTimer){
        double resultat = 50;
        switch (område){
            case VIP:
                resultat *= 1.25;
                break;
            case BØRNE:
                resultat *= 0.80;
                break;
            case TURNERING:
                resultat *= 1.10;
                break;
        }
        return resultat;
    }

    public int getNr() {
        return nr;
    }

    public Område getOmråde() {
        return område;
    }

    public ArrayList<Reservation> getReservationArrayList() {
        return reservationArrayList;
    }

    public double getStandardTimePris(){
        return standardTimePris;
    }

    public void setStandardTimePris(double pris){
        standardTimePris = pris;
    }

    public void tilføjReservation(Reservation reservation){
        if(!reservationArrayList.contains(reservation)){
            reservationArrayList.add(reservation);
        }
    }

    @Override
    public String toString(){
        return String.format("Plads %s, %s",
                nr,
                område
        );
    }
}
