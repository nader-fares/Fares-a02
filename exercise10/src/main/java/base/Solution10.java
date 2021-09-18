/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nader Fares
 */

/*
Create a simple self-checkout system.
Prompt for the
    prices and
    quantities of three items.
Calculate the subtotal of the items.
Then calculate the tax using a tax rate of 5.5%.
Print out the line items with the quantity and total, and
then print out the subtotal, tax amount, and total.
 */
package base;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Solution10 {

    /*
    program start
    double final 'TAX_RATE' = 0.05
    'itemPrice1' = read string from user
    'itemQuantity1' = read string from user
    repeat for items 2 and 3
    'calculateSubtotal' returns double parseInt(String P1, String Q1, String P2, String Q2, String P3, String Q3)
    double 'subtotal' = calculateSubtotal(itemPrice1, itemQuantity1, itemPrice2, itemQuantity2, itemPrice3, itemQuantity3)
    double 'tax' = 'subtotal' * 'TAX_RATE
    double 'Total' = 'subtotal' - 'tax'
    'finalTotal' prints results
     */

    //calculate subtotal
    public static double calculateSubtotal(String P1, String Q1, String P2, String Q2, String P3, String Q3)
    {
        return parseInt(P1) * parseInt(Q1) + parseInt(P2) * parseInt(Q2) + parseInt(P3) * parseInt(Q3);
    }

    //display results
    public static void displayTotal(double s, double t, double tot)
    {
        System.out.println("Subtotal: $" + s);
        System.out.println("Tax: $" + t);
        System.out.println("Total: $" + tot);
    }

    public static void main(String[] args) {
        final double TAX_RATE = 0.055;
        Scanner input = new Scanner(System.in);

        //read in prices and quantity of three items
        System.out.print("Enter the price of item 1: ");
        String itemPrice1 = input.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        String itemQuantity1 = input.nextLine();

        System.out.print("Enter the price of item 2: ");
        String itemPrice2 = input.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        String itemQuantity2 = input.nextLine();

        System.out.print("Enter the price of item 3: ");
        String itemPrice3 = input.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        String itemQuantity3 = input.nextLine();

        //method call to calculate subtotal
        double subtotal = calculateSubtotal(itemPrice1, itemQuantity1, itemPrice2, itemQuantity2, itemPrice3, itemQuantity3);

        //calculate tax
        double tax = TAX_RATE * subtotal;

        //calculate total
        double total = subtotal + tax;

        //display results
        displayTotal(subtotal, tax, total);
    }
}
