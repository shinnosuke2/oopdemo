package com.yang.oopdome.day1;
import java.util.*;
public class Passwd {
        Scanner input=new Scanner(System.in);
        String name;
        String key;
        public void changePasswd(){
            if (name.equals("admin1")&key.equals("111111")){
                System.out.println("请输入新密码：");
                key=input.next();
                System.out.println("修改密码成功，您的新密码是："+key);
            }else {
                System.out.println("用户名和密码不匹配！你没有权限更新管理员信息");
            }
        }
    }

