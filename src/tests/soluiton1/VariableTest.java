package soluiton1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


/**
 * Created by Ivan on 23.09.2016.
 */
@RunWith(value = Parameterized.class)
public class VariableTest {
    private double x;
    private double y;
    private double expectedResult;
    @Parameterized.Parameters
    public static Collection<Object[]> setOfParameters() {
        return Arrays.asList(new Object[][]{
                {4.7, 1.5, 4.854561002452578},
                {1.45, 8.5, 1.8147317640343734},
                {55.7, 22.11, 55.725035258554044}
        });
    }

    public VariableTest(double x, double y, double expectedResult) {
        this.x = x;
        this.y = y;
        this.expectedResult = expectedResult;
    }

    @Test
    public void calculateTheValue() {
        Variable var = new Variable(x, y);
        double actualResult = var.calculateTheValue();
        Assert.assertTrue(expectedResult == actualResult);
    }
    @Test
    public void tstConstructor() {
        Variable var = new Variable(5.7, 8);
        Assert.assertEquals(5.7,var.getX(),0.01);
        Assert.assertEquals(8,var.getY(),0.01);
    }
}