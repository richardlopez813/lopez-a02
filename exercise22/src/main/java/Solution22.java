/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt for first number
2. scan for first number
3. repeat for second number
4. repeat for third number
5. compare numbers
6. print largest number
 */

import java.util.Scanner;

public class Solution22 {
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int largeNum = 0;

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();

        largeNum = num1;

        if(num2 > num1)
            largeNum = num2;
        if(num3 > num2)
            largeNum = num3;

        System.out.printf("The largest number is %d",largeNum);
    }
}
