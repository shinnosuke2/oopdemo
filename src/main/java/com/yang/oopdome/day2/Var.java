package com.yang.oopdome.day2;
//成员变量（全局变量）和局部变量
public class Var {
    //属性
    int age;
    String name;
    //成员方法
    public void method(){
        //局部变量
        int num=1;
        System.out.println(num);
    }
    public void method2(){
        System.out.println(age);
    }
    public void method3(){
        int num2=100;
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
