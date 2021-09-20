/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt for people
2. scan number
3. repeat for how many pizza
4. repeat for slices per pizza
5. print how many people with pizzas and slices
6. print how many slices each person gets
7. print leftover pieces
 */

import java.util.Scanner;

public class Solution08 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many people? ");
        int people = in.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizza = in.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = in.nextInt();

        int slicesTotal = slices * pizza;
        int slicePerperson = slicesTotal / people;
        int leftoverSlices = slicesTotal - slicePerperson * people;

        System.out.printf("%d people with %d pizzas (%d slices)\n",people,pizza,slicesTotal);
        System.out.printf("Each person gets %d pieces of pizza.\n",slicePerperson);
        System.out.printf("There are %d leftover slices.\n",leftoverSlices);
    }
}
