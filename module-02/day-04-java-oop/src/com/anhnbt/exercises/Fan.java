package com.anhnbt.exercises;

public class Fan {
    public final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String toString() {
        if (on) {
            return "{speed=" + speed + ", color=" + color + ", radius=" + radius + "}. Fan is on";
        } else {
            return "{color=" + color + ", radius=" + radius + "}. Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println("Fan1: " + fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        System.out.println("Fan2: " + fan2.toString());
    }
}
