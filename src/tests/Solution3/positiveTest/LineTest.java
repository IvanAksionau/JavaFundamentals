package Solution3.positiveTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import solution3.Line;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Ivan on 24.09.2016.
 */
@RunWith(value = Parameterized.class)
public class LineTest {
    private double a;
    private double b;
    private double h;
    private LinkedHashMap<Double, Double> values;
    private ArrayList<Double> argumentValues;
    private ArrayList<Double> functionValues;
    private ArrayList<Double> testArgumentValues;
    private ArrayList<Double> testFunctionValues;
    @Parameterized.Parameters
    public static Collection<Object[]> setOfParameters() {
        return Arrays.asList(new Object[][]{
                {1, 5, 1},
                {-4, 5, 7},
                {-3, 12, 2}
        });
    }

    public LineTest(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Before
    public void setUp() throws Exception {
        Line line = new Line(a, b, h);
        line.setTableValues();
        values = line.getTableValues();
        argumentValues = new ArrayList<>(values.keySet());
        testArgumentValues = new ArrayList<>();
        functionValues = new ArrayList<>(values.values());
        testFunctionValues = new ArrayList<>();
        for (double argValue = a; argValue <= b; argValue += h) {
            testArgumentValues.add(argValue);
            testFunctionValues.add(Math.tan(argValue));
        }
    }

    @After
    public void tearDown() throws Exception {
        values = null;
    }

    @Test
    public void getTableValues() throws Exception {
        assertArrayEquals(testArgumentValues.toArray(), argumentValues.toArray());
        assertArrayEquals(testFunctionValues.toArray(), functionValues.toArray());
    }


}