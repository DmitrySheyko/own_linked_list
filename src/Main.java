import testList.doubleLinkedList.DoubleLinkedList;
import testList.TestList;
import testList.singleLinkedList.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        TestList<Integer> list1 = new SingleLinkedList<>(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(100, 3);
        System.out.println("SingleLinkedList before reverse: " + list1);
        list1.reverse();
        System.out.println("SingleLinkedList after reverse: " + list1);

        TestList<Integer> list2 = new DoubleLinkedList<>(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(100, 3);
        System.out.println("DoubleLinkedList before reverse: " + list2);
        list2.reverse();
        System.out.println("DoubleLinkedList after reverse: " + list2);
    }
}