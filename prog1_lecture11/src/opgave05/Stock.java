package opgave05;

public class Stock {
    // instance variables for symbol, name, previous, closing
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    // Constructor method with four parameters
    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }
}
