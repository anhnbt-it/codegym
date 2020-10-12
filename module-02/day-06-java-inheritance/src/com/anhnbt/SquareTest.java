package com.anhnbt;

/**
 * Created by IntelliJ IDEA.
 * User: Nguyen Ba Tuan Anh (anhnbt.it@gmail.com)
 * Date: 10/12/2020
 * Time: 11:38 AM
 */
public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(2.3, "yellow", true);
        System.out.println(square);
    }
}
