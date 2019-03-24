package com.yang.oopdome.day1;

import java.util.Scanner;

public class PasswdTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Passwd a=new Passwd();
        System.out.println("请输入用户名：");
        a.name=input.next();
        System.out.println("请输入密码：");
        a.key=input.next();
        a.changePasswd();

    }
}
