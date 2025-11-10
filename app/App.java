package app;

import controller.Customer;

public class App {

    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");
        System.out.println(customer.statement());
    }
    
}
