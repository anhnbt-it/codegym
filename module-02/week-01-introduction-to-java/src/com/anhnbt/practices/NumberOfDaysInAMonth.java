package com.anhnbt.practices;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NumberOfDaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int month;
            do {
                System.out.println("Enter month between 1 to 12: ");
                while (!sc.hasNextInt()) {
                    String input = sc.next();
                    System.out.printf("\"%s\" is not a valid number. Please input between 1 to 12\n", input);
                }
                month = sc.nextInt();
            } while (month < 1 || month > 12);
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy");
            int year = Integer.parseInt(myDateObj.format(myFormatObj));
            int numDays;
            switch (month) {
                case 2:
                    if (isLeapYear(year)) {
                        numDays = 29;
                    } else {
                        numDays = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numDays = 30;
                    break;
                default:
                    numDays = 31;
            }
            System.out.printf("Year %d; Number of Days: %d; \n", year, numDays);
        } catch (Exception e) {
            System.out.println("Invalid month.");
        }
        sc.close();
    }
    public static boolean isLeapYear(int year) {
        return ((year % 4) == 0 && ((year % 100) != 0 || (year % 400) == 0));
    }
}
