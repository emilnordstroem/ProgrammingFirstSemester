package opgave05;

public class Opgave05 {

    public static void main(String[] args) {
        Stock stockCompany = new Stock("AAPL", "Apple Inc.", 227.34, 230.56);

        // variable for logging change in value
        double changeInValue = getChangePercent(stockCompany.previousClosingPrice, stockCompany.currentPrice);

        // printing change to console
        System.out.println(changeInValue);
    }

    // method for calculating change in percent
    public static double getChangePercent(double previousClosingPrice, double currentPrice){
        // Formal for calculating percent change
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
