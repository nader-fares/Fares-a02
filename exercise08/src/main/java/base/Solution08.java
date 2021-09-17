/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nader Fares
 */

/*
Write a program to evenly divide pizzas.
Prompt for
    the number of people,
    the number of pizzas, and
    the number of slices per pizza.
Ensure that the number of pieces comes out even.
Display the number of pieces of pizza each person should get.
If there are leftovers, show the number of leftover pieces.
 */

package base;

import java.util.Scanner;

/*
program start
'groupSize' = read int from user
'pizzaCount' = read int from user
'sliceCount' = read int from user
int 'slicesTotal' = 'pizzaCount' * 'sliceCount'
int 'slicePerPerson' = 'slicesTotal' / 'groupSize'
int 'slicesRemaining' = 'slicesTotal % 'groupSize'
print "'groupSize' people with 'pizzaCount' pieces of pizza."
print "Each person gets 'slicePerPerson' pieces of pizza"
print "There are 'slicesRemaining' leftover pieces"
 */

public class Solution08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt user for needed information
        System.out.print("How many people? ");
        int groupSize = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzaCount = input.nextInt();

        System.out.print("How many slices per pizza? ");
        int sliceCount = input.nextInt();

        //calculate required variables
        int slicesTotal = pizzaCount * sliceCount;
        int slicePerPerson = slicesTotal / groupSize;
        int slicesRemaining = slicesTotal % groupSize;

        //display results
        System.out.println(groupSize + " people with " + pizzaCount + " pieces of pizza.");
        System.out.println("Each person gets " + slicePerPerson + " pieces of pizza.");
        System.out.println("There are " + slicesRemaining + " leftover pieces.");
    }
}
