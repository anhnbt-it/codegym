package com.anhnbt.exercises;

import java.util.Scanner;

public class MinValueInArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] numbers;
        do {
            System.out.println("Enter a size of array");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("Size does not exceed 10");
            }
        } while (size > 10);
        numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter value at index " + i);
            numbers[i] = scanner.nextInt();
        }
        int minValue = numbers[0];
        for (int number : numbers) {
            if (minValue > number) {
                minValue = number;
            }
        }
        scanner.close();
        System.out.println("Minimum value is: " + minValue);
    }
}
