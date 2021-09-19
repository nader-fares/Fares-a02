/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nader Fares
 */

/*
Create a program that walks the user through troubleshooting issues with a car.
 */
package base;

import java.util.Scanner;

public class Solution23 {
    /*
    program start
    silent = read string from user
        if yes
            batteryCorroded = read string from user
                if yes
                    clean terminals and try starting again
                else
                    replace cables and try again
        else
            slickingNoise = read string from user
                if yes
                    replace battery
                else
                    crankFail = read string from user
                        if yes
                            check spark plug connections
                        else
                            engineDie = read string from user
                                if yes
                                    fuelInjection = read string from user
                                        if yes
                                            get it in for service
                                        else
                                            check to ensure the choke is opening and closing
                                else
                                    should not be possible
     */

    public static void displayDirections() {
        System.out.println("This program will help troubleshoot car issues you may have.");
        System.out.println("Enter y for yes. Enter n for no.");
        System.out.println("If you enter neither, the program will exit.");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        displayDirections();

        //ask if car is silent
        System.out.print("Is the car silent when you turn the key? ");
        String silent = input.nextLine();
        //if yes ask if battery is corroded
        if (silent.equalsIgnoreCase("y")) {
            System.out.print("Are the battery terminals corroded? ");
            String batteryCorroded = input.nextLine();
            //if yes clean terminals
            if (batteryCorroded.equalsIgnoreCase("y")) {
                System.out.println("Clean terminals and try starting again");
                //if no replace cables
            } else if (batteryCorroded.equalsIgnoreCase("n"))
                System.out.println("Replace cables and try again.");
            //if neither exit
            else
                System.exit(0);

            //if no to the first question ask if making slicking noise
        } else if (silent.equalsIgnoreCase("n")) {
            System.out.print("Does the car make a slicking noise? ");
            String slickingNoise = input.nextLine();
            //if yes replace battery
            if (slickingNoise.equalsIgnoreCase("y")) {
                System.out.println("Replace the battery.");
                //if no ask if car cranks but fails to start
            } else if (slickingNoise.equalsIgnoreCase("n")) {
                System.out.print("Does the car crank up but fail to start? ");
                String crankFail = input.nextLine();
                //if yes check the spark plug
                if (crankFail.equalsIgnoreCase("y"))
                    System.out.println("Check spark plug connections.");
                //if no ask if engine starts then dies
                else if (crankFail.equalsIgnoreCase("n")) {
                    System.out.print("Does the engine start and then die? ");
                    String engineDie = input.nextLine();
                    //if yes ask if car has fuel injection
                    if (engineDie.equalsIgnoreCase("y")) {
                        System.out.print("Does the car have fuel injection? ");
                        String fuelInjection = input.nextLine();
                        //if yes tell get it in for service
                        if (fuelInjection.equalsIgnoreCase("y"))
                            System.out.println("Get it in for service.");
                        //if no check if choke is opening and closing
                        else if (fuelInjection.equalsIgnoreCase("n"))
                            System.out.println("Check to ensure the choke is opening and closing.");
                        //if neither exit
                        else
                            System.exit(0);
                        //if no its not possible
                    } else if (engineDie.equalsIgnoreCase("n"))
                        System.out.println("This should not be possible.");
                    //if neither exit
                    else
                        System.exit(0);
                    //if neither exit
                } else
                    System.exit(0);
                //if neither exit
            } else
                System.exit(0);
            //if neither exit
        } else
            System.exit(0);
    }
}
