package com.anhnbt.practices;

import java.util.Scanner;

public class Rectangle {
    private double width, height;

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter a height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.printf("Your Rectangle: %s%n", rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return (width*height);
    }

    public double getPerimeter() {
        return (width+height)*2;
    }

    public String display() {
        return "Rectangle {width: " + width + ", height: " + height + "}";
    }
}
