/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/13/2020
 * Time: 2:49 PM
 */

package exercises;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(15);
        rectangle.setLength(20);
        rectangle.setColor("Green");
        rectangle.setFilled(true);
        System.out.println(rectangle.toString());

        System.out.println("Before-resize:");
        System.out.println("Width=" + rectangle.getWidth() + ", Length=" + rectangle.getLength());
        rectangle.resize(20);
        System.out.println("After-resize 20%");
        System.out.println("Width=" + rectangle.getWidth() + ", Length=" + rectangle.getLength());
    }
}
