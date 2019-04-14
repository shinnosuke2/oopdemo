package com.yang.oopdome.day6;

import java.util.Scanner;

//企鹅的属性封装测试类
public class TestPenguin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Penguin p = new Penguin();
        System.out.println("欢迎来到宠物店！");
        System.out.print("请输入要领养宠物的名字：");
        p.setName(input.nextLine());
        System.out.print("请选企鹅性别（1.Q仔，2.Q妹）");
        p.setSex(input.nextLine());
        System.out.print("请输入企鹅的健康值：");
        p.setHealth(Integer.parseInt(input.nextLine()));//解析字符串为整型数字
        System.out.print("请设置亲密度：");
        p.setLove(Integer.parseInt(input.nextLine()));
        p.show();

    }
}
