package associering;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Konto> kontoArrayList = new ArrayList<>();
        Konto opsparing = new Konto(102010, 100000);
        Kunde nyKunde = new Kunde("Emil", "Adresse", kontoArrayList);
        nyKunde.addKonto(opsparing);
    }
}
