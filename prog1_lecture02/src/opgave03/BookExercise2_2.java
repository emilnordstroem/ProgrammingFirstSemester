package opgave03;

import java.util.Scanner;

public class BookExercise2_2 {
    public static void main(String[] args) {
        // Create scanner + ask for user prompt
        Scanner user_input = new Scanner(System.in);
        System.out.print("Insert length of the sides of a triangle: ");

        // Create variable to save user promt
        double length = user_input.nextDouble(); // .nextDouble() method (scans index for double datatype)

        // Create variable for computing area (Math.sqrt(3), Math.pow(2))
        double area = (Math.sqrt(3) / 4) * Math.pow(length, 2);

        // Create variable for computing volume
        double volume = area * length;

        // Present result to user with string
        System.out.println("The area of the triangle is: " + area);
        System.out.println("The volume of the triangle is: " + volume);
    }
}
