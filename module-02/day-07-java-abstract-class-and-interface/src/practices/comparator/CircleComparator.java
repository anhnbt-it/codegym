package practices.comparator;

import practices.comparable.Circle;

import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/13/2020
 * Time: 1:57 PM
 */
public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() < o2.getRadius()) {
            return -1;
        } else if (o1.getRadius() > o2.getRadius()) {
            return 1;
        } else {
            return 0;
        }
    }
}
