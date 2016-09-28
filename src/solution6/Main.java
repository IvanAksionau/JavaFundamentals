package solution6;

/**
 * Created by Ivan on 26.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Matrix m = new Matrix();
            m.createMass();
        } catch (Exception ex) {
            System.out.println("Invalid data");
        }
    }
}
