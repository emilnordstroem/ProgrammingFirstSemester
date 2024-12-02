package Opgave_01;

public class opgave_01 {
    public static void main (String[] args){
        // Additional task parameter - global variable with limit
        int limit = 100;

        // Task A
        int calculation = evenNumbers(limit); // Additional task parameter
        System.out.println(calculation);

        // Task B
        calculation = qubicNumbers(limit);
        System.out.println(calculation); // Additional task parameter
    }
    public static int evenNumbers (int limit){ // Task A
        int number = 2; // start with the number 2 (description)
        int result = 0;
        while(number <= limit){ // while loop to iterate (2-100)
            result += number; // using additional assignment
            number += 2;
        }
        return result; // When loop break, result is passed to method
    }
    public static int qubicNumbers (int limit){ // Task B
        int number = 1; // start with the number 1 (description)
        int result = 0;
        while((number * number) < limit){ // while loop to iterate (square root under 100)
            result += (number * number); // using additional assignment operator
            number++;
        }
        return result; // When loop break, result is passed to method
    }
}
