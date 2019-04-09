package com.yang.oopdome.day1;

import java.util.Scanner;

public class Park {
    Scanner input = new Scanner(System.in);
    String name;
    int age;
    String answer;
    public void free() {
        do {System.out.print("请输入姓名：");
            name = input.next();
            System.out.print("请输入年龄：");
            age = input.nextInt();
            while (age < 0) {
                System.out.println("请输入正确年龄：");
                age = input.nextInt();
            }
            if (age > 18) {
                System.out.println(name + "的年龄为：" + age + "岁，" + "门票价格为：20元");
                System.out.println("");
            } else {
                System.out.println(name + "的年龄为：" + age + "岁，" + "门票免费");
                System.out.println("");
            }
            System.out.println("是否继续订票（y/n）?");
            answer=input.next();
        }while(answer.equals("y"));
        System.out.println("谢谢惠顾！");

    }


}
