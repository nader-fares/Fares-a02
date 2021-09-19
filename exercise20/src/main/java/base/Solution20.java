/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Create a tax calculator that handles
    multiple states and
    multiple counties within each state.
The program prompts the user for
    the order amount and
    the state where the order will be shipped.
 */
package base;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Solution20 {

    /*
    program start
    declare constants for state/county tax
    double taxAmount
    double taxRate
    orderAmount = read string from user
    state = read string from user
    if state = wi
        taxRate += tax_rate_wi
        county = read string from user
            if county = dane
                taxRate += tax_rate_wi_d
            else if county = eau claire
                taxRate += tax_rate_ec
        taxAmount = orderAmount * taxRate
        print tax
    else if state = il
        taxRate += tax_rate_il
        taxAmount = orderAmount * taxRate
        print tax
    else
        taxAmount = 0
    double total = orderAmount + taxAmount
    print total
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double TAX_RATE_WI = 0.05;
        final double TAX_RATE_WI_EC = 0.005;
        final double TAX_RATE_WI_D = 0.004;
        final double TAX_RATE_IL = 0.08;

        double taxRate = 0;
        double taxAmount;
        double total;
        String county;

        //prompt for order amount and state
        System.out.print("What is the order amount? ");
        String orderAmount = input.nextLine();

        System.out.print("What state do you live in? ");
        String state = input.nextLine();

        //if wisconsin is entered, wisconsin tax will be added and county will be prompted for
        //both abbreviation and state name acceptable
        if (state.equalsIgnoreCase("Wisconsin")
                    || state.equalsIgnoreCase("wi")) {
            taxRate += TAX_RATE_WI;
            System.out.print("What county do you live in? ");
            county = input.nextLine();

                //depending on county inputted, an additional tax will be added
                if (county.equalsIgnoreCase("dane"))
                    taxRate += TAX_RATE_WI_D;
                else if (county.equalsIgnoreCase("eau claire"))
                    taxRate += TAX_RATE_WI_EC;
                else
                    taxRate += 0;

            //calculate tax and round up to the nearest cent
            //both abbreviation and state name acceptable
            taxAmount = (Math.ceil(parseDouble(orderAmount) * taxRate * 100) / 100);
            //display tax to the nearest cent
            System.out.printf("The tax is $%.2f", taxAmount);

        //if illinois is entered, illinois tax will be added and tax will be calculated and displayed
        } else if (state.equalsIgnoreCase("Illinois")
                    || state.equalsIgnoreCase("il")) {
            taxRate += TAX_RATE_IL;
            taxAmount = (Math.ceil(parseDouble(orderAmount) * taxRate * 100) / 100);
            System.out.printf("The tax is $%.2f", Math.ceil(taxAmount));

        //any other state is not taxed
        } else
            taxAmount = 0;

        //tax is added to order amount to find the total
        total = (Math.ceil((parseDouble(orderAmount) + taxAmount) * 100 ) / 100);
        //display total rounded to the nearest cent
        System.out.printf("%nThe total is $%.2f", total);
    }
}
