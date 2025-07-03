package collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("LinkedList of Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
