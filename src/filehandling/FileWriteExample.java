package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("This is a test file.\nJava File Handling Example.");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
