/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt for length of room
2. scan number
3. repeat for width
4. print their inputs
5. multiply inputs
6. convert product
7. print area in feet
8. print area in meters
 */

import java.util.Scanner;

public class Solution07 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        final double conversionFactor = 0.09290304;

        System.out.print("What is the length of the room in feet? ");
        int roomLength = in.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int roomWidth = in.nextInt();

        System.out.printf("You entered dimensions of %d feet by %d feet.",roomLength,roomWidth);

        int areaFeet = roomLength * roomWidth;
        double areaMeter = (double) areaFeet * conversionFactor;

        System.out.printf("The area is\n%d square feet\n%.3f square meters", areaFeet, areaMeter);
    }
}
