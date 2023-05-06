package testList.singleLinkedList;

import testList.TestList;

public class SingleLinkedList<T> implements TestList<T> {

    public static final int INITIAL_SIZE_VALUE = 1;

    private SingleNode<T> head;
    private SingleNode<T> tail;
    private int size;

    public SingleLinkedList(T val) {
        this.head = new SingleNode<>(val);
        this.tail = head;
        this.size = INITIAL_SIZE_VALUE;
    }

    @Override
    public void add(T val) {
        SingleNode<T> newNode = new SingleNode<>(val);
        tail.setNext(newNode);
        tail = newNode;
        size++;
    }

    @Override
    public boolean add(T val, int index) {
        SingleNode<T> newNode = new SingleNode<>(val);
        if (index < 0 || index > size) return false;
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else if (index == size) {
            tail.setNext(newNode);
            tail = newNode;
        } else {
            SingleNode<T> currentNode = head;
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.getNext();
            }
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
        }
        size++;
        return true;
    }

    @Override
    public void reverse() {
        SingleNode<T> current = head;
        SingleNode<T> previous = null;
        tail = current;
        while (current != null) {
            SingleNode<T> nextElement = current.getNext();
            current.setNext(previous);
            previous = current;
            current = nextElement;
        }
        head = previous;
    }

    @Override
    public String toString() {
        SingleNode<T> nextNode = head;
        StringBuilder result = new StringBuilder(nextNode.toString());
        while (nextNode.getNext() != null) {
            result.append(nextNode.getNext());
            nextNode = (nextNode.getNext());
        }
        return result.toString();
    }

}