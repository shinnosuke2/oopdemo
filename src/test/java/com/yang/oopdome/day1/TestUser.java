package com.yang.oopdome.day1;

import java.util.Scanner;

public class TestUser {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        User u=new User();
        u.name="admin";
        u.passwd="111111";
        System.out.print("请输入用户名：" );
        String name=input.next();
        System.out.print("请输入密码：");
        String pwd=input.next();
        //判断是否用户的密码和用户名匹配
        if (name.equals(u.name)&&pwd.equals(u.passwd)){
            System.out.print("请输入新的密码：");
            String pwd2=input.next();
            u.passwd=pwd2;
            System.out.println("修改密码成功，新的密码是"+u.passwd);
        }else {
            System.out.println("用户名或密码不正确您没权限修改信息！");
        }

    }
}
