package opgave02;

import java.util.Scanner;

public class BookExercise2_1 {
    public static void main(String[] args) {
        // Create scanner for user promt.
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter number of miles: ");

        // Save promt in double variable
        double miles = user_input.nextDouble(); // .nextDouble() method (scans index for double datatype)

        // Create variable with converter
        double mile_to_km = miles * 1.6;

        // Print result of calculation to user
        System.out.println(miles + " miles is equal to " + mile_to_km);
    }
}
