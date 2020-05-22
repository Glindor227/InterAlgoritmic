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
        // рекурсия. Красота vs Производительность
        return getFromNumer(index-1)+getFromNumer(index-2);

    }
}
