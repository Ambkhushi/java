import java.io.*;
import java.util.Scanner;


class Student {
    private String name;
    private int rollNumber;
    private double marks;


    // Constructor
    public Student(String name, int rollNumber, double marks) {
this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }


    // Getter and Setter methods
    public String getName() {
        return name;
    }


    public void setName(String name) {
this.name = name;
    }


    public int getRollNumber() {
        return rollNumber;
    }


    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }


    public double getMarks() {
        return marks;
    }


    public void setMarks(double marks) {
        this.marks = marks;
    }


    // Polymorphism: Calculate grade method
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}


class GraduateStudent extends Student {
    // Additional attributes for GraduateStudent can be added here


    // Constructor
    public GraduateStudent(String name, int rollNumber, double marks) {
        super(name, rollNumber, marks);
    }


    // Polymorphism: Override calculateGrade method for GraduateStudent
    @Override
    public char calculateGrade() {
        // Custom implementation for GraduateStudent grading, if needed
        // For simplicity, let's just use the same grading as Student class
        return super.calculateGrade();
    }
}


public class StudentManagementSystem {
    public static void main(String[] args) {
        // Example of using the Student and GraduateStudent classes
        Student student1 = new Student("John Doe", 101, 85.5);
        GraduateStudent gradStudent1 = new GraduateStudent("Jane Smith", 201, 92.0);


        // Displaying information and grades
        System.out.println("Student 1: " + student1.getName() +
                ", Roll Number: " + student1.getRollNumber() +
                ", Marks: " + student1.getMarks() +
                ", Grade: " + student1.calculateGrade());


        System.out.println("Graduate Student 1: " + gradStudent1.getName() +
                ", Roll Number: " + gradStudent1.getRollNumber() +
                ", Marks: " + gradStudent1.getMarks() +
                ", Grade: " + gradStudent1.calculateGrade());


        // File I/O
        writeStudentToFile(student1, "student1.txt");
        Student readStudent = readStudentFromFile("student1.txt");
        if (readStudent != null) {
            System.out.println("Read from file: " + readStudent.getName() +
                    ", Roll Number: " + readStudent.getRollNumber() +
                    ", Marks: " + readStudent.getMarks());
        }


        // Exception Handling: Invalid data input example
        try {
            Student invalidStudent = new Student("Invalid", -1, 110); // Invalid roll number and marks
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        try {
            Student nonExistingStudent = readStudentFromFile("nonExistingFile.txt");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // File I/O: Write student details to a file
    private static void writeStudentToFile(Student student, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(student.getName());
            writer.println(student.getRollNumber());
            writer.println(student.getMarks());
        } catch (IOException e) {
            System.out.println("Exception while writing to file: " + e.getMessage());
        }
    }


    // File I/O: Read student details from a file
    private static Student readStudentFromFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            String name = scanner.nextLine();
            int rollNumber = Integer.parseInt(scanner.nextLine());
            double marks = Double.parseDouble(scanner.nextLine());
            return new Student(name, rollNumber, marks);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception while reading from file: " + e.getMessage());
        }
        return null;
    }
}