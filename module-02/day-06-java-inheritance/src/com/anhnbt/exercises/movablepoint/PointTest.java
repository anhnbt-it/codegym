package com.anhnbt.exercises.movablepoint;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/12/2020
 * Time: 2:44 PM
 */
public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(10, 10);
        System.out.println(point);

        point.setX(15);
        point.setY(20);
        System.out.println(point);

        point.setXY(50, 100);
        System.out.print("Point X, Y: ");
        for (float e : point.getXY()) {
            System.out.print(e + " ");
        }
    }
}
