package com.anhnbt.exercises;

import java.util.Scanner;

public class RemoveItemInArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {4, 12, 7, 8, 1, 0, 6, 9};
        System.out.print("value: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nEnter item want to remove: ");
        int x = sc.nextInt();
        int index = findIndexOf(numbers, x);
        if (index != -1) {
            int[] newArray = removeItemInArray(numbers, index);
            System.out.print("new value: ");
            for (int newNumber : newArray) {
                System.out.print(newNumber + " ");
            }
        } else {
            System.out.println("No item!");
        }
    }

    public static int findIndexOf(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int[] removeItemInArray(int[] arr, int index) {
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = 0;
        return arr;
    }
}
