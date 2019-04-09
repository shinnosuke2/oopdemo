package com.yang.oopdome.day5;

import java.util.Scanner;

public class TuZiTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入月份：");
        int n = input.nextInt();
        TuZi a = new TuZi();
        int rs = a.diGui(n);
        System.out.println(rs);
    }
}