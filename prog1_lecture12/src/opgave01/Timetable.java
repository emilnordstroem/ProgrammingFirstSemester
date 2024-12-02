package opgave01;

import java.time.LocalTime;

public class Timetable {
    public static void main(String[] args) {
        Departure[] departures = getDepartures();
        printDepartures(departures);
    }

    private static void printDepartures(Departure[] departures) {
        System.out.println("Destination | Peron | Ankomst | Afgang");
        for (Departure departure : departures) {
            System.out.printf("%12s", departure.destination);
            System.out.printf("%6d", departure.perron);
            System.out.printf("%11s", departure.arrival);
            System.out.printf("%9s\n", departure.departure);
        }
    }

    private static Departure[] getDepartures() {
        Departure[] departures = new Departure[8];
        departures[0] = new Departure(1, "København H", LocalTime.of(7, 57), LocalTime.of(8, 4));
        departures[1] = new Departure(2, "Aalborg", LocalTime.of(8, 3), LocalTime.of(8, 10));
        departures[2] = new Departure(1, "København H", LocalTime.of(8, 32), LocalTime.of(8, 40));
        departures[3] = new Departure(2, "Skjern", LocalTime.of(8, 46), LocalTime.of(8, 52));
        departures[4] = new Departure(1, "København H", LocalTime.of(8, 57), LocalTime.of(9, 4));
        departures[5] = new Departure(2, "Aalborg", LocalTime.of(9, 3), LocalTime.of(9, 10));
        departures[6] = new Departure(1, "København H", LocalTime.of(9, 32), LocalTime.of(9, 40));
        departures[7] = new Departure(2, "Skjern", LocalTime.of(9, 46), LocalTime.of(9, 52));

        return departures;
    }
}
