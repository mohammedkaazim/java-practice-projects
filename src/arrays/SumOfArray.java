package arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of Array Elements: " + sum);
    }
}
