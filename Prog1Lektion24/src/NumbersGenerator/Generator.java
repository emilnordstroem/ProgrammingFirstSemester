package NumbersGenerator;

import java.util.Random;

public class Generator {
    private static final Random random = new Random();

    public static int[] generateSortedIntArray(int size) {
        int[] generatedIntArray = new int[size];
        int nextInt = 0;
        for (int index = 0; index < size; index++) {
            nextInt += random.nextInt(0, 10);
            generatedIntArray[index] = nextInt;
        }
        return generatedIntArray;
    }

    public static int[] generateIntArray(int size) {
        int[] generatedIntArray = new int[size];
        for (int index = 0; index < size; index++) {
            generatedIntArray[index] = random.nextInt(Integer.MAX_VALUE);
        }
        return generatedIntArray;
    }
}
