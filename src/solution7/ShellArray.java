package solution7;

/**
 * Created by Ivan_Aksionau on 9/20/2016.
 */
public class ShellArray {
    public static void sortByShell(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    double swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
    }
}
