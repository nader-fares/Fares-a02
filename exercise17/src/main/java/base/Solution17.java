/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Create a program that prompts for
    your weight,
    gender,
    total alcohol consumed (in ounces), and
    the amount of time since your last drink.
Calculate your blood alcohol content (BAC) using this formula

 */
package base;

import java.util.Scanner;

public class Solution17 {

    /*
    program start
    do
        print enter 1 for male or 2 for female
        if input -> int
            int gender = read from user
        else
            invalid
            clear input
        while gender != 1 and 2

     do
        print how many ounces
        if input -> int
            int ounces = read from user
            boolean isNumber = true
        else
            invalid
            boolean isNumber = false
            clear input
        while !isNumber

     repeat for weight and hours
     double ADR = 0
     if gender = 1
            ADR = 0.73
        else
            ADR = 0.66
     calculateBAC returns double (int oz * 5.14 / int W * int r) - 0.015 * int H
     double BAC = calculateBAC(ounces, weight, ADR, hours)
     print BAC
     if BAC > .08
        It is not legal for you to drive
     else
        legal to drive
     */

    //method that calculates and returns double BAC
    public static double calculateBAC(int oz, int w, double r, int h)
    {
        return (oz * 5.14 / w * r) - 0.015 * h;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gender = 0;
        int ounces = 0;
        int weightLbs = 0;
        int timeSince = 0;
        boolean isNumber;
        double ADR = 0;

        //do while loop to enter only 1 or 2
        do
        {
            System.out.print("Enter a 1 if you are male or a 2 if you are female: ");

            //if int read input, else invalid and clear input
            if (input.hasNextInt())
            {
                gender = input.nextInt();
            } else
            {
                System.out.println("Invalid input.");
                input.next();
            }
        } while (gender != 1 && gender != 2);   //condition

        //enter ounces of alcohol (numbers only)
        do
        {
            System.out.print("How many ounces of alcohol did you have? ");
            if (input.hasNextInt())
            {
                ounces = input.nextInt();
                isNumber = true;
            } else
            {
                System.out.println("Invalid input.");
                isNumber = false;
                input.next();
            }
        } while (!(isNumber));

        //enter weight in pounds (numbers only)
        do
        {
            System.out.print("What is your weight, in pounds? ");
            if (input.hasNextInt())
            {
                weightLbs = input.nextInt();
                isNumber = true;
            } else
            {
                System.out.println("Invalid input.");
                isNumber = false;
                input.next();
            }
        } while (!(isNumber));

        //enter hours since last drink (numbers only)
        do
        {
            System.out.print("How many hours has it been since your last drink? ");
            if (input.hasNextInt())
            {
                timeSince = input.nextInt();
                isNumber = true;
            } else
            {
                System.out.println("Invalid input.");
                isNumber = false;
                input.next();
            }
        } while (!(isNumber));

        //calculate alcohol distribution ratio
        //1 is male 2 is female
        if (gender == 1)
            ADR = 0.73;
        else
            ADR = 0.66;

        //method call to calculate BAC
        double BAC = calculateBAC(ounces, weightLbs, ADR, timeSince);

        //display results
        //if BAC higher than .08 its illegal else its legal
        System.out.println("Your BAC is " + BAC);

        if (BAC > .08)
            System.out.println("It is not legal for you to drive.");
        else
            System.out.println("It is legal for you to drive.");
    }
}
