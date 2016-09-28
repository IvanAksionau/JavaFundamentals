package Solution4;

import org.junit.Before;
import org.junit.Test;
import solution4.ListForSimpleNum;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Ivan on 24.09.2016.
 */
public class ListForSimpleNumTest {
    ArrayList<Integer> numbersOffIndexes;

    @Before
    public void setUp() {
        int[] paramArray = new int[]{2, 3, 5, 7, 11, 14, 17, 19, -23, 29};
        ListForSimpleNum list = new ListForSimpleNum(paramArray);
        list.findIndexesSimpleElements();
        numbersOffIndexes = new ArrayList<>();
        numbersOffIndexes = list.getIndexList();

    }
    @Test
    public void findIndexesSimpleElements() throws Exception {
        ArrayList<Integer>  expectNumberOffIndexes = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 6, 7, 8, 9));
        assertTrue(numbersOffIndexes.containsAll(expectNumberOffIndexes));

    }

}