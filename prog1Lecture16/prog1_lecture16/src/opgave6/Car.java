package opgave6;

public class Car {
    private String make;
    private String model;
    private boolean electric;
    private int price;

    public Car (String make, String model, boolean electric, int price){
        setMake(make);
        setModel(model);
        setElectric(electric);
        setPrice(price);
    }

    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setElectric (boolean electric){
        this.electric = electric;
    }
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("%s, %s, Electric: %s, Price per day: %d", make, model, electric, price);
    }
}
