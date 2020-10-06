package com.anhnbt.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class USDToVND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rateVND = 23204;
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        System.out.println("1 USD = 23.204 VND");
        System.out.println("Enter USD: ");
        double usd = sc.nextDouble();
        System.out.println("$"+ usd + " = " + formatter.format(usd*rateVND)+ " VND");
    }
}
