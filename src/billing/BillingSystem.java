package billing;

import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String name;
    double price;
    int quantity;

    Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }
}

public class BillingSystem {

    ArrayList<Item> items = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    final double taxRate = 0.05; // 5% Tax

    public void addItem() {
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine(); // consume newline

        items.add(new Item(name, price, quantity));
        System.out.println("Item Added Successfully!\n");
    }

    public void printBill() {
        if (items.isEmpty()) {
            System.out.println("No items in the bill.\n");
            return;
        }

        double subtotal = 0;
        System.out.println("\n------ Bill Summary ------");
        for (Item item : items) {
            System.out.println(item.name + " - " + item.quantity + " x " + item.price + " = " + item.getTotal());
            subtotal += item.getTotal();
        }

        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        System.out.println("--------------------------");
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("Tax (5%%): %.2f\n", tax);
        System.out.printf("Total Amount: %.2f\n\n", total);
    }

    public void start() {
        while (true) {
            System.out.println("1. Add Item\n2. Print Bill\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addItem();
                case 2 -> printBill();
                case 3 -> {
                    System.out.println("Exiting Billing System.");
                    return;
                }
                default -> System.out.println("Invalid Option.\n");
            }
        }
    }

    public static void main(String[] args) {
        new BillingSystem().start();
    }
}
