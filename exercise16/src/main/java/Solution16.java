/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt for age
2. scan for age
3. compare to legal driving age
4. print whether they can legally drive
 */

import java.util.Scanner;

public class Solution16 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is your age? ");
        int age = in.nextInt();


        System.out.println(age >= 16? "You are old enough to legally drive.":
                "You are not old enough to legally drive.");
    }
}
