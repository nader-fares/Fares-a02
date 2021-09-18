/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*
Create a simple program that validates user login credentials.
The program must prompt the user for a
    username and
    password.
The program should compare the password given by the user to a known password.
If the password matches,
    the program should display “Welcome!”
If it doesn’t match,
    the program should display “I don’t know you.”
 */

package base;

import java.util.Scanner;

public class Solution15 {

    /*
    program start
    String 'actualPassword' = **random string**
    username = read string from user
    password = read string from user
    if (password == actualPassword)
        print "welcome"
    else
        print "I don't know you"
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //set random password to compare to
        String actualPassword = "AbC$123";

        //prompt user for username and password
        System.out.print("What is the username? ");
        String username = input.nextLine();

        System.out.print("What is the password? ");
        String password = input.nextLine();

        //if passwords match welcome, if not don't welcome
        if (password.equals(actualPassword))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");
    }
}
