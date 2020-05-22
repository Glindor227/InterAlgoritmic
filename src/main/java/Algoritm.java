import fibanachi.Fibonachi;
import sort.InsertSort;
import wlist.WList;
import wlist.WListImpl;

import java.util.Arrays;
import java.util.List;

public class Algoritm {
    public static void main(String[] args) {
/*
        List<Integer> array = Arrays.asList(1,2,4,6,7,2,9,9,4,3,3,5,6,8,9,5,3,7,0,3);
        System.out.println("Несортированный: "+array.toString());
        System.out.println("Cортированный: "+ InsertSort.insertSort(array).toString());
        */
/*
        int num = 5; System.out.println("Фибоначи для "+num+" равно "+ Fibonachi.getFromNumer(num));
        num = 15; System.out.println("Фибоначи для "+num+" равно "+ Fibonachi.getFromNumer(num));
        num = 25; System.out.println("Фибоначи для "+num+" равно "+ Fibonachi.getFromNumer(num));
        num = 35; System.out.println("Фибоначи для "+num+" равно "+ Fibonachi.getFromNumer(num));
        num = 45; System.out.println("Фибоначи для "+num+" равно "+ Fibonachi.getFromNumer2(num));
        */

        WListImpl wList = new WListImpl();
        wList.add(0);
        wList.add(2);
        wList.add(4);
        wList.add(6);
        wList.add(8,0);
        System.out.println(wList.toString());
        wList.delete(1);
        System.out.println(wList.toString());
        System.out.println(wList.get(3));
        System.out.println(wList.pull(3));
        System.out.println(wList.toString());
        wList.add(4);
        System.out.println(wList.toString());
        wList.set(0,1);
        System.out.println(wList.toString());



    }
}
