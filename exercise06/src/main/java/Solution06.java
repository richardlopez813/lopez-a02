/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt for current age
2. scan for age
3. repeat for retirement age
4. print difference between ages
5. print current year and retirement year
 */

import java.util.Scanner;
import java.time.Year;

public class Solution06 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("what is your current age? ");
        String currentAge = in.nextLine();

        System.out.print("what age would you like to retire? ");
        String retirementAge = in.nextLine();

        int currentAge1 = Integer.parseInt(currentAge);
        int retirementAge1 = Integer.parseInt(retirementAge);

        int yearsLeft = retirementAge1 - currentAge1;
        int currentYear = Year.now().getValue();
        int retirementYear = currentYear + yearsLeft;

        System.out.printf("You have %d years left until you can retire.\n" +
                "It's %d, so you can retire in %d.", yearsLeft, currentYear, retirementYear);
    }
}
