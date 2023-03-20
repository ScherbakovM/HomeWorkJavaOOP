package Seminar4.GBLinkedList;

import java.util.Iterator;

public class GBLinkedList<E> implements Iterator<GBNode> {
    GBNode<E> head = null;
    GBNode<E> tail = null;
    int length = 0;

    public GBLinkedList() {
    }

    public void append(E element) {
        GBNode<E> newNode = new GBNode(element);
        if (this.head == null && this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        }

        this.tail.next = newNode;
        this.tail = newNode;
        ++this.length;
    }

    public void prepend(E element) {
        GBNode<E> newNode = new GBNode(element);
        GBNode<E> temp = this.head;
        this.head = newNode;
        this.head.next = temp;
        if (this.tail == null) {
            this.tail = newNode;
        }

        ++this.length;
    }

    public int length() {
        return this.length;
    }

    public String toString() {
        GBNode<E> currentNode = this.head;

        StringBuilder nodes;
        for (nodes = new StringBuilder(); currentNode != null; currentNode = currentNode.next) {
            if (currentNode.next == null) {
                nodes.append(currentNode);
            } else {
                nodes.append(currentNode).append(" ");
            }
        }

        return nodes.toString();
    }

    public boolean hasNext() {
        return this.tail.next != null;
    }

    public GBNode<E> next() {
        GBNode<E> currentNode = this.head;

        int index;
        for (index = 0; this.hasNext(); currentNode = this.head.next) {
        }

        ++index;
        return currentNode;
    }

    public GBNode<E> getIndex(int index) {
        GBNode<E> currentNode = this.head;
        GBNode<E> result = null;

        for (int i = 0; currentNode != null; currentNode = currentNode.next) {
            if (i == index) {
                return currentNode;
            }

            ++i;
        }

        return (GBNode) result;
    }
}
