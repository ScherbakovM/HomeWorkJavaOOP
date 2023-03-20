package Seminar4.GBLinkedList;

public class GBNode<T> {
    T value;
    GBNode<T> next;

    public GBNode(T value, GBNode<T> next) {
        this.value = value;
        this.next = next;
    }

    public GBNode(T value) {
        this(value, (GBNode)null);
    }

    public String toString() {
        return this.value.toString();
    }
}