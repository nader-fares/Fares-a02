/*
Write a program that asks for three numbers.
Check first to see that all numbers are different.
    If they’re not different,
        then exit the program.
    Otherwise, display the largest number of the three.

 */
package base;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Solution22 {

    /*
    program start
    int highest = min value
    num1 = read int from user
    repeat for num2 and num3
    if num1 == num2 or num1 == num3 or num2 == num3
        exit
    else if num1 > num2 and num1 > num3
        highest = num1
    else if num1 < num2 and num2 > num3
        highest = num2
    else
        highest = num3
    print highest
     */

    public static void displayInstructions() {
        System.out.println("This program will find the highest of three numbers that you will input.");
        System.out.println("All numbers entered must be of different value.");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highest = Integer.MIN_VALUE;

        //prompt user for three numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        //if any of the numbers are equal, exit program
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Program failed. Numbers entered must be different.");
            System.exit(0);
        }
        //checks if num1 is the highest
        else if (num1 > num2 && num1 > num3)
            highest = num1;
        //checks if num2 is the highest
        else if (num1 < num2 && num2 > num3)
            highest = num2;
        //num3 is highest if neither are
        else
            highest = num3;

        //print results
        System.out.println("The largest number is " + highest);
    }
}
