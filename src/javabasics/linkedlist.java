package javabasics;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {

        // Add 5 fruits in a linked list
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Traverse using Iterator
        System.out.println("Traversal using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Traverse using for-each loop
        System.out.println("\nTraversal using For-Each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Create another collection
        LinkedList<String> moreFruits = new LinkedList<>();
        moreFruits.add("Pineapple");
        moreFruits.add("Watermelon");
        moreFruits.add("Kiwi");

        // Merging one collection into another
        fruits.addAll(moreFruits);

        System.out.println("\nAfter Merging Collections:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Traverse merged collection using Iterator
        System.out.println("\nTraverse Merged Collection using Iterator:");
        Iterator<String> mergeIterator = fruits.iterator();
        while (mergeIterator.hasNext()) {
            System.out.println(mergeIterator.next());
            
        }
        
    }
}