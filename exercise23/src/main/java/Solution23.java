/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
1. prompt user asking whether car is silent when key is turned
2. scan for input
3. if yes then ask if batteries are corroded
4. if yes print response
5. if no print response
6. if no for car silent when key turned prompt does car making slick noise
7. if yes print response
8. if else ask does car crank up but fail to start
9. if yes print response
10. if no ask does engine start then die
11. if yes then ask if vehicle has fuel injection
12. if yes print response
13. if no print response
14. if no to ask does engine start then die print "this is not possible"
 */

import java.util.Objects;
import java.util.Scanner;

public class Solution23 {
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Is the car silent when you turn the key? ");
        String response = in.next();

        if(Objects.equals(response, "y")) {
            System.out.print("Are the battery terminals corroded? ");
            response = in.next();

            if(Objects.equals(response, "y"))
                System.out.print("Clean terminals and try starting again.");
            else
                System.out.print("Replace cables and try again.");
        }
        else{
            System.out.print("Does the car make a slicking noise? ");
            response = in.next();

            if(Objects.equals(response, "y")) {
                System.out.print("Replace the battery.");
            }
            else{
                System.out.print("Does the car crank up but fail to start? ");
                response = in.next();

                if(Objects.equals(response, "y"))
                    System.out.print("Check spark plug connections.");
                else{
                    System.out.print("Does the engine start and then die? ");
                    response = in.next();

                    if(Objects.equals(response, "y")){
                        System.out.print("Does you car have fuel injection? ");
                        response = in.next();

                        if(Objects.equals(response, "y"))
                            System.out.print("Get it in for service.");
                        else
                            System.out.print("Check to ensure the choke is opening and closing.");
                    }
                    else
                        System.out.print("This should not be possible.");
                }
            }
        }
    }
}
