package com.anhnbt.exercises;

import java.util.Scanner;

public class AddItemToArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newNumbers = new int[numbers.length+1];
        System.out.print("\nold value: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nEnter index want to add: ");
        int index = sc.nextInt();
        System.out.println("Enter value want to add: ");
        int value = sc.nextInt();
        if (index < 1 || index >= numbers.length-1) {
            System.out.println("Can't add item to array!");
        } else {
            // Add item to array
            for (int i = 0; i < numbers.length; i++) {
                int temp = numbers[i];
                if (i == index) {
                    newNumbers[i] = value;
                    newNumbers[i+1] = temp;
                } else if (i > index) {
                    newNumbers[i+1] = temp;
                } else {
                    newNumbers[i] = temp;
                }
            }
            System.out.print("\nnew value: ");
            for (int newNumber : newNumbers) {
                System.out.print(newNumber + " ");
            }
            System.out.println("\n" + numbers.length);
            System.out.println(newNumbers.length);
        }
    }
}
