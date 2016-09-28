package solution2.negativeTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import solution2.Point;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Ivan on 24.09.2016.
 */
@RunWith(value = Parameterized.class)
public class PointTest {
    private double x;
    private double y;
    @Parameterized.Parameters
    public static Collection<Object[]> setOfParameters() {
        return Arrays.asList(new Object[][]{
                {-6, 2},
                {5, 3},
                {-6, -4},
                {6, 4},
                {0, -5},
                {0, -6},
        });
    }

    public PointTest(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Test
    public void checkPoint()  {

        Point point = new Point(x,y);
        Assert.assertFalse(point.checkPoint());
    }

}
