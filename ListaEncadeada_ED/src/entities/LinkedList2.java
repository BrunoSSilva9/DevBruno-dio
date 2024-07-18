package entities;

import java.util.Iterator;
import java.util.NoSuchElementException;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList2<Item> implements Iterable<Item>{
    private Node first;
    private int n;

    private class LinkedIterator implements Iterator<Item>{
        private Node current;

        public LinkedIterator(){
            current = first;
        }

        public boolean hasNext(){
            return current != null;
        }

        @Override
        public Item next() {
            if(!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            
            return item;
        }
    }

    private class Node {
        private Item item;
        private Node next;
    }

    public void addFirst(Item item){
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = first;
        first = newNode;
        n++; 
    }

    public void addLast(Item item){
        if (isEmpty()) {
            addFirst(item);
            return;
        }
        
        Node newNode = new Node();
        newNode.item = item;
        
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        n++;
    }

    public Item removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }

    public Item removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        
        if (n == 1) {
            return removeFirst();
        }
        
        Node current = first;
        while (current.next.next != null) {
            current = current.next;
        }
        
        Item item = current.next.item;
        current.next = null;
        n--;
        return item;
    }

    public int size(){
        return n;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public LinkedList2() {
        first = null;
        n = 0;
    }

    @Override
    public Iterator<Item> iterator() {
        return new LinkedIterator();
    }
}
