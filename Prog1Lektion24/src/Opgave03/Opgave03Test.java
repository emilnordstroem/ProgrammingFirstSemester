package Opgave03;

public class Opgave03Test {
    public static void main(String[] args) {
        int[] testArray1 = { 23, 54, 23, 975, 2, 13 }; //false
        boolean result = twoInARow(testArray1);
        printResult(result);

        int[] testArray2 = { 42, 51, 45, 45, 42, 17 }; //true
        result = twoInARow(testArray2);
        printResult(result);
    }

    public static boolean twoInARow(int[] arr){
        boolean found = false;
        int index = 0;
        int nextIndex = 1;
        while(index < arr.length - 1){
            if(arr[index] == arr[nextIndex]){
                found = true;
            }
            index++;
            nextIndex++;
        }
        return found;
    }

    public static void printResult(boolean result){
        if(result){
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
