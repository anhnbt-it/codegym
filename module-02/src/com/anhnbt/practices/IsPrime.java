package com.anhnbt.practices;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number < 2) {
            System.out.println(number + " is not a number!");
        } else {
            boolean check = true;
            int count = 2;
            while (count <= Math.sqrt(number)) {
                if (number % count < 1) {
                    check = false;
                    break;
                }
                count++;
            }
            if (check) {
                System.out.println(number + " is a prime!");
            } else {
                System.out.println(number + " is not a prime!");
            }
        }
    }
}
