package com.yang.oopdome.day1;

import java.util.Scanner;

//创建一个榨汁机的测试类
public class TestZhaZhiJi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        do {
            System.out.println("请放入水果");
            ZhaZhiJi ji1 = new ZhaZhiJi();//调用榨汁的方法
            String shuiguo = input.next();
            //返回的值用相同类型的数据类型接受
            //方法调用处，参数叫做实际参数，也叫实参
            //实参敏子也可以随便取，但是要遵循驼峰命名规则，同时也要有意义
            //实参和形参数据类型必须一致，名字可以一致，也可以不一致
            //方法有没有返回值和方法有没有参数，没有任何关系
            //方法参数可以有一个也可以有多个，多个参数中间用英文的逗号隔开（形参和实参都是这样）
            //形参和实参的数量一定要一直，数据类型要一致，顺序要也要一直
            System.out.println("您要几杯？");
            int num=input.nextInt();
            String zhi = ji1.zhazhi(num,shuiguo);
            System.out.println(zhi);
            System.out.println("是否继续榨汁（y/n）？");
            answer=input.next();
        }while (answer.equals("y"));
        System.out.println("谢谢使用！");
    }
}

