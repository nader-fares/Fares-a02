/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Write a program that converts a number from 1 to 12 to the corresponding month.
Prompt for a
    number and
    display the corresponding calendar month,
        with 1 being January and 12 being December.
For any value outside that range, display an appropriate error message.
 */
package base;

import java.util.Scanner;

public class Solution21 {

    /*
    program start
    string monthName
    month = read int from user
    switch month
        case 1: monthName = January
            break
        case 2: monthName = February
            break
        continue until 12
        default: monthName = error message
            break;
    print monthName
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String monthName;

        System.out.print("Please enter the number of the month: ");
        int month = input.nextInt();

        switch (month) {
            case 1: monthName = "January";
                break;
            case 2: monthName = "February";
                break;
            case 3: monthName = "March";
                break;
            case 4: monthName = "April";
                break;
            case 5: monthName = "May";
                break;
            case 6: monthName = "June";
                break;
            case 7: monthName = "July";
                break;
            case 8: monthName = "August";
                break;
            case 9: monthName = "September";
                break;
            case 10: monthName = "October";
                break;
            case 11: monthName = "November";
                break;
            case 12: monthName = "December";
                break;
            default: monthName = "Invalid number entered";
                break;
        }
        System.out.println(monthName);
    }
}
