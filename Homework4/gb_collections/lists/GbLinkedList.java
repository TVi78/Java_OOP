package Homework4.gb_collections.lists;

import java.util.Iterator;

import Homework4.gb_collections.GbList;
import Homework4.gb_collections.lists.util.ArrayIterator;
import Homework4.gb_collections.lists.util.Node;

public class GbLinkedList<E> implements GbList<E> {
    int size = 0;
    Node<E> head;
    Node<E> next;

    public GbLinkedList() {
    }

    @Override
    public void add(E value) {
        if (head == null) {
            this.head = new Node<>(value);
        } else {
            int i = 0;
            Node<E> tek = head;
            while (tek.getNext() != null) {
                tek = tek.getNext();
            }
            tek.setNext(new Node<>(value));
        }
        size++;
    }

    @Override
    public void add(int index, E value) {
        if (head == null) {
            this.head = new Node<>(value);
            size++;
        } else {
            Node<E> tek = head;
            if (index == 0) {
                if (size > 1) {
                    Node<E> tek_next1 = tek;
                    this.head = new Node<>(value);                   
                    head.setNext(tek_next1);                  
                } 
                size++;
            } else {
                int count = 0;
                Node<E> prev = null;
                Node<E> tek_next = null;

                while (count != index) {
                    tek = tek.getNext();
                    count++;
                }
                prev = tek;
                tek=new Node<>(value);
                tek.setNext(prev);
                tek_next=tek;

                tek = head;
                count=0;

                while (count != index - 1) {
                    tek = tek.getNext();
                    count++;
                }
                tek.setNext(tek_next);
                size++;
            }
        }

    }

    @Override
    public E get(int index) {
        int count = 0;
        Node<E> tek = head;
        while (count != index) {
            tek = tek.getNext();
            count++;
        }
        return tek.getValue();

    }

    @Override
    public void remove(E value) {
        int count = 0;
        Node<E> tek = head;
        while (!tek.getValue().equals(value)) {
            tek = tek.getNext();
            count++;
        }
        if (count == 0) {
            head = head.getNext();
            size--;
        } else if (count == size - 1) {
            tek = head;
            int i = 0;
            while (i < count - 1) {
                tek = tek.getNext();
                i++;
            }
            tek.setNext(null);
            size--;
        } else {
            Node<E> prev = null;
            prev = tek;
            tek.setValue(tek.getNext().getValue());
            tek = tek.getNext();
            prev.setNext(tek.getNext());
            size--;
        }
    }

    @Override
    public void removeByIndex(int index) {
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }
        int count = 0;
        Node<E> prev = null;
        Node<E> tek = head;
        while (count != index) {
            prev = tek;
            tek = tek.getNext();
            count++;
        }
        prev.setNext(tek.getNext());
        size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(toArray());
    }

    public E[] toArray() {
        E[] result = (E[]) new Object[size];
        Node<E> tek = head;
        int i = 0;
        while (tek.getNext() != null) {
            result[i] = tek.getValue();
            i++;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        int i = 0;
        Node<E> tek = head;
        while (tek != null) {
            builder.append(tek.getValue()).append(", ");
            tek = tek.getNext();
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}