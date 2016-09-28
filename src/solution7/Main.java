package solution7;

/**
 * Created by Ivan_Aksionau on 9/20/2016.
 */
public class Main extends ShellArray {
    public static void main(String[] args) {
        double[] array = {2.5, 4.8, 22, 1, 33, 14.5, 7, 14.3};
        sortByShell(array);
        System.out.println("Array is sorted! ");
        for (double nam : array) {
            System.out.print(nam + "|");
        }
    }
}
