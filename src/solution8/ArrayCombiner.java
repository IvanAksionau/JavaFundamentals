package solution8;

import java.util.LinkedList;

/**
 * Created by Ivan on 27.09.2016.
 */
public class ArrayCombiner {
    private double[] arrayA;
    private double[] arrayB;
    private LinkedList<Double> elements;
    private LinkedList<Integer> indexForInsert;

    public ArrayCombiner(double[] arrayA, double[] arrayB) {
        this.arrayA = arrayA;
        this.arrayB = arrayB;
    }

    public LinkedList<Double> getElements() {
        return elements;
    }

    public LinkedList<Integer> getIndexForInsert() {
        return indexForInsert;
    }

    public void setElementPosition() {
        elements = new LinkedList<Double>();
        indexForInsert = new LinkedList<Integer>();
        point: for (int i = 0; i < arrayB.length; i++) {
            for (int j = 0; j < arrayA.length; j++) {
                if (arrayB[i] <= arrayA[j]) {
                    elements.add(arrayB[i]);
                    indexForInsert.add(j);
                    continue point;
                }
            }
        }
    }
    public void printInsertPlace(){
        for (int i = 0; i < elements.size(); i++){
            System.out.println("Index for element " + elements.get(i) + " is " + indexForInsert.get(i));
        }
    }

}
