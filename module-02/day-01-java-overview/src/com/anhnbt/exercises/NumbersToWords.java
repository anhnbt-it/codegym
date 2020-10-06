package com.anhnbt.exercises;

import java.util.Scanner;

public class NumbersToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1-999 (enter 0 to exit): ");
        String s = "";
        int number = sc.nextInt();
        if (number < 1 || number > 999) {
            System.out.println("Error!");
        } else {
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int unit = number % 10;
            if (number >= 100) {
                switch (hundreds) {
                    case 1: s += "one hundred "; break;
                    case 2: s += "two hundred "; break;
                    case 3: s += "three hundred "; break;
                    case 4: s += "four hundred "; break;
                    case 5: s += "five hundred "; break;
                    case 6: s += "six hundred "; break;
                    case 7: s += "seven hundred "; break;
                    case 8: s += "eight hundred "; break;
                    case 9: s += "nine hundred "; break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + hundreds);
                }
            }
            if (number >= 20) {
                switch (tens) {
                    case 2: s += "twenty "; break;
                    case 3: s += "thirty "; break;
                    case 4: s += "forty "; break;
                    case 5: s += "fifty "; break;
                    case 6: s += "sixty "; break;
                    case 7: s += "seventy "; break;
                    case 8: s += "eighty "; break;
                    case 9: s += "ninety "; break;
                }
            }
            if (number < 20) {
                switch (number) {
                    case 10: s += "ten"; break;
                    case 11: s += "eleven"; break;
                    case 12: s += "twelve"; break;
                    case 13: s += "thirteen"; break;
                    case 14: s += "fourteen"; break;
                    case 15: s += "fifteen"; break;
                    case 16: s += "sixteen"; break;
                    case 17: s += "seventeen"; break;
                    case 18: s += "eighteen"; break;
                    case 19: s += "nineteen"; break;
                }
            }
            if (number > 20 || number < 10) {
                switch (unit) {
                    case 1: s += "one"; break;
                    case 2: s += "two"; break;
                    case 3: s += "three"; break;
                    case 4: s += "four"; break;
                    case 5: s += "five"; break;
                    case 6: s += "six"; break;
                    case 7: s += "seven"; break;
                    case 8: s += "eight"; break;
                    case 9: s += "nine"; break;
                }
            }
            System.out.println(s);
        }
    }
}