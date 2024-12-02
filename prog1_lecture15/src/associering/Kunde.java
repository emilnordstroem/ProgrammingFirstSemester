package associering;

import java.util.ArrayList;

public class Kunde {
    private String navn;
    private String adresse;
    private ArrayList<Konto> kontoArrayList;

    public Kunde(String navn, String adresse, ArrayList<Konto> kontoArrayList){
        setNavn(navn);
        setAdresse(adresse);
        setKontoArrayList(kontoArrayList);
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setKontoArrayList(ArrayList<Konto> kontoArrayList) {
        this.kontoArrayList = kontoArrayList;
    }

    public void addKonto(Konto konto){
        kontoArrayList.add(konto);
    }
}
