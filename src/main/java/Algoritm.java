import sort.InsertSort;

import java.util.Arrays;
import java.util.List;

public class Algoritm {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1,2,4,6,7,2,9,9,4,3,3,5,6,8,9,5,3,7,0,3);
        System.out.println("Несортированный: "+array.toString());
        System.out.println("Cортированный: "+ InsertSort.insertSort(array).toString());
    }
}
