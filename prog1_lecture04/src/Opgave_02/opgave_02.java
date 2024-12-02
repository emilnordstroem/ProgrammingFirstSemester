package Opgave_02;

public class opgave_02 {
    public static void main (String[] args){
        // Additional task parameter - global variable with limit
        int limit = 10;

        // Task A
        int calculation = fibonacciNumber(limit); // Additional task parameter
        System.out.println(calculation);
    }

    public static int fibonacciNumber (int limit){

        int position = 0; // Position of Fib(x)

        int previous_number = 0; // store previous number in iteration
        int now_number = 1; // Start at 1
        int next_number;

        while(position < limit){ // While position smaller than determined limit...
            next_number = now_number + previous_number; // declare next number in iteration
            previous_number = now_number; // Re-assign variable to now_number
            now_number = next_number; // Re-assign variable to next_number (now + previous)

            position++; // position before print, because fib(1) is already declared
            System.out.println("Fib(" + position + ") = " + now_number); // Output to user
        }
        return now_number ; // Return value of now_number to method
    }
}
