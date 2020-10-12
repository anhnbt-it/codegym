package com.anhnbt.exercises.movablepoint;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/12/2020
 * Time: 3:08 PM
 */
public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablepoint = new MovablePoint(10, 10, 5, 5);
        System.out.println(movablepoint);
        movablepoint.move();
        System.out.println(movablepoint);
    }
}
