package fibanachi;

public class Fibonachi {
    /**
     * экспоненциальная сложность (2 в степени n)
     * @param index
     * @return
     */
    public static Long  getFromNumer(Integer index){
        if (index<3)
            return 1L;
        // рекурсия. Красота
        return getFromNumer(index-1)+getFromNumer(index-2);
    }
    /**
     * линейная сложность (O(n) )
     * @param index
     * @return
     */
    // не рекурсия - быстро, но не очень симпотично
    public static Long  getFromNumer2(Integer index){
        if (index<3)
            return 1L;
        Long l1=1L;
        Long l2 = 1L;
        Long total = 0L;
        for (int i = 2; i < index; i++) {
            total = l2+l1;
            l2 =  l1;
            l1 = total;
        }
        return total;
    }

}
