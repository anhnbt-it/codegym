package com.anhnbt.practices;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        int[] myNumbers;
        do {
            System.out.println("Enter a size of array: ");
            size = sc.nextInt();

            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        myNumbers = new int[size];
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Enter element of " + (i + 1) + ": ");
            myNumbers[i] = sc.nextInt();
        }

        // Array reverse
        for (int i = 0; i < (myNumbers.length / 2); i++) {
            int temp = myNumbers[i];
            myNumbers[i] = myNumbers[size - 1 - i];
            myNumbers[size - 1 - i] = temp;
        }

        // Print
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.print(myNumbers[i] + " \t");
        }
        sc.close();
    }
}
