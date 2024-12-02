package opgave04.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Kollegie {
    private String navn;
    private String adresse;

    private ArrayList<Bolig> boligListe = new ArrayList<>();

    public Kollegie(String navn, String adresse){
        this.navn = navn;
        this.adresse = adresse;
    }

    public void addBoligToListe(Bolig bolig){
        if(!boligListe.contains(bolig)){
            boligListe.add(bolig);
        }
    }

    public double gennemsnitligAntalDage(){
        double sum = 0;
        double antalDage = 0;

        for(Bolig bolig : boligListe){
            ArrayList<Lejeaftale> lejeaftaler = new ArrayList<>(bolig.getLejeaftaleListe());
            for(Lejeaftale lejeaftale : lejeaftaler){
                LocalDate fraDato = lejeaftale.getFraDato();
                LocalDate tilDato = lejeaftale.getTilDato();
                if(fraDato != null && tilDato != null){
                    // .toEpochDay() - takes time zero (1970 or something) and counts until LocalTime is true.
                    int dage = (int) (tilDato.toEpochDay() - fraDato.toEpochDay());
                    sum += dage;
                    antalDage++;
                }
            }
        }
        return antalDage / sum;
    }
}
