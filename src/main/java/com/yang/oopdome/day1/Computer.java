package com.yang.oopdome.day1;
//方法重载
public class Computer {
    //加法运算
    public  double add(double num1,double num2){//形参方法
        return num1+num2;
    }
    public  int add(int num1,int num2){
        return num1+num2;
    }
    public double add(double num1,double num2,double num3){
        return num1+num2+num3;
    }
}
