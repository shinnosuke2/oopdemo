package com.yang.oopdome.day3;

import java.util.Scanner;

public class TestDiGui {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("输入月份：");
        int b=input.nextInt();
        DiGui a=new DiGui();
        System.out.println(a.diGui(b));

    }
}
