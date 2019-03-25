package com.yang.oopdome.day1;

import java.util.Scanner;

//测试类
public class TestStudentMsg {
    public static void main(String[] args) {
        StudentMsg st=new StudentMsg();
        Scanner input=new Scanner(System.in);
        //插入了五名学生的姓名
        for (int i=0;i<5;i++){
            System.out.print("请输入学生姓名：");
            String newName=input.next();
            st.addName(newName);
        }
        //显示学员的姓名信息
        st.showName();
        //在特定区间差查找特定学员
        System.out.println("请输入开始查找的位置：");
        int start=input.nextInt();
        System.out.println("请输入结束的位置：");
        int end=input.nextInt();
        System.out.println("请输入要查找的学员的姓名：");
        String name=input.next();
        System.out.println("查找结果");
        boolean flag=st.searchName(start,end,name);
        if (flag){
            System.out.println("找到了！");
        }else {
            System.out.println("没有找到！");
        }

    }
}
