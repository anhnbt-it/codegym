package exercises;

public class Circle {
    private final double radius = 1.0;

    public Circle() {}

    protected double getArea() {
        return (radius * radius * Math.PI);
    }

    protected double getRadius() {
        return radius;
    }
}
