package com.anhnbt.practices;

public class MinValueArray {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 2, 1, 3, 0, 6, 8};
        if (findMinValue(numbers) == -1) {
            System.out.println("Không tìm thấy phần tử nào!");
        } else {
            System.out.println("Phần tử nhỏ nhất là: " + numbers[findMinValue(numbers)]);
        }
    }
    public static int findMinValue(int[] arr) {
        int minValue = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
                index = i;
            }
        }
        return (index > 0) ? index : -1;
    }
}
