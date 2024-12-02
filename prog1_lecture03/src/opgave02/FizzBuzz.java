package opgave02;

import java.util.zip.CRC32;

public class FizzBuzz {
    public static void main(String[] args) {
        int currentNumber = 1;
        while (currentNumber <= 40) {
            //Indsæt din implementering af FizzBuzz her.
            double fizz = 3; // Variable for fizz
            double buzz = 5; // Variable for buzz

            if(currentNumber % fizz == 0 && currentNumber % buzz == 0){ /* both boolean value, true...
                ... Print to user */
                System.out.println("FizzBuzz");
            } else if (currentNumber % fizz == 0){ /* fizz value, true...
                ... Print to user */
                System.out.println("Fizz");
            } else if (currentNumber % buzz == 0){ /* buzz value, true...
                ... Print to user */
                System.out.println("Buzz");
            } else { /* Both false...
                .. print current number to user */
                System.out.println(currentNumber);
            }
            currentNumber++;
        }
    }
}
