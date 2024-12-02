package Opgave04;

import Opgave04.Models.Car;
import Opgave04.Storage.CarStorage;

public class Opgave04Test {
    public static void main(String[] args) {
        CarStorage carStorage = new CarStorage();

        Car car1 = carStorage.higherTopSpeed(200);
        if(car1 != null){
            System.out.println("Opgave 4.1: " + car1.toString());
        } else {
            System.out.println("Opgave 4.1: Null");
        }

        Car car2 = carStorage.searchBrand("Polestar");
        if(car2 != null){
            System.out.println("Opgave 4.2: " + car2.toString());
        } else {
            System.out.println("Opgave 4.2: Null");
        }
    }
}
