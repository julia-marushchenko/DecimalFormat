package com.formatting;

// Program to demonstrate formatting numbers

import java.text.DecimalFormat;

// Main class
public class Main {

    // Method main to run java program
    public static void main(String[] args) {

        //Number to format
        double number = 731.8265;

        // Prints only numeric part of floating number
        DecimalFormat df = new DecimalFormat("####");
        System.out.println("Without fraction part: number = " + df.format(number));

        // Prints up to 2 decimal places
        df = new DecimalFormat("#.##");
        System.out.println("With 2 decimal places: number = " + df.format(number));

        // Automatically adds zeros to the most right   of the number
        df = new DecimalFormat("#.000000");
        System.out.println("Appended zeros: number = " + df.format(number));

        // Automatically adds zeros to the most left part of the number
        df = new DecimalFormat("00000.00");
        System.out.println("Appended zeros: number = " + df.format(number));

        // Formatting money in dollars
        df = new DecimalFormat("$###,###.##");
        System.out.println("Appended zeros: number = " + df.format(number));
    }
}