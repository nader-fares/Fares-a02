/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nader Fares
 */

/*
Create a program that calculates the area of a room.
Prompt the user for the length and width of the room in feet.
Then display the area in both square feet and square meters.
 */
package base;

import java.util.Scanner;

public class Solution07 {
    /*
    final double 'CONVERSION_FACTOR' = 0.09290304
    print "what is the length of the room in feet? "
    'length' = read int from user
    print "what is the width of the room in feet? "
    'width' = read int from user
    double 'areaFt' = 'length' * 'width'
    double 'areaM' = 'areaFt' * 'conversionFactor'
    print "You entered dimensions of 'length' feet by 'width' feet"
    print "The area is\n"
    print "'areaFt' square feet"
    print "'areaM' square meters"
     */

    //declare constant to hold conversion factor
    public static final double CONVERSION_FACTOR = 0.09290304;

    public static void main(String[] args) {

        //prompt user to enter length and store into int 'length'
        System.out.print("What is the length of the room in feet? ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        //prompt user to enter width and store into int 'width'
        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();

        //calculate area and store into int 'areaFt'
        int areaFt = length * width;

        //convert area in square feet to square meters and store into int 'areaM'
        double areaM = areaFt * CONVERSION_FACTOR;

        //display results
        System.out.printf("You entered dimensions of %d feet by %d feet.%n", length, width);
        System.out.println("The area is");
        System.out.printf("%d square feet%n", areaFt);
        System.out.printf("%.3f square meters%n", areaM);
    }
}
