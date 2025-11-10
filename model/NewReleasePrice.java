package model;

public class NewReleasePrice extends Price {
    
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }

    public int getPriceCode() {
        return 1;
    }

    public double getCharge(int daysRented) {
        return daysRented * 3;
    }
    
}
