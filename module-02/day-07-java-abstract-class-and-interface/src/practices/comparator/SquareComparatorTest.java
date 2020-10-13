package practices.comparator;

import practices.comparable.Square;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/13/2020
 * Time: 2:09 PM
 */
public class SquareComparatorTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(10);
        squares[1] = new Square(6, "Red", true);
        squares[2] = new Square(11, "Green", false);

        System.out.println("Pre-sorted:");
        for (Square square : squares) {
            System.out.println(square);
        }
        System.out.println("After-sorted:");
        SquareComparator comparator = new SquareComparator();
        Arrays.sort(squares, comparator);
        for (Square square : squares) {
            System.out.println(square);
        }
    }
}
