package Opgave01;

import java.util.Arrays;
import java.util.Scanner;

public class opgave_01 {
    public static void main (String[] args){
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
        for(int index = 0; index < user_input_length; index++){
            numbers_arr[index] = scanner.nextInt(); // Add user value to array in index
        }

        // Checking if array is constructed correctly
        System.out.println(Arrays.toString(numbers_arr));

        // Print out result of method to user
        System.out.println(isConsecutiveFour(numbers_arr));
    }

    public static boolean isConsecutiveFour (int[] arr){

        boolean isConsecutiveFour = false; // Default false

        if(arr.length > 3){ // If array greater than 3
            int counter = 0; // Counter for controle
            
            // For loop for iterating over index of arr parameter
            for(int index = 0; index < arr.length; index++){
                if(arr[index] == arr[index] - 1){ // if value of index in array equal to previous value
                    counter++; // counter additional assignment operator
                    if(counter == 4){ // If counter reaches 4...
                        isConsecutiveFour = true; // set value to true
                        break; // Break method
                    }
                }
            }
        }
        return isConsecutiveFour; // Return value of isConsecutiveFour
    }
}
