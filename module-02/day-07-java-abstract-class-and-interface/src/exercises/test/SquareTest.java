/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/13/2020
 * Time: 3:01 PM
 */

package exercises.test;

import exercises.shape.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(10);
        square.setColor("White");
        square.setFilled(true);
        System.out.println(square.toString());
        System.out.println("Before-resize");
        System.out.println(square.getSide());
        square.resize(2);
        System.out.print("After-resize 2%:");
        System.out.println(square.getSide());
    }
}
