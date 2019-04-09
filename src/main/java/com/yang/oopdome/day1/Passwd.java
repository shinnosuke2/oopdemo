package com.yang.oopdome.day1;
import java.util.*;
public class Passwd {
        Scanner input=new Scanner(System.in);
        String name;
        String key;
        String pwd;
        public void changePasswd(){
            if (name.equals(name)&key.equals(pwd)){
                System.out.println("请输入新密码：");
                pwd=input.next();
                System.out.println("修改密码成功，您的新密码是："+pwd);
            }else {
                System.out.println("用户名和密码不匹配！你没有权限更新管理员信息");
            }
        }
    }

