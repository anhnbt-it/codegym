package com.anhnbt.practices;

import java.util.Scanner;

public class DrawMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("---------------------");
        int choice;
        do {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Exit");
                System.exit(0);
            } else if (choice == 1) {
                System.out.println("Draw the triangle");
                for (int i = 0; i < 6; i++) {
                    for (int j = 6; i < j; j--) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            } else if (choice == 2) {
                System.out.println("Draw the square");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            } else if (choice == 3) {
                System.out.println("Draw the rectangle");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            } else {
                System.out.println("No choice!");
            }
        } while (choice != 0);
    }
}
