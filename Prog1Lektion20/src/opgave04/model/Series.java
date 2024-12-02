package opgave04.model;

import java.util.ArrayList;

public class Series {
    private final String title;
    private ArrayList<String> cast = new ArrayList<>();
    private final ArrayList<Episode> episodes;

    public Series (String title, ArrayList<String> cast) {
        this.title = title;
        this.cast = cast;
        this.episodes = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    public int totalLength(){
        int sum = 0;
        for(Episode episode : episodes){
            sum += episode.getLengthMinutes();
        }
        return sum;
    }

    public ArrayList<String> getAllGuestActors(){
        ArrayList<String> allGuestActors = new ArrayList<>();
        for(Episode episode : episodes){
            ArrayList<String> episodeGuestActors = episode.getGuestActors();
            for(String guestActor : episodeGuestActors){
                allGuestActors.add(guestActor);
            }
        }
        return allGuestActors;
    }

    public void addEpisode (int number, ArrayList<String> guestActors, int lengthMinutes){
        Episode episode = new Episode(number, guestActors, lengthMinutes);
        if(!episodes.contains(episode)) {
            episodes.add(episode);
        }
    }
}
