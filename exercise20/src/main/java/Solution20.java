/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt for order amount
2. scan for input
3. repeat for state
4. repeat for county
5. print county-specific tax rate
6. print tax + amount for total
 */

import java.util.Objects;
import java.util.Scanner;

public class Solution20 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double tax = 0;

        System.out.print("What is the order amount? ");
        double subtotal = in.nextDouble();

        System.out.print("What is the state you live in? ");
        String state = in.next();

        if(Objects.equals(state, "Wisconsin")){
            tax = 5;

            System.out.print("What county do you live in? ");
            String county = in.nextLine();
            county = in.nextLine();

            if(Objects.equals(county, "Eau Claire"))
                tax += 0.5;
            if(Objects.equals(county, "Dunn"))
                tax += 0.4;
        }
        if(Objects.equals(state, "Illinois")){
            tax = 8;
        }

        double total = subtotal + subtotal * tax/100;

        System.out.printf("The tax is $%.2f.\nThe total is $%.2f."
                , subtotal * tax/100, total);
    }
}
