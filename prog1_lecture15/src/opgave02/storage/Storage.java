package opgave02.storage;

import opgave02.models.Actor;
import opgave02.models.Movie;
import opgave02.models.TVSerie;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private ArrayList<TVSerie> series = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<Actor>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void addTVSerie(TVSerie serie) {
        series.add(serie);
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void printAllMovies(){
        System.out.println(movies);
    }
    public void printAllSeries(){
        System.out.println(series);
    }

    public void moviesFeatDirector(String name) {
        ArrayList<Movie> unmodifiedMovieList = getMovies();
        ArrayList<Movie> directorsMovieList = new ArrayList<>();
        for(Movie movie : unmodifiedMovieList){
            if(movie.getDirector().getName().equals(name)){
                directorsMovieList.add(movie);
            }
        }
        System.out.println(directorsMovieList);
    }
}
