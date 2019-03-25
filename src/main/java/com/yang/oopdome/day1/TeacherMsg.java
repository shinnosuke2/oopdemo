package com.yang.oopdome.day1;
//教师信息管理
public class TeacherMsg {
    String[] teachers=new String[30];
    public void addName(String name){
        for (int i=0;i<teachers.length;i++){
            if (teachers[i]==null){
                teachers[i]=name;
                break;
            }
        }

    }
    public void searchName(int start,int end,String name){
        boolean flag=false;
        for (int i=start-1;i<end;i++){

            if (teachers[i].equals(name)){
                flag=true;
            }
        }
        if (flag){
            System.out.println("找到了！");
        }else {
            System.out.println("没找到！");
        }

    }
    public void showName(){
        for (int i=0;i<teachers.length;i++){
            if (teachers[i]!=null){
                System.out.println(teachers[i]);
            }

        }
    }

}
