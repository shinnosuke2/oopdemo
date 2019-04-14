package com.yang.oopdome.day6;

public class TsetStudent {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("张三");
        System.out.println(student.getName());
        System.out.println(Student.num);
    }
}
