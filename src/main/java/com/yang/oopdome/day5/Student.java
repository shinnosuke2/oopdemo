package com.yang.oopdome.day5;

public class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student() {

    }

    public Student(int score) {

        this.score=score;
    }

    public Student(String name) {

        this.name = name;
    }
}
