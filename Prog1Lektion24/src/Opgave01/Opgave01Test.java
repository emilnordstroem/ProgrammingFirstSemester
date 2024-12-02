package Opgave01;

import NumbersGenerator.Generator;

public class Opgave01Test {
    public static void main(String[] args) {
        int[] intArray = {2, 4, 16, 8, 10};
        boolean result = containsUnevenNumber(intArray);
        printResult(result);
        int [] intArray2 = { 42, 67, 12, 103 };
        result = containsUnevenNumber(intArray2);
        printResult(result);

        // Opgave02
        int[] intArray3 = {1, 2, 2, 3, 10, 4, 5, 6, 7, 8, 9, 12, 20};
        int result1 = firstBetween10and15(intArray3, 1, 5);
        printResultOpgave02(result1);
    }

    private static void printResult(boolean result) {
        if (result) {
            System.out.println("Listen indeholder et ulige tal.");
        } else {
            System.out.println("Listen indeholder ikke et ulige tal.");
        }
    }

    public static boolean containsUnevenNumber(int[] candidates) {
        int index = 0;
        while (index < candidates.length) {
            if (!(candidates[index] % 2 == 0)) {
                 return true;
            } else {
                index++;
            }
        }
        return false;
    }

    // Opgave 2
    public static int firstBetween10and15(int[] candidates, int startIndex, int endIndex){
        int index = -1;
        int left = startIndex;
        int right = endIndex;
        while(index == -1 && left <= right){
            int middle = (left + right) / 2;
            int candidateElement = candidates[middle];
            if(candidateElement >= 10 && candidateElement <= 15){
                index = candidateElement;
            } else if(candidateElement > 15) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return index;
    }
    private static void printResultOpgave02(int result) {
        System.out.println(result);
    }
}
