/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/14/2020
 * Time: 9:40 AM
 */

package com.anhnbt.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz) {
            return FIZZ + BUZZ;
        } else if (isFizz) {
            return FIZZ;
        } else if (isBuzz) {
            return BUZZ;
        } else {
            return null;
        }
    }
}
