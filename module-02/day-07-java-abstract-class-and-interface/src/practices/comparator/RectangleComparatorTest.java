/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/13/2020
 * Time: 2:15 PM
 */

package practices.comparator;

import practices.comparable.Rectangle;

import java.util.Arrays;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(10, 20);
        rectangles[2] = new Rectangle(15, 20, "Green", false);
        System.out.println("Pre-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
        System.out.println("After-sorted");
        RectangleComparator comparator = new RectangleComparator();
        Arrays.sort(rectangles, comparator);
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
