/*
Create a program to calculate the body mass index (BMI) for a person using
    the person’s height in inches and
    weight in pounds.
The program should prompt the user for weight and height.
 */
package base;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Solution19 {
    /*
    program start
    print directions
    boolean isNumber
    do
        print enter height in inches
        if input -> int
            int height = read string from user
            isNumber = true
        else
            invalid
            isNumber = false
            clear input
        while !isNumber

     repeat for weight
     calculateBMI returns double (w / (h * h)) * 703
     BMI = calculateBMI(height, weight)
     if bmi > 25
        print overweight
    else if bmi < 18.5
        print underweight
    else
        print normal weight
     */

    //display directions
    public static void displayDirections()
    {
        System.out.println("This program will calculate and display your BMI based on your height and weight.\n");
    }

    //method to calculate bmi
    public static double calculateBMI(String w, String h)
    {
        return (parseInt(w) / pow(parseInt(h), 2)) * 703;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String height = "height";
        String weight = "weight";
        boolean isNumber;

        displayDirections();

        //enter height in inches (numbers only)
        do {
            System.out.print("Enter your height in inches: ");

            //if int read input else invalid and clear input
            if (input.hasNextInt()) {
                height = input.nextLine();
                isNumber = true;
            } else {
                System.out.println("Invalid input.");
                isNumber = false;
                input.next();
            }
        } while (!(isNumber));  //loop will repeat while isNumber is false

        //enter weight in pounds (numbers only)
        do {
            System.out.print("Enter your weight in lbs: ");
            if (input.hasNextInt()) {
                weight = input.nextLine();
                isNumber = true;
            } else {
                System.out.println("Invalid input.");
                isNumber = false;
                input.next();
            }
        } while (!(isNumber));

        //method call to calculate bmi
        double BMI = calculateBMI(weight, height);

        //display results
        //bmi > 25 overweight, bmi < 18.5 underweight, between is normal
        System.out.printf("Your BMI is %.2f%n", BMI);

        if (BMI > 25.0)
            System.out.println("You are overweight. You should see your doctor.");
        else if (BMI < 18.5)
            System.out.println("You are underweight. You should see your doctor.");
        else
            System.out.println("You are within the ideal weight range.");
    }
}
