package main.java.substrings;

import java.util.Arrays;
import java.util.List;

public class Substrings {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Java",
                "Python",
                "java core",
                "C++",
                "JavaScript",
                "I love java"
        );

        list.stream()
                .filter(s -> s.toLowerCase().contains("java"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}