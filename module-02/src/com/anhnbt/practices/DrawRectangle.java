package com.anhnbt.practices;

import java.util.Scanner;

public class DrawRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("---------------------------");
        while (choice != 0) {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Exit");
                System.exit(0);
            } else if (choice == 1) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            } else if (choice == 2) {
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            } else if (choice == 3) {
                for (int i = 0; i < 6; i++) {
                    for (int j = 6; j > i; j--) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            } else {
                System.out.println("No choice!");
            }
        }
    }
}
