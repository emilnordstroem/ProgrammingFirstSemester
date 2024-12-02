package opgave05;

import java.util.Scanner;

public class Opgave05 {
    /*
    (Display the divisors)
    Write a program that prompts the user to enter a positive integer and displays all its divisors in decreasing order.
    For example, if the integer is 12 the divisors are displayed as 6, 4, 3, 2, 1. Use the StackOfIntegers class to store
    the factors (e.g., 1, 2, 3, 4, 6) and retrieve and display them in reverse order.
     */

    public static void main(String[] args) {
        // Requesting user for prompt => storing integer value in variable integerValue
        System.out.print("Enter a positive integer: ");
        int integerValue = userInputRequest();

        // Constructs new object with value of user input
        StackOfIntegers newStackOfIntegers = new StackOfIntegers(integerValue);

        // Method invoke for printing descending array of divisors
        printArray(newStackOfIntegers.getIntegerValue()); // argument of getter method
    }

    // Method for requesting user input through scanner
    private static int userInputRequest(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // Method for printing stack of integer
    public static void printArray(int integerValue){
        System.out.println(StackOfIntegers.divisors(integerValue));
    }

}
