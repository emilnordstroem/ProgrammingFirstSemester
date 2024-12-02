package opgave01;

public class Opgave01 {
    public static void main(String[] args) {
        int[] integerArray = getIntegerArray();
    }

    // Task A
    private static int[] getIntegerArray() {
        int[] integerArray =  { 1095, 12, 9065, 387, 700, 20, 5, 2065, 97654, 103, 789, 50, 1972, 200, 35, 98, 1002 };

        // Task A
        // print_array(integerArray);

        // Task B
        // sum_of_array(integerArray);

        // Task C
        // avg_of_array(integerArray);

        // Task E
        // sum_of_digits(integerArray);

        // Task D
        // gross_digits(integerArray);

        return integerArray;
    }

    // Task A
    public static void print_array(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
    }

    // Task B
    public static int sum_of_array(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Task C
    public static void avg_of_array (int[] arr){
        int sum = 0;
        int avg;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        avg = sum / arr.length;

        System.out.println(avg);
    }

    // Task E
    public static int[] sum_of_digits(int[] arr){ // value-returning method declaration

        // sum variable to store result of iterations
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                int extract_digit = arr[i] % 10; // variable for extracting last digit of number
                sum += extract_digit;  // sum = sum + extract_digit
                arr[i] /= 10; // Removing value by using division operator -> number = number / 10
            }
            System.out.println(sum);
            sum = 0;
        }
        return arr;
    }

    // Task D
    public static int[] gross_digits(int[] arr){ // value-returning method declaration

        // sum variable to store result of iterations
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            while(arr[i] >= 10){
                sum = 0;
                while(arr[i] > 0){
                    sum = arr[i] % 10; // variable for extracting last digit of number
                    arr[i] /= 10; // Removing value by using division operator -> number = number / 10
                }
                arr[i] = sum; // index of array = 0 before next iteration
            }
            System.out.println(sum);
        }
        return arr;
    }
}
