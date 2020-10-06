package com.anhnbt.practices;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double a = sc.nextDouble();

        System.out.println("Enter b number: ");
        double b = sc.nextDouble();

        if (a < 1 || b < 1) {
            System.out.println("No greatest common factor");
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            while (a != b) {
                if (a > b) {
                    a = a -b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("Greatest common factor: " + a);
        }
    }
}
