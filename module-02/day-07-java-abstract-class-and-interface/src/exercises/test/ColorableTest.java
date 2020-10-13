/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/13/2020
 * Time: 4:14 PM
 */

package exercises.test;

import exercises.color.Colorable;
import exercises.shape.Circle;
import exercises.shape.Rectangle;
import exercises.shape.Shape;
import exercises.shape.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10, 20);
        shapes[2] = new Square(10);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Area of Circle: " + circle.getArea());
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println("Area of Square: " + square.getArea());
                if (square instanceof Colorable) {
                    square.howToColor();
                }
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Area of Rectangle: " + rectangle.getArea());
            }
        }
    }
}
