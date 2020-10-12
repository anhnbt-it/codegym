package com.anhnbt.exercises.point;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/12/2020
 * Time: 2:11 PM
 */
public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2d = new Point2D(10, 15);
        System.out.println(point2d);

        point2d.setX(15);
        point2d.setY(20);
        System.out.println(point2d);

        point2d.setXY(20, 25);
        System.out.print("Point2D X, Y: ");
        for (float e : point2d.getXY()) {
            System.out.print(e + " ");
        }
    }
}
