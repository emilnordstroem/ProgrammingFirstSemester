package opgave03;
import java.util.Scanner;

public class Opgave03 {
    public static void main (String[] args){
        // Display of date system: sun = 0 (first index) ... sat = 6
        System.out.println("Hello, the days are numbered as followed: ");
        System.out.println("Sun: 0, Mon: 1, Tue: 2, Wed: 3, Thu: 4, Fri: 5, Sat: 6");
        // Scanner for first user input (today) + request for prompt (int)
        // Variable for user_input_today
        Scanner user_input_today = new Scanner(System.in);
        System.out.print("Insert today: "); // request for prompt
        int today = user_input_today.nextInt(); // Declare variables for input

        // Scanner for second user input (x days in the future) + request for prompt (int)
        // Variable for user_input_future
        Scanner user_input_future = new Scanner(System.in);
        System.out.print("Insert number of days since today: "); // request for prompt
        double days_from_today = user_input_future.nextDouble(); // Declare variables for input

        // Array for day of the week: 0 = sun, 1 = mon etc.
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Friday"};

        // Variable for calculating the future day
        double future_day = (today + days_from_today) % 7;

        System.out.println("Today is " + days[today] + " and " + days_from_today + " days from now is " + days[(int)future_day] + ".");
    }
}
