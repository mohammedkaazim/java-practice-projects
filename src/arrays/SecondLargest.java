package arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {15, 8, 25, 40, 30};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second Largest Element: " + second);
    }
}
