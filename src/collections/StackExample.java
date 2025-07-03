package collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();

        history.push("Google.com");
        history.push("YouTube.com");
        history.push("GitHub.com");

        System.out.println("Current Page: " + history.peek());
        history.pop();
        System.out.println("After Back Button, Current Page: " + history.peek());
    }
}
