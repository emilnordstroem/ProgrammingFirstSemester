package opgave04.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bolig {
    private int kvm;
    private String adresse;
    private int prisPrMaaned;

    private Kollegie kollegie;
    private ArrayList<Lejeaftale> lejeaftaleListe = new ArrayList<>();

    public Bolig(Kollegie kollegie, int kvm, String adresse, int prisPrMaaned){
        this.kollegie = kollegie;
        kollegie.addBoligToListe(this);

        this.kvm = kvm;
        this.adresse = adresse;
        this.prisPrMaaned = prisPrMaaned;
    }

    public void addLejeaftale(Lejeaftale lejeaftale){
        if(!lejeaftaleListe.contains(lejeaftale)){
            lejeaftaleListe.add(lejeaftale);
        }
    }

    public void createLejeaftale(LocalDate startDato, LocalDate slutDato){
        Lejeaftale lejeaftale = new Lejeaftale(this, startDato);
        addLejeaftale(lejeaftale);
    }

    public ArrayList<Lejeaftale> getLejeaftaleListe() {
        return lejeaftaleListe;
    }
}
