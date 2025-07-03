package strings;

public class CharCount {
    public static void main(String[] args) {
        String str = "Java Programming";
        str = str.toLowerCase();

        int[] count = new int[26];

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }

        System.out.println("Character Occurrence:");
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0)
                System.out.println((char) (i + 'a') + " : " + count[i]);
        }
    }
}

