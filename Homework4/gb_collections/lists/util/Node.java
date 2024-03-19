package Homework4.gb_collections.lists.util;

/**
 * Node
 */
public class  Node<T> {
    private T value;
    

    private Node<T> next;

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
    public Node(T value) {
        this.value = value;
        this.next = null;
        // this.prev = null;
    }    

    @Override
    public String toString() {
        return value.toString();
    }
}