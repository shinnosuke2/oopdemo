package com.yang.oopdome.day4;

public class SecondSwap {
    public static void main(String[] args) {
        MyNum a = new MyNum();
        a.n = 5;
        MyNum b = new MyNum();
        b.n = 8;
        System.out.println("a=" + a + ",b=" + b);
        System.out.println("----------------");
        swap(a, b);
        System.out.println("a=" + a + ",b=" + b);
        //说明上面代码的原因
    }

    private static void swap(MyNum a, MyNum b) {
        int tmp = a.n;
        a.n = b.n;
        b.n = tmp;
    }

}
