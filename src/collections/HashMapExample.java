package collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> countryCodes = new HashMap<>();

        countryCodes.put("India", "+91");
        countryCodes.put("USA", "+1");
        countryCodes.put("UK", "+44");

        System.out.println("Country Codes:");
        for (String country : countryCodes.keySet()) {
            System.out.println(country + " : " + countryCodes.get(country));
        }
    }
}
