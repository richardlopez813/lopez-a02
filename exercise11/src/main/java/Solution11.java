/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt for euro count
2. scan for euro count
3. repeat for exchange rate
4. Multiply euros by exchange rate
5. print results in US Dollars
 */

import java.util.Scanner;

public class Solution11 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many euros are you exchanging? ");
        double euro = in.nextDouble();

        System.out.print("What is the exchange rate? ");
        double exchangeRate = in.nextDouble();

        double usDol = euro *exchangeRate;

        System.out.printf("%.2f euros at an exchange rate of %f is\n%.2f U.S. dollars."
        , euro, exchangeRate, usDol);
    }
}
