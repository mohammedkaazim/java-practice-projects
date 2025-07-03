package exceptions;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 5 / 1;
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block always runs");
        }
    }
}
