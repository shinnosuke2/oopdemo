package com.yang.oopdome.day6;

public class Test4 {

    public static void main(String[] args) {

    }
}

class MyStatic {
    static int i;
    int n;

    static void f() {

        MyStatic.i++;
        new MyStatic().n++;
    }

    void f1() {
        MyStatic.i++;
        this.n++;
    }

    static {  //一个一个类一生只能执行一次，在类加载的时候
        System.out.println("static");
        i++;
        new MyStatic().n++;
        System.out.println("我只会执行一次");
    }

    {  //每创建一个次对象就执行一次
        i++;
        n++;
        System.out.println("你new对象我就执行");
        System.out.println(i);
    }

    static class MyNode {

    }

    public static void main(String[] args) {
        new MyStatic.MyNode();
        MyStatic a1 = new MyStatic();
        System.out.println("222222222222222222222222222222222");
        MyStatic a2 = new MyStatic();
        a1.f();
        a2.f();
        System.out.println(a1.i + "\t" + a1.n);
        System.out.println(a2.i + "\t" + a2.n);
        System.out.println(MyStatic.i + "\t"); // MyStatic.n 不正确，n是对象的需要通过对象的引用才可访问
        System.out.println("-------------------------------");
    }
}

