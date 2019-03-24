package com.yang.oopdome.day1;
//传建一个老师类
public class teacher {

    //定义老师累的属性
    String name;
    String zhuanye;
    String kecheng;
    int jiaoling;
    public void show(){//void没有返回结果
        System.out.println("姓名："+name);
        System.out.println("专业方向:"+zhuanye);
        System.out.println("所授课程:"+kecheng);
        System.out.println("教龄:"+jiaoling+"年");

    }
}
