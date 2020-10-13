package practices.comparator;

import practices.comparable.Square;

import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/13/2020
 * Time: 2:07 PM
 */
public class SquareComparator implements Comparator<Square> {

    @Override
    public int compare(Square o1, Square o2) {
        if (o1.getSide() > o2.getSide()) {
            return 1;
        } else if (o1.getSide() < o2.getSide()) {
            return -1;
        } else {
            return 0;
        }
    }
}
