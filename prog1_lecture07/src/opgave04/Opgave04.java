package opgave04;

public class Opgave04 {
    public static void main(String[] args) {
        char[] romanNumber = {'M', 'L', 'X', 'I'}; //1061
        System.out.println(romanNumberToArabicNumber(romanNumber));
    }

    private static int romanNumberToArabicNumber(char[] romanNumber) {
        //Din implementering her.
        int sum = 0; // Sum equals 0
        for(int i = 0; i < romanNumber.length; i++){ // iterates over index of romanNumber
            char letter = romanNumber[i]; // character letter = index og array
            sum += SingleRomanNumberToArabicNumber(letter); // sum additional operator to the value
        }
        return sum; // returning sum to the method
    }

    private static int SingleRomanNumberToArabicNumber(char roman) {
        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException(roman + " is not a valid roman number literal.");
        };
    }
}
