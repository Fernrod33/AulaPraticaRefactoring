package controller;

import java.util.Vector;
import model.Rental;
import view.HtmlStatement;
import view.TextStatement;
import java.util.Enumeration;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<>();

    public Customer (String name){
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }
   
    public String getName (){
        return _name;
    }

    public Enumeration getRentals() {
        return _rentals.elements();
    }
  
    public String statement() {
        return new TextStatement().value(this);
    }

    public double getTotalCharge() {
        double result = 0;
        for (Rental each : _rentals) {
            result += each.getCharge();
        }
        return result;
    }

    public int getTotalFrequentRenterPoints() {
        int result = 0;
        for (Rental each : _rentals) {
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

    public String htmlStatement() {
        return new HtmlStatement().value(this);
    }

}
