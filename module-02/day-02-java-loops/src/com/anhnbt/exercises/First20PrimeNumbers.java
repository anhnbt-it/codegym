package com.anhnbt.exercises;

import java.util.Scanner;

public class First20PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 0, counter = 0; counter < number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                counter++;
            }
        }
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return num > 1;
    }
}
