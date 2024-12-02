package Opgave03;

import java.util.Scanner;
import java.util.Arrays;

public class opgave_03 {
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
        for(int index = 0; index < user_input_length; index++){
            numbers_arr[index] = scanner.nextInt(); // Add user value to array in index
        }

        int[] reveredArray = reverseArray(numbers_arr);
        System.out.println(Arrays.toString(reveredArray));

    }

    public static int[] reverseArray (int[] arr){

        int[] new_result = add_to_array(arr); // method to copy array
        int arr_length = new_result.length;

        // outer loop: iterates over current element
        for(int i = 0; i < arr_length; i++) {
            // inner loop: iterates over upcoming element
            for (int j = i + 1; j < arr_length; j++) {
                if (new_result[i] < new_result[j]) { // If array index i is lower than array in index j
                    int temp = new_result[i]; // // Temperary variable for swapping process - storing value in temp
                    new_result[i] = new_result[j]; // swapping values
                    new_result[j] = temp; // setting value of j to value of temp
                }
            }
        }
        return new_result; // Returning value
    }

    public static int[] add_to_array (int[] arr){
        int[] array_copy = new int[arr.length];

        /*
        build in arraycopy method: Add user value to array in index
        System.arraycopy(arr, 0, array_copy, 0, arr.length);
        Index 0 (srcPos and pestPos): starting points in both arrays
         */
        System.arraycopy(arr, 0, array_copy, 0, arr.length);

        return array_copy;
    }

}
