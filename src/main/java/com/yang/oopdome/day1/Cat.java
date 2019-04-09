package com.yang.oopdome.day1;
//猫咪属性
public class Cat {
    String name;
    int age;
    int love;
    //一个类中允许出现多个同名但不同参数的方法，这种方法叫做方法重载
    /*构造方法
    该方法没有返回值
    该方法名字必须和类名相同
    每个类都有一个默认无参构造方法，但一旦手动添加了带参构造方法，那么系统默认的无参构造方法就被覆盖了，你想使用，必须显示的写出来。
    */
    public Cat(){
        //默认的无参构造方法
    }
    public Cat(String name,int age,int love){
        this.name=name;
        this.age=age;
        this.love=love;

    }
    public void showInfo(){
        System.out.println("姓名:"+name+"\n年龄:"+age+"\n亲密度:"+love);
    }
}
