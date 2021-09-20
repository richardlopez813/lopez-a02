/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt for order amount
2. scan for amount
3. repeat for state
4. print amount as subtotal
5. print tax as tax
6. print subtotal + subtotal * tax = total
 */

import java.util.Objects;
import java.util.Scanner;

public class Solution14 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double tax = 0;

        System.out.print("What is the order amount? ");
        double subtotal = in.nextDouble();

        System.out.print("What is the state? ");
        String state = in.next();

        if(Objects.equals(state, "WI")){
            tax = 5.5;
        }

        double total = subtotal + subtotal * tax/100;

        System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f."
        , subtotal, subtotal * tax/100, total);
    }
}
