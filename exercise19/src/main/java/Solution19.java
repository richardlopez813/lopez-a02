/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt for weight and height
2. scan for weight and height
3. Use inputs to calculate BMI
4. see whether BMI indicates underweight, healthy, or overweight
5. print results
 */

import java.util.Scanner;

public class Solution19 {
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("what is your weight? ");
        String weight = in.nextLine();

        for(int counter = 0; counter < weight.length(); counter++) {
            if (weight.charAt(counter) < '0' || weight.charAt(counter) > '9'){
                System.out.printf("invalid input");
                System.exit(0);
            }
        }

        System.out.print("what is your height? ");
        String height = in.nextLine();

        for(int counter = 0; counter < height.length(); counter++) {
            if (height.charAt(counter) < '0' || height.charAt(counter) > '9'){
                System.out.printf("invalid input");
                System.exit(0);
            }
        }

        double weightReal = Integer.parseInt(weight);
        double heightReal = Integer.parseInt(height);

        double bmi = (weightReal / (heightReal * heightReal)) * 703;

        System.out.printf("Your BMI is %f.\n", bmi);

        if(bmi <= 18.5) {
            System.out.print("You are underweight");
        }
        else if(18.5 < bmi && bmi < 25) {
            System.out.print("You are within the ideal weight range");
        }
        else {
            System.out.print("You are overweight");
        }
    }
}
