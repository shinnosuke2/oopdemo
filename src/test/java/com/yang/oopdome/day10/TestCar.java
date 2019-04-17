package com.yang.oopdome.day10;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎来到汽车租赁公司！\n我们有如下车型可供您选择：");
        Car jiaoChe = new JiaoChe("宝马x6", "京X2345", 800);
        Car jiaoChe1 = new JiaoChe("宝马x5", "京X2344", 700);
        Car jiaoChe2 = new JiaoChe("宝马x8", "京X2343", 900);
        Car jiaoChe3 = new JiaoChe("宝马x1", "京X2342", 500);
        Car[] jiaoChes = {jiaoChe, jiaoChe1, jiaoChe2, jiaoChe3};
        KeChe keChe = new KeChe("金杯", "京D8764", 800, "16座");
        KeChe keChe1 = new KeChe("金杯", "京D8765", 1500, "32座");
        KeChe keChe2 = new KeChe("金龙", "京D8766", 1500, "32座");
        KeChe keChe3 = new KeChe("金龙", "京D8767", 800, "16座");
        KeChe[] keChes = {keChe, keChe1, keChe2, keChe3};
        for (int i = 0; i < jiaoChes.length; i++) {
            System.out.print(i + "-");
            System.out.println(jiaoChes[i]);
        }
        for (int i = 0; i < keChes.length; i++) {
            System.out.print((i + jiaoChes.length) + "-");
            System.out.println(keChes[i]);
        }

        System.out.print("请选择您要租的车的序号:");
        int choose = input.nextInt();
        System.out.print("请输入您要租的天数：");
        int days = input.nextInt();
        ZuChe zuChe=new ZuChe();
        Car car2=zuChe.xuanChe(choose);
        if (choose <= 4) {
            System.out.println("您选择的车辆信息为："+jiaoChes[choose]);
            System.out.println("打折后您实际要付："+car2.sum(jiaoChes,choose,days));

        } else {
            System.out.println("您选择的车辆信息为："+keChes[choose-keChes.length]);
            System.out.println("打折后您实际要付："+car2.sum(keChes,choose,days));

        }
//        ZuChe zuChe=new ZuChe();
//       Car car1=zuChe.xuanChe(choose);
//        System.out.println(car1);


    }
}
