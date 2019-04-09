package com.yang.oopdome.day4;

import java.util.Arrays;

public class StudentManager {
    String[] names=new String[0];
    public void saveName(String name){
        names= Arrays.copyOf(names,names.length+1);
        names[names.length-1]=name;
        int length=16;
        int count=0;

    }
public boolean findName(String name,int from,int to){

        for (int i=from;i<to;i++){
            if (names[i].equals(name)){
                return true;
            }

        }
        return false;
}

    public static void main(String[] args) {
        StudentManager stu=new StudentManager();
        stu.saveName("张三");
        stu.saveName("李四");
        stu.saveName("王五");
        stu.saveName("赵柳");
        System.out.println(Arrays.toString(stu.names));
        if (stu.findName("张三",1,4)){
            System.out.println("找到了");
        }else {
            System.out.println("没找到" );
        }

    }
}
