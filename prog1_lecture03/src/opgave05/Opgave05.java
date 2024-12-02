package opgave05;

import java.util.Scanner;

public class Opgave05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast nypris: ");
        int price = input.nextInt();
        double registrationFee = calculateFee(price);
        System.out.println("En bil der koster " + price + " uden registreringsafgift, skal man betale " +
                registrationFee + " i registreringsafgift.");
    }

    public static double calculateFee(int price) {

        // Variables for class_price (Class b is the value between class a and c)
        int class_a = 67800;
        int class_c = 210600;

        // Variables for class_tax_rates
        double class_a_tax = 0.25;
        double class_b_tax = 0.85;
        double class_c_tax = 1.5;

        // variable for taxed_amount
        double taxed_amount = 0;

        // if else statement to determined tax class
        if (price <= class_a) {
            taxed_amount = price * class_a_tax; // price * 0.25
            return taxed_amount;
        } else if (price <= class_c) {
            taxed_amount = class_a * class_a_tax; // copied from first last block
            taxed_amount += (price - class_a) * class_b_tax; // taxed_amount = taxed_amount + value of calculation
            return taxed_amount;
        } else { // This car is above class c
            taxed_amount = class_a * class_a_tax; // copied from previous block
            taxed_amount += (class_c - class_a) * class_b_tax; /* modified from previous block (class_c insted of price)
                                                                  I want the amount in bewteen class a and c. */
            taxed_amount += (price - class_c) * class_c_tax; // taxed_amount = taxed_amount + value of calculation
        }

        return taxed_amount; // Return the value of taxed_amount the method - presented as argument to the method
    }
}
