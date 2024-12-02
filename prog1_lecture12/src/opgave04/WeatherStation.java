package opgave04;

public class WeatherStation {
    private double temperature;
    private double pressure;

    // Constructor method for default WeatherStation
    WeatherStation() {
        temperature = 0;
        pressure = 1;
    }

    // Constructor method for WeatherStation
    WeatherStation(double celsius, double bar){
        this.temperature = celsiusToFahrenheit(celsius);
        this.pressure = barToPSI(bar);
    }

    // getter method for accessing both temperature and pressure
    public double getTemperature() {
        return temperature;
    }
    public double getPressure() {
        return pressure;
    }

    // Method for converting c to f
    private static double celsiusToFahrenheit(double celsius){
        return (celsius * 1.8) + 32;
    }

    // Method for converting bar to PSI
    private static double barToPSI(double bar){
        return bar * 14.503773773;
    }

}
