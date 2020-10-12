package com.anhnbt.practices;

/**
 * Created by IntelliJ IDEA.
 * User: Nguyen Ba Tuan Anh (anhnbt.it@gmail.com)
 * Date: 10/12/2020
 * Time: 11:21 AM
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
        Circle circle2 = new Circle(3.5);
        System.out.println(circle2.toString());
        Circle circle3 = new Circle(3.5, "indigo", false);
        System.out.println(circle3.toString());
    }
}
