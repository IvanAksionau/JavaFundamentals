package solution8;

/**
 * Created by Ivan on 27.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        double[] someNumbers1 = {2.3, 7.8, 8.9, 11.2, 16.7, 25.6};
        double[] someNumbers2 = {4.5, 6.6, 8.9, 10.3, 10.3, 11.7, 25.6};
        ArrayCombiner combiner = new ArrayCombiner(someNumbers1,someNumbers2);
        combiner.setElementPosition();
        combiner.printInsertPlace();
    }
}
