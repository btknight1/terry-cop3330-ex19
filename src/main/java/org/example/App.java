/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        double weight = 0.0;
        double height = 0.0;
        double bmi = 0.0;

        boolean tryAgain = false;

        String value = "";

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Height (Numeric data only)? ");
            value = input.nextLine();
            tryAgain = false;
            try {
                height = Double.parseDouble(value);
            } catch (NumberFormatException ex) {
                tryAgain = true;
            }
        } while (tryAgain);

        do {
            System.out.print("Weight (Numeric data only)? ");
            value = input.nextLine();
            tryAgain = false;
            try {
                weight = Double.parseDouble(value);
            } catch (NumberFormatException ex) {
                tryAgain = true;
            }
        } while (tryAgain);

        bmi = (weight / (height * height)) * 703;

        System.out.printf("Your BMI is %.1f%n", bmi);
        if (bmi >= 18.5 && bmi <= 25) {
            System.out.printf("Your weight is normal.");
        }
        if (bmi < 18.5)
        {
            System.out.printf("You are underweight. You should see your doctor.");
        }
        if( bmi > 25)
        {
            System.out.printf("You are overweight. You should see your doctor.");
        }
    }
}