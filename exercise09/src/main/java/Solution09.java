/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. Prompt for the length and width
2. Calculate area
3. Divide by area covered by one gallon of paint
4. Round up how many gallons you need
5. Display the number of gallons needed to paint the ceiling.
 */

import java.util.Scanner;

public class Solution09 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        final double sqrFtperGal = 350;

        System.out.print("How many square feet is room you're painting? ");
        double roomSqrft = in.nextInt();

        int galBuy = (int) Math.ceil(roomSqrft/sqrFtperGal);

        System.out.printf("You will need to purchase %d gallons of paint to " +
                "cover %d square feet.",galBuy,(int) roomSqrft);
    }
}
