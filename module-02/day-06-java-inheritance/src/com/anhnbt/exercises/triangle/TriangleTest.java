package com.anhnbt.exercises.triangle;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/12/2020
 * Time: 3:52 PM
 */
public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 5, 5, "Green");
        System.out.println(triangle);
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Triangle Area given b = " + triangle.getB() + ": " + triangle.getArea());
    }
}
