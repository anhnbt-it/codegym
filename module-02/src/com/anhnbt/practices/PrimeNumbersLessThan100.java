package com.anhnbt.practices;

public class PrimeNumbersLessThan100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (PrimeNumber.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
