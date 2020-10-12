package com.anhnbt.exercises.cylindervolumecalculator;

/**
 * Created by IntelliJ IDEA.
 * User: Nguyen Ba Tuan Anh (anhnbt.it@gmail.com)
 * Date: 10/12/2020
 * Time: 1:43 PM
 */
public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }

    /*
     * Cylinder Volume Calculator V = π*r²*h
     */
    public double getVolume() {
        return height * Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "A Cylinder radius=" + radius
                + ", height=" + height
                + ", color=" + color;
    }
}
