package sort;

import java.util.List;

public class InsertSort {
    public static List<Integer> insertSort(List<Integer> array){
        for (int i = 1; i < array.size(); i++)
        {
            Integer work = array.get(i);// куда бы его вставить
            int reversIndex = i - 1;
            // ищем место вставки от предыдущего элемента до начала списки
            while (reversIndex >= 0 && array.get(reversIndex) > work)
            {
                array.set(reversIndex + 1,array.get(reversIndex));//сдвигая вперед ненайденное место
                reversIndex = reversIndex - 1;
            }
            // если мы вообще искали(может быть что это число максимально)
            if(reversIndex != i-1)
                array.set(reversIndex + 1, work);// нашли, куда ставляем
        }
        return array;
    }

}
