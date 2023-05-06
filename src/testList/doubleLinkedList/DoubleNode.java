package testList.doubleLinkedList;

public class DoubleNode<T> {

    private T val;
    private DoubleNode<T> prev;
    private DoubleNode<T> next;

    public DoubleNode(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public DoubleNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode<T> prev) {
        this.prev = prev;
    }

    public DoubleNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "val=" + val + "; ";
    }

}