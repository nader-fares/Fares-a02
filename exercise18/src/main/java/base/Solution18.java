/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Create a program that
    converts temperatures from Fahrenheit to Celsius
    or from Celsius to Fahrenheit.
Prompt for the starting temperature.
The program should prompt for the type of conversion and then perform the conversion.
 */
package base;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Solution18 {

    /*
    void displayDirections
        print directions
    conversionType = read string from user
    temp_from = read string from user
    calculateCtoF returns double (c * 9 / 5) + 32
    calculateFtoC returns double (f - 32) * 5 / 9
    if conversionType equals f
        double temp_to = calculateCtoF(c_from)
    else if conversionType equals c
        double temp_to = calculateFtoC(c_from)
    else
        invalid character entered
     */

    //method displays directions of the program
    public static void displayDirections()
    {
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.\n");
    }

    //method converts temperature from celsius to fahrenheit
    public static double calculateCtoF(String startTemp)
    {
        return (parseDouble(startTemp) * 9 / 5) + 32;
    }

    //method converts temperature from fahrenheit to celsius
    public static double calculateFtoC(String startTemp)
    {
        return (parseDouble(startTemp) - 32) * 5 / 9;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tempTo;

        displayDirections();

        //prompt for starting temp and choice of conversion
        System.out.print("Please enter the starting temperature: ");
        String tempFrom = input.nextLine();

        System.out.print("Your choice: ");
        String conversionType = input.nextLine();

        //chooses which method to call depending on entered character
        //if neither characters are input prints invalid message
        if (conversionType.equalsIgnoreCase("f"))
        {
            tempTo = calculateCtoF(tempFrom);
            System.out.println("The temperature in Fahrenheit is " + tempTo);
        }
        else if (conversionType.equalsIgnoreCase("c"))
        {
            tempTo = calculateFtoC(tempFrom);
            System.out.println("The temperature in Celsius is " + tempTo);
        }
        else
            System.out.println("Invalid character entered.");

    }
}
