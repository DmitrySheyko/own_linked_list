package testList.singleLinkedList;

public class SingleNode<T> {

    T val;
    SingleNode<T> next;

    public SingleNode(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public SingleNode<T> getNext() {
        return next;
    }

    public void setNext(SingleNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "val=" + val + "; ";
    }

}