package com.yang.oopdome.day1;
//传建一个学生类
public class student {
    //给学生类创建属性
    String name;
    int age;
    String xueli;
    String school;
    public void show(){//void表示没有返回结果的方法类型，又返回值的数据类
                       // 型要加一个return；return只能接受一个值或表达式。
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("学历："+xueli);
        System.out.println("学校："+school);
    }

}
