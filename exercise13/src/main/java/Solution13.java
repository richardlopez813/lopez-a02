/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt for principal amount
2. scan for principal
3. repeat for interest rate, year amount, and compounds per year
4. loop product of principal multiplied by rate for years * compounds times
5. print results
 */

import java.util.Scanner;

public class Solution13 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the principal amount? ");
        double prin = in.nextDouble();

        System.out.print("What is the rate? ");
        double rate = in.nextDouble();

        System.out.print("What is the number of years? ");
        int yearAmount = in.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int compoundTimes = in.nextInt();

        double investment = prin;

        for(int counter = 0; counter < compoundTimes * yearAmount; counter++)
        {
            investment *= (1 + (rate/100)/compoundTimes);
        }

        System.out.printf("$%.2f invested at %.2f%% for %d years compounded %d times per year is $%.2f."
        , prin, rate, yearAmount, compoundTimes, investment);
    }
}
