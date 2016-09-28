package solution4;

/**
 * Created by Ivan_Aksionau on 9/21/2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {8, -3, 5, 7, 8, 13, 8, 19, 23, 8};
        ListForSimpleNum list = new ListForSimpleNum(array);
        list.findIndexesSimpleElements();
        list.writeIndexOffPrimes();
    }
}
