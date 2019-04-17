package com.yang.oopdome.day9;
//父类
public abstract class Base {
    public Base(){
        System.out.println("父类无参构造方法");
    }


}
class Sub extends Base{
    public Sub(){
        System.out.println("子类无参构造方法");
    }


}