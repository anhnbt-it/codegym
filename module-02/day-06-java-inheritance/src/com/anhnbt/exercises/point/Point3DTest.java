package com.anhnbt.exercises.point;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/12/2020
 * Time: 2:15 PM
 */
public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3d = new Point3D(5, 10, 15);
        System.out.println(point3d);

        point3d.setX(10);
        point3d.setY(15);
        point3d.setZ(20);
        System.out.println(point3d);

        point3d.setXYZ(50, 100, 150);
        System.out.print("Point3D X, Y, Z: ");
        for (float e : point3d.getXYZ()) {
            System.out.print(e + " ");
        }
    }
}
