import java.util.ArrayList;
import java.util.Scanner;

// Student class to hold the details of each student
class StudentmanagementSystem {
    private int id;
    private String name;
    private int age;
    private String course;

    // Constructor to initialize student details
    public StudentmanagementSystem(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters for Student information
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    // Function to display student information
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

// Main class with menu-driven program
public class  kajal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentmanagementSystem> students = new ArrayList<>(); // List to store students

        int choice;

        do {
            // Display menu options
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add a new student
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Course Name: ");
                    String course = sc.nextLine();

                    // Create and add student object
                    students.add(new StudentmanagementSystem(id, name, age, course));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    // Display all students
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (StudentmanagementSystem student : students) {
                            student.displayInfo();
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select again.");
            }
        } while (choice != 3);

        sc.close();
    }
}

    
