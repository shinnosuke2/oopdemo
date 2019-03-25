package com.yang.oopdome.day1;
//实现学员信息的管理
public class StudentMsg {
    //增加学生姓名

    String[] names=new String[30];//学员姓名数组
    //增加学生姓名,参数name需要添加的学员姓名
    public void addName(String name){
        for (int i=0;i<names.length;i++){
           if (names[i]==null){
               names[i]=name;
               break;
           }

        }

    }
    //查找特定区间某个学生的信息
    //start开始查找位置 end结束查找位置 查找学生的姓名name
    public boolean searchName(int start,int end,String name) {
        boolean flag = false;//标识是否查找到特定的学员，false没查到 true查到了
        for (int i = start - 1;i<end; i++){
            if (names[i].equals(name)) {
                flag = true;
                break;
            }
        }
        return flag;

    }
    //显示学员姓名
    public void showName(){
        System.out.println("学员列表：");
        for (int i=0;i<names.length;i++){
            if (names[i]!=null){
                System.out.print(names[i]+"\t");

            }
        }

    }

}
