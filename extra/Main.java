package string;


import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    double marks;

    Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + getGrade());
        System.out.println("----------------------");
    }

    String getGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 40)
            return "D";
        else
            return "Fail";
    }
}

public class Main {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Add student
    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        if (findStudent(id) != null) {
            System.out.println("Student ID already exists!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        if (age <= 0 || marks < 0 || marks > 100) {
            System.out.println("Invalid age or marks!");
            return;
        }

        students.add(new Student(id, name, age, marks));

        System.out.println("Student added successfully!");
    }

    // View all students
    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found!");
            return;
        }

        for (Student s : students) {
            s.displayDetails();
        }
    }

    // Find student by ID
    static Student findStudent(int id) {
        for (Student s : students) {
            if (s.id == id) {
                return s;
            }
        }
        return null;
    }

    // Search student
    static void searchStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        Student s = findStudent(id);

        if (s != null) {
            s.displayDetails();
        } else {
            System.out.println("Student not found!");
        }
    }

    // Update student
    static void updateStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        Student s = findStudent(id);

        if (s != null) {
            sc.nextLine();

            System.out.print("Enter New Name: ");
            s.name = sc.nextLine();

            System.out.print("Enter New Age: ");
            int age = sc.nextInt();

            System.out.print("Enter New Marks: ");
            double marks = sc.nextDouble();

            if (age <= 0 || marks < 0 || marks > 100) {
                System.out.println("Invalid age or marks!");
                return;
            }

            s.age = age;
            s.marks = marks;

            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    // Delete student
    static void deleteStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        Student s = findStudent(id);

        if (s != null) {
            students.remove(s);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    // Display marks and grades
    static void displayGrades() {
        for (Student s : students) {
            System.out.println(
                "Name: " + s.name +
                " | Marks: " + s.marks +
                " | Grade: " + s.getGrade()
            );
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Marks and Grades");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    displayGrades();
                    break;

                case 7:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

