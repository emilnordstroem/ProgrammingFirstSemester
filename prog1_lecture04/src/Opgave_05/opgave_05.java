package Opgave_05;

import java.util.Scanner;

public class opgave_05 {
    public static void main(String[] args){
        // Request for user input:
        System.out.print("Please enter an value of datatype integer: ");

        // Scanner to capture user prompt + variable to store data (int)
        Scanner user_input = new Scanner(System.in);
        int number = user_input.nextInt();

        int calculation = sumDigits(number); // calculation variable w. method call (number as parameter)
        System.out.println(calculation); // output to user: result of method invoke
    }
    public static int sumDigits(int number){ // value-returning method declaration

        // sum variable to store result of iterations
        int sum = 0;

        // while loop for iterating over number larger than 0
        while (number > 0){
            int extract_digit = number % 10; // variable for extracting last digit of number
            sum += extract_digit;  // sum = sum + extract_digit
            number /= 10; // Removing value by using division operator -> number = number / 10
        }
        return sum; // returning value of sum to the method
    }
}

