package view;

import domain.controller.Controller;
import domain.models.Arrangement;
import domain.models.Område;
import domain.models.Plads;
import javafx.application.Application;
import storage.Storage;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        initStorage();
        Application.launch(MainWindow.class);
    }

    private static void initStorage(){
        //==============================================
        // Pladser
        Område[] områder = {
                Område.TURNERING, Område.TURNERING, Område.TURNERING, Område.STANDARD,
                Område.STANDARD, Område.BØRNE, Område.BØRNE, Område.VIP
        };

        for(int pladsNr = 1; pladsNr <= 6; pladsNr++){
            Controller.opretPlads(pladsNr, områder[pladsNr - 1]);
        }

        //==============================================
        // Arrangementer
        Arrangement d2t = Controller.opretArrangement("Dota 2 tournament", true);
        Arrangement cst = Controller.opretArrangement("CS GO tournament", false);

        //==============================================
        // Reservationer
        LocalDateTime[] start = {
                LocalDateTime.of(2019,8,12, 20, 0),
                LocalDateTime.of(2019,8,13, 19, 0),
                LocalDateTime.of(2019,8,14, 19, 0)
        };
        LocalDateTime[] slut = {
                LocalDateTime.of(2019,8,12, 23, 0),
                LocalDateTime.of(2019,8,14, 6, 0),
                LocalDateTime.of(2019,8,15, 6, 0)
        };

        ArrayList<Plads> pladsArrayList = Storage.getPladser();

        for(int reservation = 1; reservation <= 3; reservation++){
            ArrayList<Plads> valgtePladser = new ArrayList<>();
            if(reservation == 1){
                for(Plads plads : pladsArrayList){
                    if(plads.getNr() == 1 || plads.getNr() == 2){
                        valgtePladser.add(plads);
                    }
                }
            } else if (reservation == 2){
                for(Plads plads : pladsArrayList){
                    if(plads.getNr() == 3 || plads.getNr() == 4){
                        valgtePladser.add(plads);
                    }
                }
            } else {
                for(Plads plads : pladsArrayList){
                    if(plads.getNr() == 6){
                        valgtePladser.add(plads);
                    }
                }
            }
            Controller.opretReservation(start[reservation - 1], slut[reservation - 1], valgtePladser);
        }
    }
}
