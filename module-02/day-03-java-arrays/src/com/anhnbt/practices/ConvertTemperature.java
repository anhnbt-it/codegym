package com.anhnbt.practices;

import java.util.Scanner;

public class ConvertTemperature {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice = -1;

    do {
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        choice = scanner.nextInt();

        switch(choice) {
          case 0:
            System.out.println("Exit!");
            System.exit(0);
            break;
          case 1:
            System.out.println("Enter fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
            break;
          case 2:
            System.out.println("Enter Celsius: ");
            double celsius = scanner.nextDouble();
            System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
            break;
          default:
            System.out.println("No choice!");
        }
    } while (choice != 0);
    scanner.close();
  }

  public static double fahrenheitToCelsius(double f) {
    return (5.0 / 9) * (f - 32);
  }

  public static double celsiusToFahrenheit(double c) {
    return (c * 9) / 5 + 32;
  }
  
}
