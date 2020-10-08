package com.anhnbt.exercises;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();

        QuadraticEquation q = new QuadraticEquation(a, b, c);
        double delta = q.getDiscriminant();
        if (delta == 0) {
            System.out.println("The equation has one root: " + q.getRoot());
        } else if (delta >= 0) {
            System.out.println("The equation has two roots: " + q.getRoot1() + " and " + q.getRoot2());
        } else {
            System.out.println("The equation has no real roots");
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (Math.pow(b, 2) - (4 * a * c));
    }

    public double getRoot() {
        return (-b / (2 * a));
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
