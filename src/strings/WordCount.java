package strings;

public class WordCount {
    public static void main(String[] args) {
        String str = "Java is a powerful language";

        String[] words = str.split(" ");
        System.out.println("Total Words: " + words.length);
    }
}
