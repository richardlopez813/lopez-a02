/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt for price of first item
2. scan for price
3. repeat for items 2 and 3
4. Add prices together for subtotal
5. Multiply subtotal by 5.5% for taxes
6. Add subtotal and tax for total
7. print results
 */

import java.util.Scanner;

public class Solution10 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the price of item 1: ");
        String item1 = in.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        String quan1 = in.nextLine();

        System.out.print("Enter the price of item 2: ");
        String item2 = in.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        String quan2 = in.nextLine();

        System.out.print("Enter the price of item 3: ");
        String item3 = in.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        String quan3 = in.nextLine();

        int realItem1 = Integer.parseInt(item1);
        int realItem2 = Integer.parseInt(item2);
        int realItem3 = Integer.parseInt(item3);

        int realQuan1 = Integer.parseInt(quan1);
        int realQuan2 = Integer.parseInt(quan2);
        int realQuan3 = Integer.parseInt(quan3);

        double subtotal = realItem1 * realQuan1 + realItem2 * realQuan2 + realItem3 * realQuan3;
        double tax = subtotal * (5.5/100);
        double total = tax + subtotal;

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, tax, total);
    }
}
