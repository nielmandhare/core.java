package javabasics;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        // Queue Example
        Queue<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Queue: " + fruits);

        // Fetch value but don't remove
        System.out.println("Peek: " + fruits.peek());
        System.out.println("Queue after peek: " + fruits);

        // Fetch value and remove
        System.out.println("Poll: " + fruits.poll());
        System.out.println("Queue after poll: " + fruits);

        // ---------------- Deque Example ----------------
        Deque<String> deque = new LinkedList<>();

        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.addLast("Cherry");

        System.out.println("\nDeque: " + deque);

        // Add elements
        deque.addFirst("Mango");
        deque.addLast("Orange");

        System.out.println("After addFirst & addLast: " + deque);

        // Remove elements
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());

        System.out.println("Final Deque: " + deque);
    }
}