package wlist;

import javafx.beans.binding.StringBinding;

public class WListImpl implements WList {
    private Node first,last = null;
    private Integer size = 0;

    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {
        Node cur = first;
        StringBuilder stringBinding = new StringBuilder("Массив: ");
        Integer inddex=0;
        while(cur!=null){
            stringBinding.append(inddex++).append(":").append(cur.value).append(" ");
            cur = cur.next;
        }
        return stringBinding.toString();
    }

    private Node search(Integer index) throws ArrayIndexOutOfBoundsException {
        if(index<0 || index>=size)
            throw new ArrayIndexOutOfBoundsException();
        Node rez;
        if(index<size/2){
            // идем с начала
            rez = first;
            for (int i = 0; i < index; i++) {
                rez = rez.next;
            }
        }else {
            rez = last;
            for (int i = size-1; i > index; i--) {
                rez = rez.prev;
            }
        }
        return rez;

    }
    @Override
    public void add(Integer node) {
        Node add = new Node(node,last,null);

        if(first==null)
            first = last = add;
        else {
            last.next = add;
            last = add;
        }
        size++;
    }

    @Override
    public void add(Integer node, Integer index)  throws ArrayIndexOutOfBoundsException {
        Node rezUp = search(index);
        Node rezDown = rezUp.prev;
        Node one = new Node(node,rezDown,rezUp);
        rezUp.prev = one;
        if(rezDown!=null)
            rezDown.next = one;
        else
            first = one;
        size++;

    }

    @Override
    public void set(Integer node, Integer index) throws ArrayIndexOutOfBoundsException {
        Node rez = search(index);
        rez.value = node;

    }

    @Override
    public Integer get(Integer index)  throws ArrayIndexOutOfBoundsException{
        Node rez = search(index);
        return rez.value;
    }

    @Override
    public Integer pull(Integer index)  throws ArrayIndexOutOfBoundsException{
        Integer rez = get(index);
        delete(index);
        return rez;
    }

    @Override
    public void delete(Integer index)  throws ArrayIndexOutOfBoundsException{
        Node rezDel = search(index);
        Node rezUp = rezDel.next;
        Node rezDown = rezDel.prev;
        if(rezDown!=null)
            rezDown.next = rezUp;
        else
            first = rezUp;
        if(rezUp!=null)
            rezUp.prev = rezDown;
        else
            last = rezDown;
        size--;
    }

    @Override
    public void claer() {
        first = last = null;
        size = 0;
    }
}
