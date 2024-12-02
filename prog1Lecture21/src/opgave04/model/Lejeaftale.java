package opgave04.model;

import java.time.LocalDate;

public class Lejeaftale {
    private LocalDate fraDato;
    private LocalDate tilDato;

    private Bolig bolig;
    private Lejer[] lejere = new Lejer[2];

    Lejeaftale(Bolig bolig, LocalDate fraDato){
        this.bolig = bolig;
        this.fraDato = LocalDate.now();
        this.tilDato = null;
    }

    public LocalDate getFraDato() {
        return fraDato;
    }

    public LocalDate getTilDato() {
        return tilDato;
    }
}
