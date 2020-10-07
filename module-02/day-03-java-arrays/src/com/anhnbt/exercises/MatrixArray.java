package com.anhnbt.exercises;

import java.util.Scanner;

public class MatrixArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows of the matrix between 1 - 5: ");
        int rows = scanner.nextInt();
        System.out.println("Enter columns of the matrix between 1 - 5: ");
        int columns = scanner.nextInt();
        if ((rows < 1) || (columns < 1) || (rows > 5) || (columns > 5)) {
            System.out.println("So luong hang va cot khong nam trong khoang 1 - 5");
        } else {
            System.out.println("Ma tran " + rows + "x" + columns);
            double[][] boards = new double[rows][columns];
            double max = boards[0][0];
            int rowIndex = 0, columnIndex = 0, counter = 1;
            for (int row = 0; row < boards.length; row++) {
                for (int column = 0; column < boards[row].length; column++) {
                    System.out.println("Element " + counter + " at row " + row + " and column " + column);
                    boards[row][column] = scanner.nextInt();
                    counter++;
                }
            }

            // Find max value
            for (int i = 0; i < boards.length; i++) {
                for (int j = 0; j < boards[i].length; j++) {
                    if (max < boards[i][j]) {
                        max = boards[i][j];
                        rowIndex = i;
                        columnIndex = j;
                    }
                }
            }
            System.out.println("Maximum value is: " + max + ", row: " + rowIndex + ", column: " + columnIndex);
        }
    }
}
