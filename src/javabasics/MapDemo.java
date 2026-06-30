package javabasics;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        // Create a HashMap
        Map<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(101, "Niel");
        students.put(102, "Soham");
        students.put(103, "Swara");
        students.put(104, "Vaidehi");
        students.put(105, "Mugdha");

        // Display Map
        System.out.println("Student Map:");
        System.out.println(students);

        // Get value using key
        System.out.println("\nStudent with ID 103: " + students.get(103));

        // Check if key exists
        System.out.println("Contains key 104? " + students.containsKey(104));

        // Check if value exists
        System.out.println("Contains value 'Niel'? " + students.containsValue("Niel"));

        // Remove an entry
        students.remove(102);

        System.out.println("\nAfter removing ID 102:");
        System.out.println(students);

        // Traverse using entrySet()
        System.out.println("\nTraversing Map:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }
    }
}