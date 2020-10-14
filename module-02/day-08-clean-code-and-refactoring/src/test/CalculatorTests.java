/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/14/2020
 * Time: 9:29 AM
 */

package test;

import com.anhnbt.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {
    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("1 + 1 = 2")
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void division() {
        assertEquals(5, calculator.division(10, 2));
    }
}
