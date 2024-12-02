package opgave03.model;

import java.util.ArrayList;

public class Rental {
    private int no;
    private String date;
    private int days; // days of rental
    private ArrayList<Car> carsList = new ArrayList<>();

    public Rental(int no, String date, int days){
        this.no = no;
        this.date = date;
        this.days = days;
    }

    public int getNo() {
        return no;
    }

    public String getDate() {
        return date;
    }

    public int getPrice(Car car){
        return car.getPricePerday() * days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public ArrayList<Car> getCarsList() {
        return carsList;
    }

    public void addCarToList(Car car){
        if(!carsList.contains(car)){
            carsList.add(car);
        }
    }
}
