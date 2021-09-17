/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nader Fares
 */

/*
Create a program that
determines
  how many years you have left until retirement and
  the year you can retire.
It should prompt for
  your current age and the
  age you want to retire and
display the output as shown in the example that follows.
*/

package base;

import java.time.LocalDate;
import java.util.Scanner;

public class Solution06 {
    /*
    program start
    print "What is your current age?"
    'currentAge' = read string from user
    print "At what age would you like to retire?"
    'retireAge' = read string from user
    int 'age' = Integer.parseInt('currentAge')
    int 'retire' = Integer.parseInt('retireAge')
    int 'remaining' = 'retire' - 'age'
    println "You have " + 'remaining' " years left until you can retire."
    int 'currentYear' = LocalDate.now().getYear()   (Import java.time.LocalDate)
    int 'retireYear' = 'currentYear' + 'remaining'
    println "It's " + 'currentYear' + ", so you can retire in " +  'retireYear' + "."
    */

    public static void main(String[] args) {
        //prompt user for current age and store into string 'currentAge'
        System.out.print("What is your current age? ");
        Scanner input = new Scanner(System.in);
        String currentAge = input.nextLine();

        //prompt user for retiring age and store into string 'retireAge'
        System.out.print("At what age would you like to retire? ");
        String retireAge = input.nextLine();

        //convert strings into int to use for calculations
        int age = Integer.parseInt(currentAge);
        int retire = Integer.parseInt(retireAge);

        //calculate remaining years until retirement
        int remaining = retire - age;

        //get current year through system time
        int currentYear = LocalDate.now().getYear();

        //calculate year to retire
        int retireYear = currentYear + remaining;

        //display result
        System.out.println("You have " + remaining + " years left until you can retire.");
        System.out.println("It's " + currentYear + ", so you can retire in " + retireYear);
    }
}
