package com.anhnbt.exercises.cylindervolumecalculator;

/**
 * Created by IntelliJ IDEA.
 * User: Nguyen Ba Tuan Anh (anhnbt.it@gmail.com)
 * Date: 10/12/2020
 * Time: 11:48 AM
 */
public class Circle {
    protected double radius;
    protected String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A Circle radius=" + radius + ", color=" + color;
    }
}
