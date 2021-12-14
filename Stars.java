/*
 * The Hourglass Star Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-12-14
 */

public class Stars {

    /**
     * The star string used for the hourglass visual.
     */
    private static final String STAR = "*";

    /**
     * The space string used for the gaps in between the stars.
     */
    private static final String SPACE = " ";

    /**
     * Function creates the top half of the hourglass.
     *
     * @param max 
     * @param current 
     *
     * @return top half of the hourglass.
     */
    public String topHalf(final int max, final int current) {
        String result = "";
        if (current != 0) {
            result += "\n";
        }
        if ((current + 1) == max) {
            for (int times = 0; times < current; times++) {
                result += SPACE;
            }
            result += STAR;
        } else {
            final int row = max - current;
            for (int times = 0; times < current; times++) {
                result += SPACE;
            }
            for (int layer = 0; layer < row; layer++) {
                result += STAR;
                result += SPACE;
            }
            result += topHalf(max, current + 1);
        }
        return result;
    }

    /**
     * Function creates the bottom half of the hourglass.
     *
     * @param min
     * @param current 
     * @param value
     *
     * @return bottom half 
     */
    public String bottomHalf(final int min, final int current,
        final int value) {
        String result = "";
        if (current != value) {
            result += "\n";
        }
        if (current == min) {
            for (int times = value; times > current; times--) {
                result += STAR;
                result += SPACE;
            }
        } else {
            final int row = value - current;
            for (int times = value; times > row; times--) {
                result += SPACE;
            }
            for (int layer = value; layer > current; layer--) {
                result += STAR;
                result += SPACE;
            }
            result += bottomHalf(min, current - 1, value);
        }
        return result;
    }
}
