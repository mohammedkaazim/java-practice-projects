package studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentManagement {
    ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        students.add(new Student(name, age));
        System.out.println("Student Added Successfully!\n");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students added yet.\n");
        } else {
            System.out.println("Student List:");
            for (Student s : students) {
                System.out.println("Name: " + s.name + ", Age: " + s.age);
            }
            System.out.println();
        }
    }

    public void start() {
        while (true) {
            System.out.println("1. Add Student\n2. View Students\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> {
                    System.out.println("Exiting Program.");
                    return;
                }
                default -> System.out.println("Invalid Option.\n");
            }
        }
    }

    public static void main(String[] args) {
        new StudentManagement().start();
    }
}
