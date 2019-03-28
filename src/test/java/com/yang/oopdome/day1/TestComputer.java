package com.yang.oopdome.day1;
//计算器的一个测试类
import java.util.Scanner;

public class TestComputer {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入个数：");
        double num=input.nextDouble();
        System.out.println("");
        double num2=input.nextDouble();
        Computer a=new Computer();
        System.out.println(a.add(num,num2));
    }
}
