package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> tickets = new LinkedList<>();

        tickets.add("Person 1");
        tickets.add("Person 2");
        tickets.add("Person 3");

        System.out.println("Serving: " + tickets.poll());
        System.out.println("Next in Queue: " + tickets.peek());
    }
}
