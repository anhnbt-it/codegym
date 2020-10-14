/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/14/2020
 * Time: 11:09 AM
 */

package com.anhnbt.cylinder;

public class Cylinder {
    private double radius;

    public Cylinder() {

    }

    public Cylinder(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(10);

        double radius = cylinder.getRadius();
        double height = 10;

        double perimeter = getPerimeter(radius);
        double area = getArea(radius);
        double volume = getVolume(radius, height);
    }

    public static double getVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static double getArea(double radius) {
        return radius * radius * Math.PI;
    }

    public static double getPerimeter(double radius) {
        return 2 * radius * Math.PI;
    }

}
