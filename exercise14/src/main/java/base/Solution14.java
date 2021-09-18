/*
Write a simple program to compute the tax on an order amount.
The program should prompt for
    the order amount and
    the state.
        If the state is “WI,”
            then the order must be charged 5.5% tax.
for Wisconsin residents the program should display the
    subtotal,
    tax, and
    total  but
display just the total for non-residents.
 */
/*
Implement this program using only a simple if statement—don’t use an else clause.
Ensure that all money is rounded up to the nearest cent.
Use a single output statement at the end of the program to display the program results.
 */
package base;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Solution14 {
    /*
    program start
    declare final double 'TAX_RATE' = 0.055
    'orderAmount' = read string from user
    'state' = read string from user
    double 'tax' = 0
    if (state == 'WI')
        tax = TAX_RATE * orderAmount
        double 'subtotal' = parseDouble(orderAmount)
        print subtotal
        print tax
    'total' = Math.ceil((parseDouble(orderAmount) + tax) * 100) / 100
    print total
     */
    public static void main(String[] args) {
        final double TAX_RATE = 0.055;
        Scanner input = new Scanner(System.in);

        //prompt for order amount and state
        System.out.print("What is the order amount? ");
        String orderAmount = input.nextLine();

        System.out.print("What is the state? ");
        String state = input.nextLine();

        //initialize tax double
        double tax = 0;

        //display subtotal and tax if "WI" is entered
        if (state.equals("WI"))
        {
            tax = TAX_RATE * parseDouble(orderAmount);
            double subtotal = parseDouble(orderAmount);
            System.out.printf("Subtotal: $%.2f%n", subtotal);
            System.out.printf("Tax: $%.2f%n", tax);
        }

        //calculate total
        double total = parseDouble(orderAmount) + tax;

        //display total
        System.out.printf("Total: $%.2f", total);
        }
    }

