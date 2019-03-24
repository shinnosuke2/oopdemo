package com.yang.oopdome.day1;
//游客类
public class Visitor {
    //游客的属性 姓名 年龄
    String name;
    int age;
    String answer;
    //方法的建立 根据年龄和判断是否收取门票
    public void free(){
        if (age<10){
            System.out.println("门票免费！");
        }else if (age<60){
            System.out.println("门票全费:20元");
        }else{
            System.out.println("门票半价：10元");
        }

    }
}
