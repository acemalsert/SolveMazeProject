//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// Section: 1
// Assignment: HW2 Part1
// Description: This class contains a Stack Implementation
//-----------------------------------------------------

package Part1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<Item> implements Iterable<Item> {
    private Node<Item> first;     // top of stack
    private int N; // size of the stack

    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    // Initializes an empty stack
    public Stack() {
        first = null;
        N = 0;
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return first == null;
    }

    // Returns the size
    public int getSize() { return N; }


    // pushes item to the stack
    public void push(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        N++;
    }


    // removes item most recently added from the stack
    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = first.item;        // save item to return
        first = first.next;            // delete first node
        N--;
        return item;                   // return the saved item
    }

    // Returns the most recently added item
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }

    // Returns the string representation of the stack
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this) {
            s.append(item);
            s.append(' ');
        }
        return s.toString();
    }

    // Returns an iterator in LIFO order
    public Iterator<Item> iterator() {
        return new LinkedIterator(first);
    }

    // an iterator, doesn't implement remove() since it's optional
    private class LinkedIterator implements Iterator<Item> {
        private Node<Item> current;

        public LinkedIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

        // class tester
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Ankara");
        stack.push("İstanbul");
        stack.push("Mersin");
        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.getSize()); //3
        stack.pop(); // removes Mersin
        System.out.println(stack.peek()); // İstanbul

    }
}
