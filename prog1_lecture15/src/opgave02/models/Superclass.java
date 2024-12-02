package opgave02.models;

import java.util.ArrayList;

// Task C

public class Superclass {
    private String title;
    private Genre[] genres;
    private ArrayList<Actor> cast;

    public Superclass (String title, Genre[] genres, ArrayList<Actor> cast){
        setTitle(title);
        setGenres(genres);
        setCast(cast);
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenres(Genre[] genres) {
        this.genres = genres;
    }
    public void setCast(ArrayList<Actor> cast) {
        this.cast = cast;
    }

    public String getTitle(){
        return title;
    }
    public Genre[] getGenres() {
        return genres;
    }
    public ArrayList<Actor> getCast() {
        return cast;
    }
}
