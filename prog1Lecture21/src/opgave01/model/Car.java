package opgave01.model;

import java.util.ArrayList;

public class Car {
    private String license;
    private double pricePerDay;
    private int purchaseYear;

    private ArrayList<Rental> rentalList = new ArrayList<>();

    public Car (String license, double pricePerDay, int purchaseYear){
        this.license = license;
        this.pricePerDay = pricePerDay;
        this.purchaseYear = purchaseYear;
    }

    public void addRental(Rental rental){
        rentalList.add(rental);
    }

    public int mostDaysRented(){
        ArrayList<Rental> carRentals = sortedArray(rentalList);
        // first element after decending order contains the largest number
        return carRentals.getFirst().getDays();
    }

    private ArrayList<Rental> sortedArray(ArrayList<Rental> rentalList){
        // bobble algorithm
        for (int outerIndex = 0; outerIndex < rentalList.size() - 1; outerIndex++) {
            for (int innerIndex = 0; innerIndex < rentalList.size() - outerIndex - 1; innerIndex++) {

                int currentRentalDays = rentalList.get(innerIndex).getDays();
                int nextRentalDays = rentalList.get(innerIndex + 1).getDays();

                if (currentRentalDays < nextRentalDays) {
                    Rental temp = rentalList.get(innerIndex);
                    rentalList.set(innerIndex, rentalList.get(innerIndex + 1));
                    rentalList.set(innerIndex + 1, temp);
                }
            }
        }
        return rentalList;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getLicense() {
        return license;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }
}
