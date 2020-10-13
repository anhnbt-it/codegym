/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/13/2020
 * Time: 3:09 PM
 */

package exercises;

public class ShapeResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10, 20);
        shapes[2] = new Square(10);
        System.out.println("Before-resize:");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println(circle.toString());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println(rectangle.toString());
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println(square.toString());
            }
        }
        for (Shape shape : shapes) {
            int random = (int) (Math.random() * 100) + 1;
            System.out.println("After-resize: " + random + "%");
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circle.resize(random);
                System.out.println(circle.toString());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                rectangle.resize(random);
                System.out.println(rectangle.toString());
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                square.resize(random);
//                System.out.println(square.toString());
            }
        }
    }
}
