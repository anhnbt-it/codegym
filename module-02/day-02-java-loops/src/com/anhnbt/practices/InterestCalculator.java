package com.anhnbt.practices;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amount: "); // số tiền gửi
        double money = sc.nextDouble();

        System.out.println("Enter number of months: "); // số tháng gửi
        double month = sc.nextDouble();

        System.out.println("Enter annual interest rate in percentage: "); // lãi suất
        double interestRate = sc.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }

        System.out.println("Total of interset: " + totalInterest);
    }
}
