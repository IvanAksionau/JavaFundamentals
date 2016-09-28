package solution8;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertTrue;

/**
 * Created by Ivan on 27.09.2016.
 */
public class ArrayCombinerTest {
    double[] someNumbersA;
    double[] someNumbersB;

    @Before
    public void setUp() {
        someNumbersA = new double[]{2.3, 7.8, 8.9, 11.2, 16.7, 25.6};
        someNumbersB = new double[]{4.5, 6.6, 8.9, 10.3, 10.3, 11.7, 25.6};
    }

    @Test
    public void setElementPosition() throws Exception {
        ArrayCombiner combiner = new ArrayCombiner(someNumbersA, someNumbersB);
        combiner.setElementPosition();
        LinkedList<Integer> indexForInsert = combiner.getIndexForInsert();
        boolean checker = false;
        for (int i = 0; i < someNumbersB.length; i++) {
            if (someNumbersB[i] <= someNumbersA[indexForInsert.get(i)]) {
                checker = true;
            }
        }
        assertTrue(checker);
    }

}