package Opgave05;

public class SearchAlgorithm {
    public static int largestWholeNumberLinear(int number){
        int r = 0;
        while((r * r) <= number){ // Squareroot
            r += 1;
        }
        return r - 1;
    }
    public static int largestWholeNumberBinary(int number){
        int r = 0;
        int left = 0;
        int right = number;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (middle * middle <= number) { // Squareroot
                r = middle;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return r;
    }

}
