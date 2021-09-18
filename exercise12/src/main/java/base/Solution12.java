/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nader Fares
 */

/*
Create a program that computes simple interest.
Prompt for
    the principal amount,
    the rate as a percentage, and
    the time, and
display the amount accrued (principal + interest).
 */

package base;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Solution12 {

    /*
    program start
    'principalAmount' = read string from user
    'rate' = read string from user
    'time' = read string from user
    double 'percent' = parseDouble(rate) / 100
    'calculateInterest' returns double Math.ceil(parseDouble(String 'amount') * (1 + double 'p' * parseDouble(String 't')) * 100) / 100
    'displayFinalAmount' prints final amount with the time passed and the interest as a percentage
     */

    //method to calculate money accumulated
    public static double calculateInterest(String amount, double p, String t)
    {
        return Math.ceil((parseDouble(amount)) * (1 + p * parseDouble(t)) * 100) / 100;
    }

    //method to display results
    public static void displayFinalAmount(String t, String percentage, double totalAccumulated)
    {
        System.out.printf("After %s years at  %s%%, the investment will be worth $%.2f", t, percentage, totalAccumulated);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt user for starting amount, time in years, and interest rate
        System.out.print("Enter the principal: ");
        String principalAmount = input.nextLine();

        System.out.print("Enter the rate of interest: ");
        String rate = input.nextLine();

        System.out.print("Enter the number of years: ");
        String time = input.nextLine();

        //calculate actual value of the percentage
        double percent = parseDouble(rate) / 100;

        //method call to find final amount after 'time' years with interest 'percent'
        double finalAmount = calculateInterest(principalAmount, percent, time);

        //print results
        displayFinalAmount(time, rate, finalAmount);
    }
}
