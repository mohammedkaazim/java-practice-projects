package oops;

public class BillingSystem {

    public double calculateTotal(double price, int quantity, double taxPercent) {
        double subtotal = price * quantity;
        double tax = subtotal * (taxPercent / 100);
        return subtotal + tax;
    }

    public static void main(String[] args) {
        BillingSystem bill = new BillingSystem();
        double total = bill.calculateTotal(150.0, 3, 5);
        System.out.println("Total Amount (with tax): " + total);
    }
}
