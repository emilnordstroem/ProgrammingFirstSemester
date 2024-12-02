package opgave01;

import java.util.Scanner;

public class CalculateVat {
    public static void main(String[] args) {
        //Beskriv din algoritme

        /* Step 1: Ask promt from user (whole number)
        and create int variable for input */
        Scanner user_input = new Scanner(System.in);
        System.out.print("For calculation, enter whole no. in DKK: ");
        int number = user_input.nextInt();

        // Step 2: Create double variable with VAT (0.25)
        double vat = 0.25;

        // Step 3: Save result of (number * vat)
        double vat_amount = number * vat;

        // Step 4: present result to user
        System.out.println("Tax of " + number + ": " + vat_amount);
    }
}
