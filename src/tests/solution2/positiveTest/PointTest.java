package solution2.positiveTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import solution2.Point;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Ivan_Aksionau on 9/20/2016.
 */
@RunWith(value = Parameterized.class)
public class PointTest {
    private double x;
    private double y;
    @Parameterized.Parameters
    public static Collection<Object[]> setOfParameters() {
        return Arrays.asList(new Object[][]{
                {4, 5},
                {-4, 5},
                {-3, -2},
                {5, -1.5},
                {4.7, -3},
                {0, 0},
        });
    }

    public PointTest(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Test
    public void tstConstructor() {
        Point point  = new Point (5.7, 8);
        Assert.assertEquals(5.7,point.getX(),0.01);
        Assert.assertEquals(8,point.getY(),0.01);
    }
    @Test
    public void checkPoint()  {

        Point point = new Point(x,y);
        Assert.assertTrue(point.checkPoint());
    }

}