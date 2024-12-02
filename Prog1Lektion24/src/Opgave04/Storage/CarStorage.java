package Opgave04.Storage;

import Opgave04.Models.Car;

import java.util.ArrayList;

public class CarStorage {
    private static ArrayList<Car> cars = new ArrayList<Car>();

    public CarStorage() {
        cars.add(new Car("Renault", "Clio", 222));
        cars.add(new Car("Skoda", "Fabia", 193));
        cars.add(new Car("Tesla", "Model Y", 250));
        cars.add(new Car("Tesla", "Model S", 261));
        cars.add(new Car("Polestar", "2", 160));
        cars.add(new Car("Mercedes", "CLE Coupé", 250));
        cars.add(new Car("Mercedes", "EQE", 210));
    }

    public Car higherTopSpeed(int topspeed){
        Car car = null;
        for(Car currentCar : cars){
            if(car == null && currentCar.getTopSpeed() > topspeed){
                car = currentCar;
            }
        }
        return car;
    }

    public Car searchBrand(String brand){
        Car car = null;
        for(Car currentCar : cars){
            if(currentCar.getBrand().equals(brand)){
                car = currentCar;
            }
        }
        return car;
    }
}
