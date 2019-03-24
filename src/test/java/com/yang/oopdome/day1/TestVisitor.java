package com.yang.oopdome.day1;

import java.util.Scanner;

// 实现景区的收费系统
public class TestVisitor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Visitor v=new Visitor();
        do {
            System.out.println("请输入姓名：");
            v.name=input.next();
            System.out.println("请输入年龄：");
            v.age=input.nextInt();
            v.free();
            System.out.println("是否继续（y/n）?");
            v.answer=input.next();
        }while(v.answer.equals("y"));
        System.out.println("退出程序！");
    }
}
