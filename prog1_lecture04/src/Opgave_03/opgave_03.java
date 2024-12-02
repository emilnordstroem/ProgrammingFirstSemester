package Opgave_03;

public class opgave_03 {
    public static void main (String[] args){
        // Global variable with number
        int number = 7;
        // Variable w. limitation
        int limit = 10;

        // Variable with method call (w. parameter)
        int calculation = table_row(number, limit); // method call w. two parameters
        System.out.println(calculation); // Output to user
    }

    public static int table_row (int number, int limit){

        int current_value = 0;

        while (current_value <= (number * limit)){ // Current number lower than number times limit (7 * 10 = 70)
            if(current_value > 0){ // Makes sure value 0 isn't included
                System.out.print("" + current_value + " "); // printf("parameter(modulus 4 spaces), parameter(current_value))
            }
            current_value += number;
        }
        return 0;
    }
}