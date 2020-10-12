package com.anhnbt.practices;

/**
 * Created by IntelliJ IDEA.
 * User: Nguyen Ba Tuan Anh (anhnbt.it@gmail.com)
 * Date: 10/12/2020
 * Time: 9:48 AM
 */
public class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + ((filled) ? "filled" : "not filled");
    }
}
