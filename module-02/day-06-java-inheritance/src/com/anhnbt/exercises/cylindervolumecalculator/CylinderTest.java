package com.anhnbt.exercises.cylindervolumecalculator;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/12/2020
 * Time: 1:47 PM
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10, 10, "Red");
        System.out.println(cylinder);
        System.out.println("Volume=" + cylinder.getVolume());
    }
}
