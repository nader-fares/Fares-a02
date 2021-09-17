/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nader Fares
 */

/*
Calculate gallons of paint needed to paint the ceiling of a room.
Prompt for the
    length and
    width, and
assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling
    as a whole number.
 */

package base;

/*
program start
final double 'CONVERSION_FACTOR' 350.0
'length' = read int from user
'width' = read int from user
int 'area' = 'length' * 'width'
double 'gallons' = Math.ceil('area' / 'CONVERSION_FACTOR')
print "You will need to purchase 'gallons' of paint to cover 'area' square feet"
 */

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        final double CONVERSION_FACTOR = 350.0;
        Scanner input = new Scanner(System.in);

        //ask for length and width
        System.out.print("Enter the length: ");
        int length = input.nextInt();

        System.out.print("Enter the width: ");
        int width = input.nextInt();

        //calculate area
        int area = length * width;

        //calculate gallons needed and round up using Math.ceil()
        double gallons = Math.ceil((area) / CONVERSION_FACTOR);

        //display results
        System.out.println("You will need to purchase " + gallons + " of paint to cover " + area + " square feet.");
    }
}
