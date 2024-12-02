package Opgave02;

import java.util.Arrays;
import java.util.Scanner;

public class opgave_02 {
    public static void main(String[] args) {
        // Declaration of scanner (reused twice)
        Scanner scanner = new Scanner(System.in);

        // Catch user input of array length
        System.out.print("Enter the number of values: ");
        int user_input_length = scanner.nextInt();

        // Create array with user_input_length
        int[] numbers_arr = new int[user_input_length];

        // Request for user prompt: values of elements
        System.out.println("Enter the numbers: ");

        // For loop for user input values
        for (int index = 0; index < user_input_length; index++) {
            numbers_arr[index] = scanner.nextInt(); // Add user value to array in index
        }

        if(isSorted(numbers_arr)){
            System.out.println("The list is sorted"); // Result
        } else {
            System.out.println("The list is not sorted");
        }
        System.out.print(user_input_length); // Length of user input
        System.out.println(Arrays.toString(numbers_arr)); // Array of user input
    }

    public static boolean isSorted(int[] arr) {

        boolean isSorted = true; // Variable to store boolean value

        // Outer loop: iterates over current element
        for (int i = 0; i < arr.length; i++) {
            // inner loop: iterates over upcoming element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // If current value is greater than upcoming element...
                    isSorted = false; // ... sorted re-assigned false
                    break; // Break the method
                }
            }
        }
        return isSorted; // return value of isSorted
    }
}
