/*
Write a program that converts currency.
Specifically, convert euros to U.S. dollars.
Prompt for the amount of money in euros you have, and
prompt for the current exchange rate of the euro.
Print out the new amount in U.S. dollars.
 */
package base;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Solution11 {

    /*
    program start
    'c_from' = read string from user
    'rate' = read string from user
    'currencyConversion' returns Math.ceil(parseDouble(from) * parseDouble(rate) * 100) / 100
    double 'c_to' = currencyConversion('c_from', 'rate')
    'displayConversion' method prints money before and after conversion and the exchange rate
     */

    //convert from euros to usd
    public static double currencyConversion(String from, String rate)
    {
        return Math.ceil(parseDouble(from) * parseDouble(rate) * 100) / 100;
    }

    //display results
    public static void displayConversion(String from, String rate, double to)
    {
        System.out.println(from + " euros at an exchange rate of " + rate + " is");
        System.out.printf("%.2f U.S dollars.", to);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

        //prompt user to enter money amount and exchange rate
        System.out.print("How many euros are you exchanging? ");
        String c_from = input.nextLine();

        System.out.print("What is the exchange rate? ");
        String rate = input.nextLine();

        //method call to convert
        double c_to = currencyConversion(c_from, rate);

        //display results
        displayConversion(c_from, rate, c_to);
    }
}
