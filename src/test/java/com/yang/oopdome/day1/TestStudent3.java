package com.yang.oopdome.day1;

public class TestStudent3 {
    public static void main(String[] args) {
        Method test=new Method();
        int n=8;
        test.num1(n);
        Student3 stu=new Student3();
        stu.age=19;
        test.num2(stu);
        System.out.println(n+"---------"+stu.age);
        //当参数传递为基本数据类型的时候，参数变化不保留,基本数据类型传的是值
        //单参数传递为引用数据类型的时候，参数变化会保留，引用数据类型传的是地址。

    }
}
