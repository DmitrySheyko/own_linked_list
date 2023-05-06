package testList.doubleLinkedList;

import testList.TestList;

public class DoubleLinkedList<T> implements TestList<T> {

    public static final int INITIAL_SIZE_VALUE = 1;

    private DoubleNode<T> head;
    private DoubleNode<T> tail;
    private int size;

    public DoubleLinkedList(T val) {
        this.head = new DoubleNode<>(val);
        this.tail = head;
        this.size = INITIAL_SIZE_VALUE;
    }

    @Override
    public void add(T val) {
        DoubleNode<T> newNode = new DoubleNode<>(val);
        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = newNode;
        size++;
    }

    @Override
    public boolean add(T val, int index) {
        DoubleNode<T> newNode = new DoubleNode<>(val);
        if (index < 0 || index > size) return false;
        if (index == 0) {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        } else if (index == size) {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        } else {
            DoubleNode<T> currentNode = head;
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.getNext();
            }
            newNode.setNext(currentNode.getNext());
            currentNode.getNext().setPrev(newNode);
            newNode.setPrev(currentNode);
            currentNode.setNext(newNode);
        }
        size++;
        return true;
    }

    @Override
    public void reverse() {
        DoubleNode<T> current = head;
        DoubleNode<T> next;
        DoubleNode<T> prev = null;
        tail = current;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            current.setPrev(next);
            prev = current;
            current = next;
        }
        head = prev;
    }

    @Override
    public String toString() {
        DoubleNode<T> nextNode = head;
        StringBuilder result = new StringBuilder(nextNode.toString());
        while (nextNode.getNext() != null) {
            result.append(nextNode.getNext());
            nextNode = (nextNode.getNext());
        }
        return result.toString();
    }

}