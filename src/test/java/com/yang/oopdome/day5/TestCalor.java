package com.yang.oopdome.day5;

import java.util.Scanner;

public class TestCalor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Calor a=new Calor();
        System.out.println("请选择：1.整数加法2.小数加法。");
        int num=input.nextInt();
        if (num==1){
            System.out.println("请输入需要相加的两个整数：");
            int n=input.nextInt();
            int m=input.nextInt();
            int sum=a.add(n,m);
            System.out.println(n+"+"+m+"="+sum);
        }
        if (num==2){
            System.out.println("请输入要相加的三个小数：");
            double n=input.nextDouble();
            double m=input.nextDouble();
            double l=input.nextDouble();
            double sum=a.add(n,m,l);
            System.out.println(n+"+"+m+"+"+l+"="+sum);
        }
    }
}
