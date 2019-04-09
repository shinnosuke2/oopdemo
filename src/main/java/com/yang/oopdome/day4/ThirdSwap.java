package com.yang.oopdome.day4;

public class ThirdSwap {
    public static void main(String[] args) {
        MyNum a = new MyNum();
        a.n = 5;
        MyNum b = new MyNum();
        b.n = 8;
        System.out.println("a=" + a + ",b=" + b);
        System.out.println("----------------");
        swap2(a, b);
        System.out.println("a=" + a + ",b=" + b);
    }
    private static void swap2(MyNum a, MyNum b) {
        a = new MyNum();
        b = new MyNum();
        int tmp = a.n;
        a.n = b.n;
        b.n = tmp;
    }
}

