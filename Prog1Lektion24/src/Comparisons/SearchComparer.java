package Comparisons;
import NumbersGenerator.Generator;

public class SearchComparer {
    public static void main(String[] args) {
        int[] ints = Generator.generateSortedIntArray(100000000);
        long startTime = System.nanoTime();
        IntSearch.linearSearchArray(ints, -1);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration/1000 + " millisekunder");
        startTime = System.nanoTime();
        IntSearch.binarySearchArray(ints, -1);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration/1000 + " millisekunder");
    }
}
