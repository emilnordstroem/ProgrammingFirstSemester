package opgave05;

import java.util.ArrayList;

public class StackOfIntegers {
    private int integerValue;

    // Constructor method for integer
    StackOfIntegers(int integerValue){
        this.integerValue = integerValue;
    }

    // Getter method for accessing integerValue of object
    public int getIntegerValue() {
        return integerValue;
    }

    // Method for constructing array with divisors
    public static ArrayList<Integer> divisors(int integerValue){
        // Using arrayList class to construct new arrayList
        ArrayList <Integer> divisorsArray = new ArrayList<>();

        // iteration over index in array - using squareRoot to find last possible divisor
        for(int index = 1; index <= Math.sqrt(integerValue); index++){
            // If value divided with value of index equal 0
            if(integerValue % index == 0){
                // using add method to store value of index in array
                divisorsArray.add(index);
            }
        }
        // Returning value of method invoke for sorting array in descending order
        return(descendingArray(divisorsArray));
    }

    // Method for descending the arrayList
    private static ArrayList<Integer> descendingArray (ArrayList<Integer> array){

        // outer loop: iterates over current element
        for(int outerIndex = 0; outerIndex < array.size(); outerIndex++) {
            int temp = 0; // Temperary variable for swapping process
            // inner loop: iterates over upcoming element
            for(int innerIndex = outerIndex + 1; innerIndex < array.size(); innerIndex++){
                if(array.indexOf(outerIndex) > array.indexOf(innerIndex)){ // If array index i is greater than array in index j
                    temp = array.indexOf(outerIndex); // storing value in temp
                    array.set(outerIndex, array.get(innerIndex)); // Swap values using set (index, to index og innerIndex
                    array.set(innerIndex, temp); // Set the value of innerIndex to temp
                }
            }
        }
        return array; // Returning value
    }
}
