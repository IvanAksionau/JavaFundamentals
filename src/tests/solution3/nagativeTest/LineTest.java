package solution3.nagativeTest;

import org.junit.Test;
import solution3.Line;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Ivan on 24.09.2016.
 */
public class LineTest {
    @Test(expected = NullPointerException.class)
    public void getTableValues() throws Exception {
        Line line = new Line(1, 100, 0);
        line.setTableValues();
    }
}
