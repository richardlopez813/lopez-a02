/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */


/*
1. prompt for number of month
2. scan for number
3. Compare number to number of month
4. print month
 */

import java.util.Scanner;

public class Solution21 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String month = "";

        System.out.print("Please enter the number of the month: ");
        int monthNum = in.nextInt();

        switch(monthNum){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                System.out.print("invalid number");
        }
        System.out.printf("The name of the month is %s.", month);
    }
}
