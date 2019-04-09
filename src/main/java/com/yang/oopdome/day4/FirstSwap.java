package com.yang.oopdome.day4;

public class FirstSwap {
    public static void main(String[] args) {
        int a = 5, b = 8;
        System.out.println("a=" + a + ",b=" + b);
        System.out.println("--------------");
        //swap
        swap(a, b);
        System.out.println("a=" + a + ",b=" + b);
        //说明没有交换的原因
    }

    private static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println(a + "   " + b);
    }
}