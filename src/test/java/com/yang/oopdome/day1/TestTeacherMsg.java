package com.yang.oopdome.day1;

import java.util.Scanner;

public class TestTeacherMsg {
    public static void main(String[] args) {
        TeacherMsg t=new TeacherMsg();
        Scanner input=new Scanner(System.in);

        for (int i=0;i<5;i++){
            System.out.println("请输入教师姓名：");
            String name=input.next();
            t.addName(name);
        }

        t.showName();
        System.out.println("请输入查找开始的位置：");
        int start=input.nextInt();
        System.out.println("请输入结束位置：");
        int end=input.nextInt();
        System.out.println("请输入学生姓名：");
        String name=input.next();
        System.out.println("××××××××查找结果如下×××××××××");
        t.searchName(start,end,name);

    }
}
