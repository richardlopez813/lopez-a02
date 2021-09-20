/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt for principal
2. scan for principal
3. repeat for interest rate and years
4. loop product of principal times interest rate by amount of years
 */

import java.util.Scanner;

public class Solution12 {
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the principal: ");
        double prin = in.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = in.nextDouble();

        System.out.print("Enter the number of years: ");
        int yearAmount = in.nextInt();

        int counter = 0;
        double investment = prin * (1 + rate/100 * yearAmount);

        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f", yearAmount, rate, investment);

    }
}
