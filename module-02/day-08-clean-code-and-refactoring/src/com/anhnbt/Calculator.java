package com.anhnbt;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/14/2020
 * Time: 9:23 AM
 */

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b != 0)
            return a / b;
        else
            throw new RuntimeException("Can not divide by 0");
    }

    public int modulus(int a, int b) {
        return a % b;
    }
}
