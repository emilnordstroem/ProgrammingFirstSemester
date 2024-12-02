package opgave04;

import java.util.Scanner;

public class Opgave04 {
    public static void main(String[] args) {

        // Request celsius
        System.out.print("Enter celsius: ");
        double celsius = userInput();
        // Request bar
        System.out.print("Enter bar: ");
        double bar = userInput();

        /*
        WeatherStation defaultWeatherStation = new WeatherStation();
        printConversion(defaultWeatherStation);
        */

        WeatherStation newWeatherStation = new WeatherStation(celsius, bar);
        printConversion(newWeatherStation);

    }

    // method for requesting user input
    private static double userInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    // method for printing converted values
    private static void printConversion(WeatherStation weatherStation){
        System.out.println("=========================");
        System.out.println("Fahrenheit: " + weatherStation.getTemperature() + "\nPSI: " + weatherStation.getPressure());
    }

}
