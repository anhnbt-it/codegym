package com.anhnbt.practices;

import java.util.Scanner;

public class First20PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 0, counter = 0; counter < number; i++) {
            if (PrimeNumber.isPrime(i)) {
                System.out.print(i + " ");
                counter++;
            }
        }
    }
}
