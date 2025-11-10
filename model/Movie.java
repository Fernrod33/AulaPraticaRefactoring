package model;

public class Movie {

    private Price _price;
    private String _title;

    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    public Movie(String name, int priceCode) {
        _title = name;
        setPriceCode(priceCode);
    }

    public void setPriceCode(int arg) {
        switch(arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public String getTitle (){
        return _title;
    }

    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return _price.getFrequentRenterPoints(daysRented);
    }

}
