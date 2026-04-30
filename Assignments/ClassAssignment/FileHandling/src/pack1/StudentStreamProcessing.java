package pack1;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class StudentStreamProcessing {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(1, "Suman", 85.5),
            new Student(2, "Rahul", 58.0),
            new Student(3, "Sneha", 72.0),
            new Student(4, "Amit", 45.5)
        );

        List<Student> highMarksStudents = students.stream()
            .filter(s -> s.getMarks() > 60)
            .collect(Collectors.toList());

        List<String> upperCaseNames = students.stream()
            .map(s -> s.getName().toUpperCase())
            .collect(Collectors.toList());

        double averageMarks = students.stream()
            .mapToDouble(Student::getMarks)
            .average()
            .orElse(0.0);

        students.forEach(s -> System.out.println(s));
        
        System.out.println(highMarksStudents);
        System.out.println(upperCaseNames);
        System.out.println(averageMarks);
    }
}