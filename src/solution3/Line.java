package solution3;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Ivan_Aksionau on 9/20/2016.
 */
public class Line {
    private double a;
    private double b;
    private double h;
    private LinkedHashMap<Double,Double> tableValues;

    public Line(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public LinkedHashMap<Double, Double> getTableValues() {
        return tableValues;
    }

    public LinkedHashMap<Double,Double> setTableValues(){
        if (h <= 0) {
            System.out.println("Шаг(h) не может быть <=0!");
            throw new NullPointerException();
        }
        tableValues = new LinkedHashMap<>();
        for (double argValue = a; argValue <= b; argValue += h) {
            double funcValue = Math.tan(argValue);
            tableValues.put(argValue,funcValue);
        }
        return tableValues;
    }



}
