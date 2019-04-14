package com.yang.oopdome.day6;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    static int num=100;
    static {
        num+=100;
        System.out.println(num);

    }
    static {
        num+=100;
        System.out.println(num);
    }
}
