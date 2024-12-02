package Opgave_06;

import java.util.Scanner;

public class opgave_06 {
    public static void main(String[] args){
        // Request for user input:
        System.out.print("Please enter an value of datatype integer: ");

        // Scanner to capture user prompt + variable to store data (int)
        Scanner user_input = new Scanner(System.in);
        int number = user_input.nextInt();

        int calculation = reverse(number); // calculation variable w. method call (number as parameter)
        System.out.println(calculation); // output to user: result of method invoke

        boolean palindrome = isPalindrome(calculation, number); // palidrone variable w. method call (calculation as parameter)

        // if-else statement for selecting outcome based on value of varibale palindrome
        if(palindrome){
            System.out.println("The value of " + number + " is a palidrome number."); // output to user: result of method invoke
        } else {
            System.out.println("The value of " + number + " isn't a palidrome number."); // output to user: result of method invoke
        }
    }
    public static int reverse(int number){ // value-returning method declaration
        // This method is copied and modified from task 5

        // sum variable to store result of iterations
        int reverse_number = 0;

        // while loop for iterating over number larger than 0
        while (number > 0){
            int extract_digit = number % 10; // variable for extracting last digit of number
            // reverse_number reassigned with value of ten times the value of reverse number + the extracted last digit
            reverse_number = (reverse_number * 10) + extract_digit;
            number /= 10; // Removing value by using division operator -> number = number / 10
        }
        return reverse_number; // returning value of sum to the method
    }
    public static boolean isPalindrome(int calculation, int number){ // value-returning method declaration

        // sum variable to store result of iterations
        int forward_number = number;
        int reverse_number = calculation;

        // if-else statement for selecting rather value of forward_number is equal to reverse_number
        if(forward_number == reverse_number){
            return true; // if true, return true to method
        } else {
            return false; // if false, return false to the method
        }
    }
}
