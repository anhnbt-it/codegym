package com.anhnbt.practices;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        double width, height;

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the width of the Rectangle: ");
            width = scanner.nextDouble();

            System.out.println("Enter the height of the Rectangle: ");
            height = scanner.nextDouble();

            System.out.println("Area of the rectangle is: " + getArea(width, height));
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    private static double getArea(double width, double height) {
        return (width * height);
    }
}
