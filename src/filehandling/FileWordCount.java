package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWordCount {
    public static void main(String[] args) {
        int wordCount = 0;

        try {
            File file = new File("output.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                sc.next();
                wordCount++;
            }
            sc.close();

            System.out.println("Total words in file: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
