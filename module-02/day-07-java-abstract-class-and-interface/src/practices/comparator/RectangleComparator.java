/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/13/2020
 * Time: 2:13 PM
 */

package practices.comparator;

import practices.comparable.Rectangle;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        if (o1.getWidth() > o2.getWidth()) {
            return 1;
        } else if (o1.getWidth() < o2.getWidth()) {
            return -1;
        } else {
            return 0;
        }
    }
}
