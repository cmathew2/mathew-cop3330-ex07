/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("What is the length of the room in feet? ");
        String length = in.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String width = in.nextLine();

        //number conversion
        int l = Integer.parseInt(length);
        int w = Integer.parseInt(width);

        //math and unit conversion
        int area = l * w;
        double meter = 0.09290304;
        double conv = area * meter;

        //output
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.\nThe area is\n" + area + " square feet\n" + conv + " square meters\n" + "The formula for this conversion is m2 = f2 × 0.09290304");

    }
}
