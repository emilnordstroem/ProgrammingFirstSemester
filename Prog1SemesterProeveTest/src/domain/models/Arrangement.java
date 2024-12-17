package domain.models;

import java.util.ArrayList;

public class Arrangement {
    private String navn;
    private boolean offentlig;
    ArrayList<Reservation> reservationArrayList;

    public Arrangement(String navn, boolean offentlig) {
        this.navn = navn;
        this.offentlig = offentlig;
        this.reservationArrayList = new ArrayList<>();
    }

    public int antalReserveredePladser(){
        int antalReserveredePladser = 0;
        for(Reservation reservation : reservationArrayList){
            antalReserveredePladser += reservation.getPladsArrayList().size();
        }
        return antalReserveredePladser;
    }

    public String getNavn() {
        return navn;
    }

    public boolean isOffentlig() {
        return offentlig;
    }

    public ArrayList<Reservation> getReservationArrayList() {
        return reservationArrayList;
    }

    public void tilføjReservation(Reservation reservation) {
        if(!reservationArrayList.contains(reservation)){
            reservationArrayList.add(reservation);
        }
    }
}
