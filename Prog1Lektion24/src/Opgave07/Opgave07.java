package Opgave07;

public class Opgave07 {
    public static void main(String[] args) {
        String searchString = "Hello";
        System.out.println(consistance(searchString, 2));
    }

    public static boolean consistance(String string, int number){
        int index = 1;
        int counter = 0;
        while(index < string.length()){
            char currentChar = string.charAt(index);
            char previousChar = string.charAt(index - 1);
            if(currentChar == previousChar){
                counter++;
                if(counter == number){
                    // Don't wish to iterate through the rest of the array if critiria meet
                    // Therefore not using varibale boolean found
                    return true;
                }
            } else {
                counter = 1;
            }
            index++;
        }
        return false;
    }
}
