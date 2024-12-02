package Opgave_7;

public class opgave_7 {
    public static void main(String[] args){
        System.out.println("Task: 1.8");
        int radius = 6;
        double p = 3.14159;

        System.out.println("perimeter = 2 * " + radius + " * " + p);
        System.out.println("area = " + radius + " * " + radius + " * " + p);
        System.out.println("Area = " + (radius * radius * p));

        System.out.println("Task: 1.9");
        double width = 5.3;
        double height = 8.6;

        System.out.println("Area = " + width * height);
        System.out.println("Perimeter = " + 2 * (width + height));

        System.out.println("Task: 1.10");
        double mile_to_km = 15 / 1.6;
        double time = 50.5 / 60;
        System.out.print("Average speed in miles: " + mile_to_km / time);
    }
}