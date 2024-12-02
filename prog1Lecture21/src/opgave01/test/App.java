package opgave01.test;

import opgave01.model.Car;
import opgave01.model.Rental;

public class App {
    public static void main(String[] args) {
        Car porsheTaycan = new Car("EV 58 957", 895,2022);
        for(int counter = 0; counter < 10; counter++){
            porsheTaycan.addRental(new Rental());
        }

        System.out.println(porsheTaycan.mostDaysRented());
    }
}
