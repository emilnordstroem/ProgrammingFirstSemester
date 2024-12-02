package opgave03;

public class Fan {
    // Private constant variables for fan spped
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;

    // Private variables (see default methods)
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Constructor method for default fan
    Fan(){
        defaultSpeedValue();
        defaultOnValue();
        defaultRadiusValue();
        defaultColorValue();
    }

    // Default methods for values of speed, on, radius, color
    private void defaultSpeedValue (){
        this.speed = 1;
    }
    private void defaultOnValue(){
        this.on = false;
    }
    private void defaultRadiusValue(){
        this.radius = 5;
    }
    private void defaultColorValue(){
        this.color = "blue";
    }

    // Constructor method for fan
    Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Setter methods for speed, on, radius, color
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // getter methods for speed, on, radius, color
    public int getSpeed() {
        return speed;
    }
    public boolean getOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    // method for returning string description of a fan
    public static String toString(Fan fan){
        if(fan.getOn()){
            return "The fan is on and the speed of the fan is " + fan.getSpeed() + ". The color of the fan is " + fan.getColor() + " the radius is " + fan.getRadius();
        } else {
            return "The fan is not on";
        }
    }

}
