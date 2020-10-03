package com.anhnbt.practices;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double width, height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextDouble();

        System.out.println("Enter height: ");
        height = scanner.nextDouble();

        System.out.println("Area is: " + getArea(width, height));
    }

    private static double getArea(double width, double height) {
        return (width * height);
    }
}