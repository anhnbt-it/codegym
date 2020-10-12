package com.anhnbt;

/**
 * Created by IntelliJ IDEA.
 * User: Nguyen Ba Tuan Anh (anhnbt.it@gmail.com)
 * Date: 10/12/2020
 * Time: 11:24 AM
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.toString());

        Rectangle rectangle2 = new Rectangle(2.3, 5.8);
        System.out.println(rectangle2.toString());

        Rectangle rectangle3 = new Rectangle(2.5, 5.8, "orange", true);
        System.out.println(rectangle3.toString());
    }
}
