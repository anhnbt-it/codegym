/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/14/2020
 * Time: 9:40 AM
 */

package com.anhnbt.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTests {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void fizz3() {
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
    }

    @Test
    void buzz5() {
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
    }

    @Test
    void fizzfuzz() {
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
    }
}
