/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/13/2020
 * Time: 2:37 PM
 */

package exercises.test;

import exercises.shape.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("Green");
        circle.setFilled(true);
        System.out.println(circle.toString());

        System.out.println("Before-resize:");
        System.out.println(circle.getRadius());
        System.out.println("After-resize:");
        circle.resize(10);
        System.out.println(circle.getRadius());
    }
}
