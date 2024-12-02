package opgave03.model;

import java.util.ArrayList;
import java.util.Random;

public class Car {
    private final String no; // registration number
    private final String year; // year of registration
    private int pricePerday;
    private ArrayList<Rental> rentalList = new ArrayList<>();

    public Car (String no, String year){
        this.no = no;
        this.year = year;
        this.pricePerday = priceGenerator();
    }

    public void setPricePerday(int pricePerday) {
        this.pricePerday = pricePerday;
    }

    public String getNo() {
        return no;
    }

    public String getYear() {
        return year;
    }

    public int getPricePerday() {
        return pricePerday;
    }

    private int priceGenerator(){
        Random price = new Random();
        return price.nextInt(1000) + 1;
    }
}
