package com.anhnbt.exercises.triangle;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/12/2020
 * Time: 3:28 PM
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle() {

    }

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double side) {
        this.a = side;
    }

    public double getB() {
        return b;
    }

    public void setB(double side) {
        this.b = side;
    }

    public double getC() {
        return c;
    }

    public void setC(double side) {
        this.c = side;
    }

    public double getPerimeter() {
        return (a + b + c) / 2;
    }

    public double getArea() {
        double h = 0; // height
        if (a == b && a == c) {
            // Tam giac deu, trong do b la do dai canh day
            h = b * (Math.sqrt(3) / 2);
        } else {
            // Tam giac thuong
            double perimeter = getPerimeter();
            h = 2 / (Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c)) / a);
        }
        // For a triangle with base b and height h, the Area is defined as: A = 1/2 * b * h
        return (b * h) / 2;
    }

    @Override
    public String toString() {
        return "A Triangle a=" + a
                + ", b=" + b
                + ", c=" + c
                + ", color=" + getColor();
    }
}
