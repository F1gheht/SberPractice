package main.java.students;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int age;
    private int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }
}

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Ivan", 18, 1),
                new Student("Petr", 19, 1),
                new Student("Anna", 20, 2),
                new Student("Olga", 21, 2),
                new Student("Max", 22, 3)
        );

        Map<Integer, Double> result = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getCourse,
                        Collectors.averagingInt(Student::getAge)
                ));

        System.out.println(result);
    }
}