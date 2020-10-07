package com.anhnbt.practices;

import java.util.Scanner;

public class MinValueInArrayWithMethod {
  public static void main(String[] args) {
    // declares an array of integers
    int[] numbers = {4, 12, 7, 8, 1, 0, 6, 9};
    int index = minValue(numbers);
    System.out.println("The smallest element in the array is: " + numbers[index]);
  }

  public static int minValue(int[] arr) {
    int minValue = arr[0], index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (minValue > arr[i]) {
        minValue = arr[i];
        index = i;
      }
    }
    return (index > 0) ? index : -1;
  }
  
}
