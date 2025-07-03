package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> marks = new TreeMap<>();

        marks.put("Alice", 85);
        marks.put("Bob", 92);
        marks.put("Charlie", 78);

        System.out.println("Student Marks (Sorted by Name):");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
