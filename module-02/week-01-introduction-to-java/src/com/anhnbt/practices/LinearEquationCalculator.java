package com.anhnbt.practices;

import java.util.Scanner;

public class LinearEquationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Khởi tạo đối tượng Scanner
        System.out.println("Nhập hằng số a:");
        double a = scanner.nextDouble(); // Nhập dữ liệu từ bàn phím

        System.out.println("Nhập hằng số b:");
        double b = scanner.nextDouble();

        if (a != 0) {
            System.out.printf("Phương trình có nghiệm: %.2f!", (-b / a));
        } else {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }
    }
}
