package wlist;

public class Node {
    public Integer value;
    public Node next;
    public Node prev;

    public Node(Integer value, Node prev, Node next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}
