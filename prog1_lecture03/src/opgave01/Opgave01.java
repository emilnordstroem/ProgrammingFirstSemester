package opgave01;

import java.util.Scanner;

public class Opgave01 {
    public static void main(String[] args) {
        // Create scanner for input (age)
        Scanner user_input_age = new Scanner(System.in);
        System.out.print("Insert age: "); // request for prompt
        int age = user_input_age.nextInt(); // Declare variables for input

        // Create scanner for input (percent)
        Scanner user_input_percent = new Scanner(System.in);
        System.out.print("Insert percent: "); // request for prompt
        double percent = user_input_percent.nextDouble(); // Declare variables for input

        if (percent > 1.2) { // if statement: under 1.2 all allowed to purchase
            if(age < 16){
                // Output to user: Not Allowed
                System.out.println("This beverage is not legally allowed to be sold to you.");
            } else if(percent <= 16.5 && age >= 16 && age < 18){
                // Output to user: Allowed
                System.out.println("This beverage is legally allowed to be sold to you.");
            } else if (percent > 16.5 && age >= 16 && age < 18){
                // Output to user: Not Allowed
                System.out.println("This beverage is not legally allowed to be sold to you.");
            } else if (percent > 16.5 && age >= 18){
                // Output to user: Allowed
                System.out.println("This beverage is legally allowed to be sold to you.");
            }
        } else {
            // Output to user: All allowed
            System.out.println("This beverage is legally allowed to be sold to you.");
        }
    }
}
