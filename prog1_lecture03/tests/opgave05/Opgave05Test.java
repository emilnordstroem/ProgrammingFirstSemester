package opgave05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Opgave05Test {

    @Test
    @DisplayName("Bil der koster under 67.800 kr.")
    public void CalculateFeeForSmallCar() {
        double actual = Opgave05.calculateFee(60000);
        assertEquals(15000, actual, "Hvis en bil koster under 67.800 kr. skal man betale 25% i registreringsafgift");
    }

    @Test
    @DisplayName("Bil der koster over 67.800 men under 210.600 kr.")
    public void CalculateFeeForMidRangeCar() {
        double actual = Opgave05.calculateFee(150000);
        assertEquals(86820, actual, "Registreringsafgiften for en bil til 150.00 er 16.950 kr. + 69.870 kr. = 86.820 kr.");
    }

    @Test
    @DisplayName("Bil der koster over 210.600 kr.")
    public void CalculateFreeForLuxuryCar() {
        double actual = Opgave05.calculateFee(300000);
        assertEquals(272430, actual, "Registreringsafgiften for en bil til 300000 er 16.950 kr. + 121.380 kr. + 134.100 kr. = 272.430 kr.");
    }
}

