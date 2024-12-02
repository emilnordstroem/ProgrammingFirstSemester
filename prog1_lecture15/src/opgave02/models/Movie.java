package opgave02.models;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie extends Superclass{
    private int productionYear;
    private Director director;
    private double rating;

    public Movie(String title, int productionYear, Director director, Genre[] genres,
                 double rating, ArrayList<Actor> cast) {
        super(title, genres, cast);
        this.productionYear = productionYear;
        this.director = director;
        this.rating = rating;
    }

    public Director getDirector() {
        return director;
    }

    // Task A
    @Override
    public String toString(){
        return "\nTitle: " + getTitle() + "\nProduction year: " + productionYear + "\nDirector: " + director
                + "\nGenres: " + Arrays.toString(getGenres()) + "\nRating: " + rating + "\nCast: " + getCast();
    }
}