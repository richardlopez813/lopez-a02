/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt for username and password
2. scan for username and password
3. compare input with actual password
4. if it's right, print right if wrong print wrong
 */

import java.util.Objects;
import java.util.Scanner;

public class Solution15 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("what is the username? ");
        String username = in.nextLine();

        System.out.printf("what is the password? ");
        String password = in.nextLine();

        if(Objects.equals(password, "abc$123"))
             System.out.print("Welcome!");
        else
            System.out.print("I don't know you.");
    }
}
