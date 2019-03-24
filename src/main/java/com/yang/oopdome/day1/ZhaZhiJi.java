package com.yang.oopdome.day1;
//创建一个榨汁机的类
public class ZhaZhiJi {
    //定义一个方法：榨汁
    //方法定义处，参数叫做形式参数，也叫形参（主要约束参数的类型的）
    //形参名字可以随便取，但是要符合驼峰命名规则，同时要有意义。
    public String zhazhi(int num,String friut){
        String zhi=num+"杯"+friut+"汁";

        return zhi;
    }
}
