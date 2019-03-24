package com.yang.oopdome.day1;

import java.util.Scanner;

public class PasswdTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Passwd a=new Passwd();
        a.name="admin";
        a.key="111111";
        System.out.println("请输入用户名：");
        String name=input.next();
        System.out.println("请输入密码：");
        String key=input.next();
        a.pwd=key;
        a.changePasswd();
    }
}
