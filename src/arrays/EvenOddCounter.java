package arrays;

public class EvenOddCounter {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 7, 10, 12, 15, 18};

        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Total Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);
    }
}
