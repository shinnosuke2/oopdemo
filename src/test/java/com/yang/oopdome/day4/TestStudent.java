package com.yang.oopdome.day4;

import com.yang.oopdome.day3.Student;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
     Student1[] stu=new Student1[2];
     stu[0]=new Student1();
     stu[0].name="zs";
     stu[0].score=55;
     stu[1]=new Student1();
     stu[1].name="ls";
     stu[1].score=66;
    for (int i=0;i<stu.length;i++){
        System.out.println(stu[i].name+"\t"+stu[i].score);
    }

    }
}
