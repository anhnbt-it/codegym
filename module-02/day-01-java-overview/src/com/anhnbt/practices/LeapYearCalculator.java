package com.anhnbt.practices;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        do {
            System.out.println("Enter a year: ");
            while (!sc.hasNextInt()) {
                String input = sc.next();
                System.out.printf("\"%s\" is not a valid year.\n", input);
            }
            year = sc.nextInt();
        } while (year < 0);
        if ((year % 4) == 0 && (year % 100 != 0) || (year % 400) == 0) {
            System.out.printf("\"%s\" is a leap year.", year);
        } else {
            System.out.printf("\"%s\" is not a leap year.", year);
        }
    }
}
