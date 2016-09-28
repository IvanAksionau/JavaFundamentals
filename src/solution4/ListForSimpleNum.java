package solution4;

import java.util.ArrayList;

/**
 * Created by Ivan_Aksionau on 9/20/2016.
 */
public class ListForSimpleNum {
    private int[] array;
    private ArrayList<Integer> indexList;

    public ListForSimpleNum(int[] array) {
        this.array = array;
    }

    public ArrayList<Integer> getIndexList() {
        return indexList;
    }

    public void findIndexesSimpleElements() {
        //метка "point"
        indexList = new ArrayList<>();
        point:
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                indexList.add(i);
                continue;
            }
            if (array[i] == 0) {
                continue;
            }
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    //используем метку для перехода к следующей итерации во внешнем цикле
                    continue point;
                }
            }
            indexList.add(i);
        }
    }
    public void writeIndexOffPrimes(){
        if (indexList.size()==0){
            System.out.println("No primes in array");
            return;
        }
        System.out.println("Indexes of primes is :");
        for (int index : indexList) {
            System.out.print(index + ",");
        }
    }
}
