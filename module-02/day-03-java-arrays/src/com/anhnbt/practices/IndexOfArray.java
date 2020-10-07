package com.anhnbt.practices;

import java.util.Scanner;

public class IndexOfArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
    System.out.println("Enter a name student: ");
    String name = scanner.nextLine();
    boolean isExit = false;

    for (int i = 0; i < students.length; i++) {
      if (students[i].equals(name)) {
        System.out.println("Position of the students in the list " + name + " is: " + (i + 1));
        isExit = true;
        break;
      }
    }

    if (!isExit) {
      System.out.println("Not found \"" + name + "\" in the list.");
    }
    scanner.close();
  }
}