package com.anhnbt.practices;

import java.util.Scanner;

public class MaxValueInArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = 0;
    // declares an array of integers
    int[] inputArray;

    do {
      System.out.println("Enter a size: ");
      size = scanner.nextInt();
      if (size > 20) {
        System.out.println("Size should not exceed 20");
      }
    } while (size > 20);

    // allocates memory for size integers
    inputArray = new int[size];
    for (int i = 0; i < inputArray.length; i++) {
      System.out.println("Enter element at index " + (i + 1) + ": ");
      inputArray[i] = scanner.nextInt();
    }

    for (int i = 0; i < inputArray.length; i++) {
      System.out.println("Element at index " + i + ": " + inputArray[i]);
    }

    int maxValue = inputArray[0];
    for (int i = 0; i < inputArray.length; i++) {
      if (maxValue < inputArray[i]) {
        maxValue = inputArray[i];
      }
    }
    System.out.println("Maximum Value is: " + maxValue);

    scanner.close();
  }
  
}
