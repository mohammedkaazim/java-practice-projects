package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppendExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt", true);
            writer.write("\nThis line is appended.");
            writer.close();
            System.out.println("Data appended to file.");
        } catch (IOException e) {
            System.out.println("Error appending to file.");
        }
    }
}
