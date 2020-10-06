package com.anhnbt.practices;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number!");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }
    public static boolean isPerfectNumber(int n) {
        if (n < 6) return false;
        int i = 1, sum = 0;
        while (i <= (n/2)) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }
        return (sum == n);
    }
}
