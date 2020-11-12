//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// Section: 1
// Assignment: HW2 Part2
// Description: This class contains a Bag Implementation
//-----------------------------------------------------

package Part2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item> {

    private Node<Item> first;    // first item
    private int N;               // number of elements

    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    // Initialize an empty bag
    public Bag() {
        first = null;
        N = 0;
    }

    // Checks the bag is empty or not
    public boolean isEmpty() {
        return first == null;
    }


    // Returns the number of items in the bag
    public int getSize() {
        return N;
    }

    // adds an item to bag
    public void add(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        N++;
    }



    // Returns an iterator that iterates over the items in the bag in arbitrary order
    public Iterator<Item> iterator() {
        return new LinkedIterator(first);
    }

    private class LinkedIterator implements Iterator<Item> {
        private Node<Item> current;

        public LinkedIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException(); // Throws NoSuchElementException if item doesn't have next
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    // Class Tester
    public static void main(String[] args) {
    Bag bag = new Bag();
    bag.add(1);
    bag.add(2);
    bag.add(3);
    System.out.println(bag.isEmpty()); // false
    System.out.println(bag.getSize()); // 3
    }
}
