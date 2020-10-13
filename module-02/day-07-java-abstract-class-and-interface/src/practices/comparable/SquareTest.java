package practices.comparable;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/13/2020
 * Time: 10:39 AM
 */
public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(10);
        square.setColor("Orange");
        square.setFilled(true);

        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
