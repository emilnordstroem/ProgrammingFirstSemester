package opgave02.models;

import java.util.ArrayList;
import java.util.Arrays;

public class TVSerie extends Superclass {
    private int numberOfSeasons;

    public TVSerie(String title, int numberOfSeasons, Genre[] genres, ArrayList<Actor> cast) {
        super(title, genres, cast);
        this.numberOfSeasons = numberOfSeasons;
    }

    // Task A
    @Override
    public String toString(){
        return "Title: " + getTitle() + "\nNumber of seasons: " + numberOfSeasons +
                "\nGenres: " + Arrays.toString(getGenres()) + "\nCast: " + getCast();
    }
}