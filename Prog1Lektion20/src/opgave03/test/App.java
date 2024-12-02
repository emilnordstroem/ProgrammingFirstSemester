package opgave03.test;

import opgave03.model.*;

import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Rental rental = new Rental(2023, "01/11/24", 30);

        String[] carNames = {"Honda", "Tesla", "Audi", "Porsche"};
        String[] carYear = {"2001", "2020", "2023", "2023"};

        for(int index = 0; index < carNames.length; index++){
            Car car = new Car(carNames[index], carYear[index]);
            rental.addCarToList(car);
        }

        for(Car car : rental.getCarsList()){
            System.out.println("Price per day for " + car.getNo() + ": " + car.getPricePerday());
        }
    }
}