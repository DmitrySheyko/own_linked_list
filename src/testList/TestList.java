package testList;

public interface TestList<T> {

    void add(T val);

    boolean add(T val, int index);

    void reverse();

}
