package opgave03;

import java.sql.SQLOutput;
import java.util.Currency;
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

        // Variables for day of the week
        int sun = 0;
        int mon = 1;
        int tue = 2;
        int wed = 3;
        int thu = 4;
        int fri = 5;
        int sat = 6;

        // Variable for calculating the future day
        double future_day = (today + days_from_today) % 7;

        // Variables for today string and future day string
        String today_name = "";
        String future_day_name = "";

        // if else statements for selection over user_input_today
        if(today == sun){
            today_name = "Sunday";
        } else if (today == mon){
            today_name = "Monday";
        } else if (today == tue){
            today_name = "Tuesday";
        } else if (today == wed){
            today_name = "Wednesday";
        } else if (today == thu){
            today_name = "Thursday";
        } else if (today == fri){
            today_name = "Friday";
        } else if (today == sat){
            today_name = "Saturday";
        }

        // if else statements for selection over user_input_future
        if(future_day == sun){
            future_day_name = "Sunday";
        } else if (future_day == mon){
            future_day_name = "Monday";
        } else if (future_day == tue){
            future_day_name = "Tuesday";
        } else if (future_day == wed){
            future_day_name = "Wednesday";
        } else if (future_day == thu){
            future_day_name = "Thursday";
        } else if (future_day == fri){
            future_day_name = "Friday";
        } else if (future_day == sat){
            future_day_name = "Saturday";
        }

        // Output to user with result
        System.out.println("Today is " + today_name + " and " + days_from_today + " days from now is " + future_day_name + ".");

    }
}
