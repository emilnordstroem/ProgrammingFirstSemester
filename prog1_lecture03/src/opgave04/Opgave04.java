package opgave04;

import java.util.Scanner;

public class Opgave04 {
    public static void main (String[] args){
        // Scanner for user_input + request for user prompt
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter either Rock (0), Paper (1), Scissor (2): ");

        // Variables for tools with value
        int rock = 0;
        int paper = 1;
        int scissor = 2;

        // Variable (int) for user_input + variable for opponent (.random() method)
        int user_input_tool = user_input.nextInt();
        int computer_random_tool = (int)(Math.random() * 4); /* multiply by four to make sure last index is represented
                                                                3.9 is determined to 3 (int value) */

        // if-else statements to determined who won the game -> each scope includes an output message to user
        if(user_input_tool == computer_random_tool){
            // Draw
            System.out.println("It's a draw");
        } else if(user_input_tool == rock && computer_random_tool == paper){
            // User lost
            System.out.println("You Lost");
        } else if (user_input_tool == paper && computer_random_tool == rock) {
            // Computer lost
            System.out.println("Computer Lost");
        } else if (user_input_tool == scissor && computer_random_tool == rock){
            // User lost
            System.out.println("You Lost");
        } else if (user_input_tool == rock && computer_random_tool == scissor){
            // Computer lost
            System.out.println("Computer Lost");
        } else if (user_input_tool == scissor && computer_random_tool == paper){
            // User lost
            System.out.println("You Lost");
        } else if (user_input_tool == paper && computer_random_tool == scissor) {
            // Computer lost
            System.out.println("Computer Lost");
        }
    }
}
