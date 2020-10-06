package com.anhnbt.practices;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        double weight, height, BMI;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Your height (meters): ");
            while (!sc.hasNextDouble()) {
                String input = sc.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
            }
            height = sc.nextDouble();
            System.out.println("Your weight (kilogram): ");
            weight = sc.nextDouble();
        } while (weight < 0 || height < 0);

        BMI = (weight / Math.pow(height, 2));
        System.out.println(weight);
        System.out.println(height);
        System.out.println(Math.pow(height, 2));
        System.out.printf("%-20s%s", "BMI", "Interpretation\n");

        if (BMI < 18.5) {
            System.out.printf("%-20.2f%s", BMI, "Underweight");
        } else if (BMI < 25.0) {
            System.out.printf("%-20.2f%s", BMI, "Normal");
        } else if (BMI < 30.0) {
            System.out.printf("%-20.2f%s", BMI, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", BMI, "Obese");
        }
    }
}
