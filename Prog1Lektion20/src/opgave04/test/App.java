package opgave04.test;

import opgave04.model.Episode;
import opgave04.model.Series;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        String[] actors = {"Josh Radnor", "Jason Segel", "Cobie Smulders", "Neil Patrick Harris"};
        ArrayList<String> castList = new ArrayList<>();
        for(int index = 0; index < actors.length; index++){
            castList.add(actors[index]);
        }
        Series howIMeetYourMother = new Series("How I Meet Your Mother", castList);

        String[] guestActors = {"Britney Spears", "Katy Perry", "Jennier Lopes", "Neil Patrick Harris"};
        for(int index = 0; index < guestActors.length; index++){
            ArrayList<String> guestList = new ArrayList<>();
            guestList.add(guestActors[index]);
            howIMeetYourMother.addEpisode(index + 1, guestList, 22);
        }
        System.out.println(String.format("%s %s%s %d %s","Total length of", howIMeetYourMother.getTitle(), ":", howIMeetYourMother.totalLength(), "minutes"));
        System.out.println(String.format("%s %s%s %s", "All guest actors of", howIMeetYourMother.getTitle(), ":", howIMeetYourMother.getAllGuestActors()));
    }
}
