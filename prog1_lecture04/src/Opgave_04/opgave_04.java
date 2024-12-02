package Opgave_04;

public class opgave_04 {
    public static void main (String[] args){

        int pattern;

        pattern = pattern_A();
        System.out.println(pattern);

        pattern = pattern_B();
        System.out.println(pattern);

        pattern = pattern_C();
        System.out.println(pattern);

        pattern = pattern_D();
        System.out.println(pattern);

    }

    public static int pattern_A (){

        int total_lines = 6; // Number of total lines in the pattern
        int current_line = 1; // Starting point is line 1

        // Outer while loop for determining if all lines are produced
        while(current_line <= total_lines){
            int characters = 1; // starting point is 1 character

            while(characters <= current_line){ // while character is lower than current lines
                System.out.print(" *"); // output to user
                characters++; // increment operator to add 1 onto characters
            }
            System.out.println(); // new line for each line
            current_line++; // increment operator to add 1 onto current lines
        }
        return 0;
    }
    public static int pattern_B (){ // This code is modified from Pattern A (reversing)

        int total_lines = 6; // Number of total lines in the pattern
        int current_line = 1; // Starting point is line 1

        // Outer while loop for determining if all lines are produced
        while(current_line <= total_lines){
            int characters = 6; // starting point is 6 character

            while(characters >= current_line){ // while character is larger/equal than current lines
                System.out.print(" *"); // output to user
                characters--; // decrement operator to remove 1 from characters
            }
            System.out.println(); // new line for each line
            current_line++; // increment operator to add 1 onto current lines
        }
        return 0;
    }
    public static int pattern_C (){
        int total_lines = 6; // Number of total lines in the pattern
        int current_line = 1; // Starting point is line 1

        // Outer while loop for determining if all lines are produced
        while(current_line <= total_lines){
            int space = 5; // starting point is 5 spaces
            int character = 1; // Starting point is 1 character

            // Inner while loop for space
            while(space >= current_line){ // while space is larger/equal than current lines
                System.out.print("  "); // output to user
                space--; // decrement operator to remove 1 from spaces
            }

            // Inner while loop for characters
            while(character <= current_line){ // while character is lower/equal to current line
                System.out.print(" *"); // print star
                character++; // increment operator to add q to character
            }

            System.out.println(); // new line for each line
            current_line++; // increment operator to add 1 onto current lines
        }
        return 0;
    }
    public static int pattern_D (){
        int total_lines = 6; // Number of total lines in the pattern
        int current_line = 1; // Starting point is line 1

        // Outer while loop for determining if all lines are produced
        while(current_line <= total_lines){
            int space = 1; // starting point is 1 spaces
            int character = 6; // Sparting with 6 characters

            while(space < current_line){ // while space is lower than current lines
                System.out.print("  "); // output to user
                space++; // increment operator to remove 1 from spaces
            }

            while(character >= current_line){ // while character is larger/equal to current line
                System.out.print(" *"); // print star
                character--; // decrement operator to add q to character
            }

            System.out.println(); // new line for each line
            current_line++; // increment operator to add 1 onto current lines
        }
        return 0;
    }
}
