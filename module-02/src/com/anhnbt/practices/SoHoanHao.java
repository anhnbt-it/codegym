package com.anhnbt.practices;

import java.util.Scanner;

public class SoHoanHao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (isSoHoanHao(number)) {
            System.out.println(number + " la so hoan hao");
        } else {
            System.out.println(number + " khong phai la so hoan hao");
        }
    }
    public static boolean isSoHoanHao(int n) {
        int sum = 0;
        if (n < 6) return false;
        for (int i = 1; i <= (n/2); i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return (sum == n);
    }
}
