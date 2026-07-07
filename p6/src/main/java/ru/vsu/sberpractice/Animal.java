package ru.vsu.sberpractice;

public class Animal {
    private String name;
    private int age;
    private String color;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}