package solution3;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Ivan_Aksionau on 9/20/2016.
 */
public class Main {
    public static void main(String[] args) {
        Line line = new Line(1, 100, 9);
        line.setTableValues();
        writeTable(line);
    }

    public static void writeTable(Line line) {
        LinkedHashMap<Double, Double> tableValues = line.getTableValues();
        for (Map.Entry entry : tableValues.entrySet()) {
            System.out.println(entry.getKey() + "    " + entry.getValue());
        }
    }
}

