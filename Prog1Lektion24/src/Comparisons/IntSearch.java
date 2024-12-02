package Comparisons;

public class IntSearch {
    public static boolean linearSearchArray(int[] candidates, int target) {
        int index = 0;
        while (index < candidates.length) {
            if (candidates[index] == target) {
                return true;
            } else {
                index++;
            }
        }
        return false;
    }

    public static int binarySearchArray(int[] arr, int target) {
        int indeks = -1;
        int left = 0;
        int right = arr.length-1;
        while (indeks == -1 && left <= right) {
            int middle = (left + right) / 2;
            int k = arr[middle];
            if (k == target)
                indeks = middle;
            else {
                if (k > target)
                    right = middle - 1;
                else
                    left = middle + 1;
            }
        }
        return indeks;
    }
}