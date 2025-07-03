package collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Delhi"); // Duplicate

        System.out.println("Unique Cities:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
