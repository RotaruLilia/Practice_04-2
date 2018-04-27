/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_04_2;

public class ShoppingCart {
    public static void main(String[] args){
        String custName = "Mary Smith";
        String itemDesc = " Shirt";
        String message;        
        
        // Declare and initialize numeric fields: price, tax, and quantity.   
        // Declare a total field but do not initialize total.
        
        // Modify message to include quantity  
        message = custName +" wants to purchase a " +itemDesc; ;
        System.out.println(message);
        double price= 50, tax = 25.78;
        int quantity = 1;
        double total;

        System.out.println(custName +" wants to purchase a " +quantity +itemDesc);
        total = price * quantity * tax;
        System.out.println ("Total cost with max is " +total);
        // Calculate total and then print the total cost
        
        
    }
}
