package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedFileRead {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt"); // Add a sample.txt file in your project
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file path.");
        }
    }
}
