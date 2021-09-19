/*

 */

/*
Write a program that
asks the user for their age and
compare it to the legal driving age of sixteen.
If the user is sixteen or older, then
    the program should display "You are old enough to legally drive."
If the user is under sixteen,
    the program should display "You are not old enough to legally drive."
 */
package base;

import java.util.Scanner;

public class Solution16 {

    /*
    program start
    'age' = read int from user
    if (age >= 16)
        print old enough
    else
        print not old enough
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = input.nextInt();

        if (age >= 16)
            System.out.println("You are old enough to legally drive.");
        else
            System.out.println("You are not old enough to legally drive.");
    }
}
