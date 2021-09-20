/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt whether you want to convert from celsius to fahrenheit or vice versa
2. scan for input
3. repeat with temperature
4. take temperature and plug into conversion equation
5. print result
 */

import java.util.Scanner;

public class Solution18 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int startingTemp;
        int converted = 0;
        String tempType = "";

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String temp = in.nextLine();

        if(temp.toUpperCase().equals("C"))
            tempType = "Fahrenheit";
        if(temp.toUpperCase().equals("F"))
            tempType = "Celsius";

        System.out.printf("Please enter the temperature in %s: ", tempType);
        startingTemp = in.nextInt();

        if(temp.toUpperCase().equals("C")){
            converted = (startingTemp - 32) * (5/9);
            tempType = "Celsius";
        }
        if(temp.toUpperCase().equals("F")){
            converted = (startingTemp * (9/5)) + 32;
            tempType = "Fahrenheit";
        }

        System.out.printf("The temperature in %s is %d", tempType, converted);

    }
}
