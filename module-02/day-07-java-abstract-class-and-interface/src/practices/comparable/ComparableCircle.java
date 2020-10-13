package practices.comparable;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/13/2020
 * Time: 1:38 PM
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() < o.getRadius()) {
            return -1;
        }
        return 1;
    }
}
