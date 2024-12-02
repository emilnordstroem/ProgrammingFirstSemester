package opgave05;

// Importing arrays libary to solve task
import java.util.Arrays;

public class Opgave05 {
    public static void main(String[] args) {
        int[] numbers_array = {1, 4, 5, 2, 7, 3, 6, 8, 10, 9};

        int[] sorted_array = sorted(numbers_array);
        // Using array method to stringify content of sorted array
        System.out.println(Arrays.toString(sorted_array));
    }

    public static int[] sorted(int[] arr){
        // outer loop: iterates over current element
        for(int i = 0; i < arr.length; i++) {
            int temp = 0; // Temperary variable for swapping process
            // inner loop: iterates over upcoming element
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){ // If array index i is greater than array in index j
                    temp = arr[i]; // storing value in temp
                    arr[i] = arr[j]; // swapping values
                    arr[j] = temp; // setting value of j to value of temp
                }
            }
        }
        return arr; // Returning value
    }
}
