package opgave01.model;

import java.util.ArrayList;
import java.util.Random;

public class Rental {
    private int number;
    private int days;
    private String date;

    private ArrayList<Car> carList = new ArrayList<>();
    private final Random random = new Random();

    public Rental(){
        this.number = generateRandomNumber();
        this.days = generateRandomDays();
        this.date = date;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPrice() {
        return number;
    }

    public int getDays() {
        return days;
    }

    // Generator methods
    private int generateRandomNumber(){
        return random.nextInt(1111, 9999) + 1;
    }

    private int generateRandomDays(){
        return random.nextInt(1, 100) + 1;
    }

    private String generateRandomDate(){
        int year = random.nextInt(2015, 2024) + 1;
        int month = random.nextInt(1,12) + 1;
        int day = random.nextInt(1, 31) + 1;
        return String.format("%d/%d/%d", year, month, day);
    }
}
