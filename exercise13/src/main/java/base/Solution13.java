/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Write a program to compute the value of an investment compounded over time.
The program should ask for
    the starting amount,
    the number of years to invest,
    the interest rate, and
    the number of periods per year to compound.
 */

package base;

import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Solution13 {

    /*
    program start
    'principalAmount' = read string from user
    'time' = read string from user
    'rate' = read string from user
    'periods' = read string from user
    double 'percent' = parseDouble(rate) / 100
    'calculateInterest' returns double Math.ceil(parseDouble(amount) * (1 + percentage / p) ** (p * t) * 100) * 100
    'displayFinalAmount' prints final amount with the time passed, the interest as a percentage, and the times compounded per year
     */

    //method to calculate money accumulated
    public static double calculateInterest(String amount, double percentage, String p, String t)
    {
        return Math.ceil(parseDouble(amount) * pow((1 + percentage / parseInt(p)), (parseInt(p) * parseDouble(t))) * 100) / 100;
    }

    //method to display results
    public static void displayFinalAmount(String startAmount, String percentage, String t, String p, double totalAccumulated)
    {
        System.out.printf("$%s invested at %s%% for %s years compounded %s times per year is $%.2f.", startAmount, percentage, t, p, totalAccumulated);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt user for starting amount, time in years, interest rate, and times compounded per year
        System.out.print("What is the principal amount? ");
        String principalAmount = input.nextLine();

        System.out.print("What is the rate? ");
        String rate = input.nextLine();

        System.out.print("What is the number of years? ");
        String time = input.nextLine();

        System.out.print("What is the number of times the interest is compounded per year? ");
        String periods = input.nextLine();

        //calculate actual value of the percentage
        double percent = parseDouble(rate) / 100;

        //method call to find final amount after compounded 'periods' times per year for 'time' years with interest 'percent'
        double finalAmount = calculateInterest(principalAmount, percent, periods, time);

        //print results
        displayFinalAmount(principalAmount, rate, time, periods, finalAmount);
    }
}
