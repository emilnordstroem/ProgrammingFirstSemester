package opgave03;

import java.util.ArrayList;

public class Opgave03Main {
    public static void main(String[] args) {
        int[] intArray1 = {2, 4, 6, 8, 10, 12, 14};
        int[] intArray2 = {1, 2, 4, 5, 6, 9, 12, 17};

        System.out.println(generalMerge(intArray1, intArray2));
    }

    private static ArrayList<Integer> generalMerge(int[] sequence1, int[] sequence2){
        ArrayList<Integer> result = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        while(index1 < sequence1.length && index2 < sequence2.length) { // index1 is larger
            if (sequence1[index1] > sequence2[index2]) {
                index2++;
            } else if (sequence1[index1] < sequence2[index2]) { // index2 is larger
                index1++;
            } else { // index1 == index2
                result.add(sequence1[index1]);
                index1++;
                index2++;
            }
        }
        return result;
    }
}
