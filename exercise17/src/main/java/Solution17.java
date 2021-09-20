/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt for male or female (1 or 2)
2. scan for result
3. repeat for ounces of alcohol
4. repeat for weight
5. repeat for hours since last drink
6. complete BAC equation with info
7. compare result with legal driving limit
8. print BAC and whether you can legally drive
 */

import java.util.Scanner;

public class Solution17 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        final double alcRatiomen = 0.73;
        final double alcRatiowomen = 0.66;

        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        String gender = in.nextLine();

        for(int counter = 0; counter < gender.length(); counter++) {
            if (gender.charAt(counter) < '0' || gender.charAt(counter) > '9'){
                System.out.printf("invalid input");
                System.exit(0);
            }
        }

        System.out.print("How many ounces of alcohol did you have? ");
        String ounces = in.nextLine();

        for(int counter = 0; counter < ounces.length(); counter++) {
            if (ounces.charAt(counter) < '0' || ounces.charAt(counter) > '9'){
                System.out.printf("invalid input");
                System.exit(0);
            }
        }

        System.out.print("What is your weight, in pounds? ");
        String weight = in.nextLine();

        for(int counter = 0; counter < weight.length(); counter++) {
            if (weight.charAt(counter) < '0' || weight.charAt(counter) > '9'){
                System.out.printf("invalid input");
                System.exit(0);
            }
        }

        System.out.print("How many hours has it been since your last drink? ");
        String hours = in.nextLine();

        for(int counter = 0; counter < hours.length(); counter++) {
            if (hours.charAt(counter) < '0' || hours.charAt(counter) > '9'){
                System.out.printf("invalid input");
                System.exit(0);
            }
        }

        double bac;

        double genderR = Integer.parseInt(gender);
        double ouncesR = Integer.parseInt(ounces);
        double weightR = Integer.parseInt(weight);
        double hoursR = Integer.parseInt(hours);

        if(genderR == 1)
            bac = (ouncesR * 5.14/weightR * alcRatiomen) - .015 * hoursR;
        else
            bac = (ouncesR * 5.14 / weightR * alcRatiowomen) - .015 * hoursR;

        if(bac < 0.08)
            System.out.printf("Your BAC is %f\nIt is legal for you to drive.", bac);
        else
            System.out.printf("Your BAC is %f\nIt is not legal for you to drive.", bac);
    }
}
