package arrays;

import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(target + " found in the array.");
        else
            System.out.println(target + " not found.");
    }
}
