package moneycalculator.Model;

public class ExchangeRate {
    private final double rate;
    private final Currency to;

    public ExchangeRate(double rate, Currency to) {
        this.rate = rate;
        this.to = to;
    }

    public double getRate() {
        return rate;
    }

    public Currency getTo() {
        return to;
    }
    
    
}