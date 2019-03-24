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
            String zhi = ji1.zhazhi(shuiguo);//返回的值用相同类型的数据类型接受
            System.out.println(zhi);
            System.out.println("是否继续榨汁（y/n）？");
            answer=input.next();
        }while (answer.equals("y"));
        System.out.println("谢谢使用！");
    }
}

