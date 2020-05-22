package wlist;

public interface WList {
    void add(Integer node);
    void add(Integer node,Integer index);// вставить на данную позицию
    void set(Integer node,Integer index);// заменить элемент
    Integer get(Integer index);//получить данные
    Integer pull(Integer index);//извлечь данные
    void delete(Integer index);//удалить данные
    void claer();

}
