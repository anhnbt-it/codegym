package practices.comparable;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/13/2020
 * Time: 10:12 AM
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("Red");
        circle.setFilled(false);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println(circle.toString());
    }
}
